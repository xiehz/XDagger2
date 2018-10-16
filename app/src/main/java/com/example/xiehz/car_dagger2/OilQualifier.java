package com.example.xiehz.car_dagger2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@interface Oil92Qualifier {
}


@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@interface Oil95Qualifier{

}