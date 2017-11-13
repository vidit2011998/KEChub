package website.copyandpaste.bottombarnavigationwithnavigationdrawer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by root on 11/12/17.
 */

public class PageAdapter extends FragmentStatePagerAdapter {
    int mNoOfTabs;
    public PageAdapter(FragmentManager fm,int NumberOfTabs){
        super(fm);
        this.mNoOfTabs=NumberOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Fragment1 tab1 = new Fragment1();
                return tab1;

            case 1:
                Fragment2 tab2 = new Fragment2();
                return tab2;

            case 2:
                Fragment3 tab3 = new Fragment3();
                return tab3;

            case 3:
                Fragment4 tab4 = new Fragment4();
                return tab4;

            case 4:
                Fragment5 tab5 = new Fragment5();
                return tab5;

            case 5:
                Fragment6 tab6 = new Fragment6();
                return tab6;

            case 6:
                Fragment7 tab7 = new Fragment7();
                return tab7;

            case 7:
                Fragment8 tab8 = new Fragment8();
                return tab8;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
