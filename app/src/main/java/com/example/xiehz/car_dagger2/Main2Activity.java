package com.example.xiehz.car_dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class Main2Activity extends AppCompatActivity {

    @CarQualifier
    @Inject
    Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        GasStationComponent gasStationComponent_0 = DaggerGasStationComponent.builder().build();
        Oil oil92 = gasStationComponent_0.get92();

        GasStationComponent gasStationComponent = DaggerGasStationComponent.builder().build();
        Oil oil = gasStationComponent.get92();


        AppComponent appComponent = DaggerAppComponent.builder()
                .gasStationComponent(gasStationComponent_0).build();
        appComponent.inject(this);

        gasStationComponent_0.inject(car);
    }
}
