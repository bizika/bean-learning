package com.tan.beanlearning.service.impl;

import com.tan.beanlearning.CarConfig;
import com.tan.beanlearning.service.ICar;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class QQCarTest {

    @Test
    public void drive() {
        ApplicationContext context  =   new AnnotationConfigApplicationContext(CarConfig.class);
        ICar car = (ICar) context.getBean("laoSiJi");
        car.drive();
    }
}