package com.example.xiehz.car_dagger2;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;


@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface CarScope {
}
