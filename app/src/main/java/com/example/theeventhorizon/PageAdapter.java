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
    public Fragment getItem(int i) {
        switch (i) {

            case 1 :
                SpaceTab spaceTab = new SpaceTab();
                return spaceTab;
            case 2 :
                APODTab apodTab = new APODTab();
                return apodTab;
            case 3 :
                SpaceXTab spaceXTab = new SpaceXTab();
                return spaceXTab;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return countTab;
    }
}
