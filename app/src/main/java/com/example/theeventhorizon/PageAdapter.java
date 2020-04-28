package com.example.theeventhorizon;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PageAdapter extends FragmentStatePagerAdapter {
    int countTab;

    public PageAdapter(FragmentManager fm, int countTab) {
        super (fm);
        this.countTab = countTab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {

            case 0 :
                SpaceTab spaceTab = new SpaceTab();
                return spaceTab;
            case 1 :
                APODTab apodTab = new APODTab();
                return apodTab;
            case 2 :
                SpaceXTab spaceXTab = new SpaceXTab();
                return spaceXTab;
        }
        return null;
    }

    @Override
    public int getCount() {
        return countTab;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Space News";
            case 1:
                return "APOD";
            case 2:
                return "SpaceX";
        }
        return null;
    }
}
