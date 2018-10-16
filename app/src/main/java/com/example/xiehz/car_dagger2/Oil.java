package com.example.xiehz.car_dagger2;

import javax.inject.Inject;
public abstract class Oil {

    int capacity;
    float value;
    String name;
//    @Inject  module方式实例化
    public Oil(){
        this.capacity = 6;
        this.value = 0;
    }


    public void add(){
        this.value += 0.1;
    }

    public String getName(){
        return name;
    }
}
