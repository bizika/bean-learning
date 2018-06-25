package com.tan.beanlearning.service.impl;

import com.tan.beanlearning.service.ICar;

/**
 * @author 601091
 * @date 2018/6/25
 */
public class BenZCar implements ICar {
    @Override
    public void drive() {
        System.out.println("BenZ");
    }
}
