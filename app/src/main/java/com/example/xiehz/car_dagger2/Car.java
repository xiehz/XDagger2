package com.example.xiehz.car_dagger2;

import javax.inject.Inject;

public class Car {
    @Inject
    Oil oil;
//    @Inject  带参数构造函数
    public Car(/*Oil oil*/){
//        this.oil = oil;
    }

    public void add(){
        while (oil.value + 0.0001 < oil.capacity)
        {
            oil.add();
        }
    }
}
