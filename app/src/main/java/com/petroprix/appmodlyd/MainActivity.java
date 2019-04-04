package com.petroprix.appmodlyd;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.petroprix.appmodlyd.adapter.MyPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getSupportActionBar().hide();

        //TAB
        tabLayout = findViewById(R.id.tabLayout);

        TabLayout.Tab tabTransfer = tabLayout.newTab();
        tabLayout.addTab(tabTransfer);

        TabLayout.Tab tabHistotial = tabLayout.newTab();
        tabLayout.addTab(tabHistotial);

        TabLayout.Tab tabCuenta = tabLayout.newTab();
        tabLayout.addTab(tabCuenta);

        TabLayout.Tab tabMapa = tabLayout.newTab();
        tabLayout.addTab(tabMapa);

        TabLayout.Tab tabAjustes = tabLayout.newTab();
        tabLayout.addTab(tabAjustes);

        //
        ViewPager viewPager = (ViewPager) findViewById(R.id.contenedor);
        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(myPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.transfer);
        tabLayout.getTabAt(1).setIcon(R.drawable.historial);
        tabLayout.getTabAt(2).setIcon(R.drawable.cuenta);
        tabLayout.getTabAt(3).setIcon(R.drawable.mapa);
        tabLayout.getTabAt(4).setIcon(R.drawable.ajustes);
    }
}
