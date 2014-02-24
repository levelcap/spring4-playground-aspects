package com.levelcap.spring.playground.aspects.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.levelcap.spring.playground.aspects.aspect.LoggingAspect;
import com.levelcap.spring.playground.aspects.bo.CustomerBo;
import com.levelcap.spring.playground.aspects.bo.impl.CustomerBoImpl;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig
{
    @Bean
    public CustomerBo customerBo()
    {
        return new CustomerBoImpl();
    }

    @Bean
    public LoggingAspect loggingAspect()
    {
        return new LoggingAspect();
    }
}