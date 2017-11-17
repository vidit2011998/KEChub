package website.copyandpaste.bottombarnavigationwithnavigationdrawer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by root on 11/12/17.
 */

public class About_pageAdapter3 extends FragmentStatePagerAdapter {
    int mNoOfTabs;
    public About_pageAdapter3(FragmentManager fm,int NumberOfTabs){
        super(fm);
        this.mNoOfTabs=NumberOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                About_Fragment1 tab1 = new About_Fragment1();
                return tab1;

            case 1:
                About_Fragment2 tab2 = new About_Fragment2();
                return tab2;

            case 2:
                About_fragment3 tab3 = new About_fragment3();
                return tab3;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
