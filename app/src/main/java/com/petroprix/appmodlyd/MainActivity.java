package com.petroprix.appmodlyd;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        tabLayout = findViewById(R.id.tabLayout);

        TabLayout.Tab tabTransfer = tabLayout.newTab();
        tabTransfer.setIcon(R.drawable.transfer);
        tabLayout.addTab(tabTransfer);

        TabLayout.Tab tabHistotial = tabLayout.newTab();
        tabHistotial.setIcon(R.drawable.historial);
        tabLayout.addTab(tabHistotial);

        TabLayout.Tab tabCuenta = tabLayout.newTab();
        tabCuenta.setIcon(R.drawable.cuenta);
        tabLayout.addTab(tabCuenta);

        TabLayout.Tab tabMapa = tabLayout.newTab();
        tabMapa.setIcon(R.drawable.mapa);
        tabLayout.addTab(tabMapa);

        TabLayout.Tab tabAjustes = tabLayout.newTab();
        tabAjustes.setIcon(R.drawable.ajustes);
        tabLayout.addTab(tabAjustes);

    }
}
