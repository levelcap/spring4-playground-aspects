package com.levelcap.spring.playground.aspects.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.levelcap.spring.playground.aspects.bo.CustomerBo;
import com.levelcap.spring.playground.aspects.config.AppConfig;

public class App
{
    public static void main(String[] args) throws Exception
    {
        @SuppressWarnings("resource")
        ApplicationContext appContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerBo customer = (CustomerBo) appContext.getBean("customerBo");
        // customer.addCustomer();
        // customer.addCustomerReturnValue();
        // customer.addCustomerThrowException();
        customer.addCustomerAround("dcohen");
    }
}