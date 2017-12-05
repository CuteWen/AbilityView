package com.wenzl.abilityview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    AbilityView abilityMapView;
    private AbilityBean data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        abilityMapView = (AbilityView) findViewById(R.id.activity_main_ability);
    }

    public void onClick(View view) {
        Random random = new Random();
        data = new AbilityBean(random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101));
        abilityMapView.setData(data);
    }
}
