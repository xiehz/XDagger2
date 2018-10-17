package com.example.xiehz.car_dagger2;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Subcomponent;
/*
In other words, the object graph of a subcomponent’s parent component is a subgraph
of the object graph of the subcomponent itself.
Because a subcomponent is created from within its parent,
its lifetime is strictly smaller than its parent’s.
 */

@OilScope
@Subcomponent(modules = {OilModule.class})
public interface GasStationComponent {

    @Subcomponent.Builder
    interface Builder{
        Builder OilModuleBuilder(OilModule oilModule);
        GasStationComponent build();
    }

    void inject(Car car);

    @Oil92Qualifier
    Oil get92();

    @Oil95Qualifier
    Oil get95();
}
