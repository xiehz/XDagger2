package com.example.xiehz.car_dagger2;

import dagger.Component;

@Component(modules = {AppModule.class,OilModule.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
