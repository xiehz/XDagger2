package com.example.xiehz.car_dagger2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.text.DecimalFormat;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.multibindings.IntoMap;

public class MainActivity extends AppCompatActivity {

    @CarQualifier
    @Inject
    Car car0;
    @CarQualifier
    @Inject
    Car car1;
    @BindView(R.id.hello)
    Button hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        GasStationComponent gasStationComponent_0 = DaggerGasStationComponent.builder().build();
        Oil oil92 = gasStationComponent_0.get92();

        GasStationComponent gasStationComponent = DaggerGasStationComponent.builder().build();
        Oil oil = gasStationComponent.get92();


        AppComponent appComponent = DaggerAppComponent.builder()
                .gasStationComponent(gasStationComponent_0).build();
        appComponent.inject(this);

        gasStationComponent_0.inject(car0);
        gasStationComponent_0.inject(car1);

        if (car0 == car1) {
            Toast.makeText(getApplicationContext(), "相同", Toast.LENGTH_LONG).show();
        }
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DecimalFormat df = new DecimalFormat("#.00");
                Snackbar.make(view, String.valueOf(df.format(car0.oil.value)), Snackbar.LENGTH_LONG)
                        .setAction("加油" + car0.oil.getName(), new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                car0.add();
                            }
                        }).show();
            }
        });

        hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }
//    @Inject
//    public void setCar(@CarQualifier/*@Named("玛莎拉蒂")*/ Car car0){
//        this.car0 = car0;
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @OnClick(R.id.hello)
    public void onViewClicked() {
    }
}
