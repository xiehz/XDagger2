package com.example.xiehz.car_dagger2;

import javax.inject.Inject;

public class Car {
    @Inject
    Oil oil;
    public Car(){

    }

    public void add(){
        while (oil.value + 0.0001 < oil.capacity)
        {
            oil.add();
        }
    }
}
