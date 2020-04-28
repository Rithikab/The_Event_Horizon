package com.example.theeventhorizon.ui.main;

import android.content.Context;
import android.content.SyncStatusObserver;

import androidx.annotation.Nullable;
//import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.theeventhorizon.APODTab;
//import com.example.theeventhorizon.PageAdapter;
//import com.example.theeventhorizon.R;
import com.example.theeventhorizon.R;
import com.example.theeventhorizon.SpaceTab;
import com.example.theeventhorizon.SpaceXTab;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

//    @StringRes
//    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
//    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
//        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
//        return PlaceholderFragment.newInstance(position + 1);
        switch (position) {

            case 0 :
                SpaceTab spaceTab = new SpaceTab();
                return PlaceholderFragment.newInstance(getItemPosition(spaceTab));
            case 1 :
                APODTab apodTab = new APODTab();
                return PlaceholderFragment.newInstance(getItemPosition(apodTab));
            case 2 :
                SpaceXTab spaceXTab = new SpaceXTab();
                return PlaceholderFragment.newInstance(getItemPosition(spaceXTab));
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
//
//        return PageAdapter.getPageTitle.class;

        switch (position) {
            case 0:
                return "Space News";
            case 1:
                return "APOD";
            case 2:
                return "SpaceX";
        }
        return null;
//        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }
}