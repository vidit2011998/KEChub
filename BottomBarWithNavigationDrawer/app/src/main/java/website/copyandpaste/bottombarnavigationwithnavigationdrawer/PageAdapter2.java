package website.copyandpaste.bottombarnavigationwithnavigationdrawer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by root on 11/12/17.
 */

public class PageAdapter2 extends FragmentStatePagerAdapter {
    int mNoOfTabs;
    public PageAdapter2(FragmentManager fm,int NumberOfTabs){
        super(fm);
        this.mNoOfTabs=NumberOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Fragment9 tab1 = new Fragment9();
                return tab1;

            case 1:
                Fragment10 tab2 = new Fragment10();
                return tab2;

            case 2:
                Fragment11 tab3 = new Fragment11();
                return tab3;

            case 3:
                Fragment12 tab4 = new Fragment12();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
