package website.copyandpaste.bottombarnavigationwithnavigationdrawer;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by root on 11/9/17.
 */

public class campus extends AppCompatActivity implements hostel.OnFragmentInteractionListener,hostel3.OnFragmentInteractionListener,hostel4.OnFragmentInteractionListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_campus_content);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout5);
        tabLayout.addTab(tabLayout.newTab().setText("Hostel"));
        tabLayout.addTab(tabLayout.newTab().setText("About Library"));
        tabLayout.addTab(tabLayout.newTab().setText("Support Facilities"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager5);
        final hostel_campus_pageAdapter adapter = new hostel_campus_pageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
