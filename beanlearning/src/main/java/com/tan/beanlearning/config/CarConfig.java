package com.tan.beanlearning.config;

import com.tan.beanlearning.service.ICar;
import com.tan.beanlearning.service.impl.QQCar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 601091
 * @date 2018/6/25
 */
@Configuration
public class CarConfig {

    @Bean(name = "laoSiJi")
    public ICar loaSiJi(){
        return new QQCar();
    }
}
