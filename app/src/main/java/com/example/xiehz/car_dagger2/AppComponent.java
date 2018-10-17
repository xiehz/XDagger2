package com.example.xiehz.car_dagger2;

import dagger.Component;
import dagger.Subcomponent;

@CarScope
//@Component(modules = {AppModule.class},dependencies = {GasStationComponent.class})
@Component(modules = AppModule.class)
public interface AppComponent {

    GasStationComponent.Builder gasStationComponentBuilder();
    void inject(MainActivity mainActivity);

}
