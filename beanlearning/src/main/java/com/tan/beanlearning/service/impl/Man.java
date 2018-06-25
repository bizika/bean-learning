package com.tan.beanlearning.service.impl;

import com.tan.beanlearning.service.ICar;

/**
 * @author 601091
 * @date 2018/6/25
 */
public class Man {
    private ICar car;

    public Man(ICar car) {
        this.car = car;
    }

    public void work() {
        car.drive();
    }
}
