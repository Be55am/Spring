package com.wissal.config;

import com.wissal.examplebeans.FakeDataSource;
import com.wissal.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${guru.username}")
    String user;
    @Value("${guru.password}")
    String password;
    @Value("${guru.url}")
    String url;

    //for the jms
    @Value("${guru.jms.username}")
    String jmsUserName;

    @Value("${guru.jms.password}")
    String jmsPassWord;

    @Value("${guru.jms.url}")
    String jmsUrl;


    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource=new FakeDataSource();
        fakeDataSource.setName(env.getProperty("USERNAME"));
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker=new FakeJmsBroker();
        fakeJmsBroker.setUserName(jmsUserName);
        fakeJmsBroker.setPassword(jmsPassWord);
        fakeJmsBroker.setUrl(jmsUrl);

        return fakeJmsBroker;
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer=new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
