package website.copyandpaste.bottombarnavigationwithnavigationdrawer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by root on 11/12/17.
 */

public class PageAdapter3 extends FragmentStatePagerAdapter {
    int mNoOfTabs;
    public PageAdapter3(FragmentManager fm,int NumberOfTabs){
        super(fm);
        this.mNoOfTabs=NumberOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Fragmenttraining1 tab1 = new Fragmenttraining1();
                return tab1;

            case 1:
                Fragmenttraining2 tab2 = new Fragmenttraining2();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
