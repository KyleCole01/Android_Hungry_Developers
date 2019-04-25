package com.example.android_hungry_developers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spoon spoon1 = new Spoon(1);
        Spoon spoon2 = new Spoon(2);
        Spoon spoon3 = new Spoon(3);
        Spoon spoon4 = new Spoon(4);
        Spoon spoon5 = new Spoon(5);
        Developer developer1 = new Developer(spoon1,spoon5,1);
        Developer developer2 = new Developer(spoon2,spoon1,2);
        Developer developer3 = new Developer(spoon3,spoon2,3);
        Developer developer4 = new Developer(spoon4,spoon3,4);
        Developer developer5 = new Developer(spoon5,spoon4,5);
        ArrayList<Developer> developers = new ArrayList<>();
        developers.add(developer1);
        developers.add(developer2);
        developers.add(developer3);
        developers.add(developer4);
        developers.add(developer5);

        for(Developer developer:developers){
            new Thread(developer).start();
        }






    }
}
