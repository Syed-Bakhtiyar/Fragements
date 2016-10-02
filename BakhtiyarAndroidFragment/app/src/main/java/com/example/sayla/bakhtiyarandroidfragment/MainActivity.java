package com.example.sayla.bakhtiyarandroidfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Fragement1.Pass {
String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn1(View view){
        getSupportFragmentManager().beginTransaction().replace(R.id.main, new Fragement1()).commit();

        Toast.makeText(MainActivity.this, "Button 1"+name, Toast.LENGTH_SHORT).show();
    }
    public void btn2(View view){
        getSupportFragmentManager().beginTransaction().replace(R.id.main, new Fragment2()).commit();
        Toast.makeText(MainActivity.this, "Button 2", Toast.LENGTH_SHORT).show();
    }
    public void btn3(View view){
        Fragement1 frag = new Fragement1();

        getSupportFragmentManager().beginTransaction().replace(R.id.main, new Bfragement3()).commit();
        Toast.makeText(MainActivity.this, "Button 3 "+name, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onlick(String name) {
        this.name=name;
    }
}
