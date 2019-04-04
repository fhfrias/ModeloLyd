package com.petroprix.appmodlyd.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.petroprix.appmodlyd.fragment.FragmentAjustes;
import com.petroprix.appmodlyd.fragment.FragmentCuenta;
import com.petroprix.appmodlyd.fragment.FragmentHistorial;
import com.petroprix.appmodlyd.fragment.FragmentMapa;
import com.petroprix.appmodlyd.fragment.FragmentTransfer;

public class MyPagerAdapter extends FragmentStatePagerAdapter {

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment;
        switch (i){
            case 0: fragment = new FragmentTransfer();
                    break;
            case 1: fragment = new FragmentHistorial();
                    break;
            case 2: fragment = new FragmentCuenta();
                    break;
            case 3: fragment = new FragmentMapa();
                    break;
            case 4: fragment = new FragmentAjustes();
                    break;
            default: fragment = null;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
