package com.azwraith.apps.des;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Dell on 10/12/2016.
 */

public class SectionPagerAdapter extends FragmentPagerAdapter {

    Fragment mFragmentA, mFragmentB, mFragmentC, mFragmentD;

    public SectionPagerAdapter(FragmentManager fm) {
        super(fm);
        mFragmentA = new MainFragment();
        mFragmentB = new MessageFragment();
        mFragmentC = new SearchFragment();
        mFragmentD = new ProfileFragment();
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return mFragmentA;
            case 1:
                return mFragmentB;
            case 2:
                return mFragmentC;
            case 3:
                return mFragmentD;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return ""; // This removes the title, as you wish
    }
}