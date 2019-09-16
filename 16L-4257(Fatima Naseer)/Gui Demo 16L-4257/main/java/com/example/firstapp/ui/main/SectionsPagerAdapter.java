package com.example.firstapp.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.firstapp.R;
import com.example.firstapp.Tab1;
import com.example.firstapp.Tab2;
import com.example.firstapp.Tab3;
import com.example.firstapp.Tab4;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                Tab1 t1=new Tab1();

                return t1;
            case 1:
                Tab2 t2=new Tab2();
                return t2;
            case 2:
                Tab3 t3=new Tab3();
                return t3;
            case 3:
                Tab4 t4=new Tab4();
                return t4;
            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return "Relative Layout";
            case 1:
                return "Constraint Layout";
            case 2:
                return "Frame Layout";
            case 3:
                return "Linear Layout";
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 4;
    }
}