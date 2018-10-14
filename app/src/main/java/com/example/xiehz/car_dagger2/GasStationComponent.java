package com.example.xiehz.car_dagger2;

import dagger.Component;
import dagger.Subcomponent;

@Subcomponent(modules = {OilModule.class})
public interface GasStationComponent {
    void inject(Car car);

    @Subcomponent.Builder
     interface  GasStationBuilder{
        GasStationBuilder gasStationBuilder(OilModule oilModule);
        GasStationComponent build();
    }
}
