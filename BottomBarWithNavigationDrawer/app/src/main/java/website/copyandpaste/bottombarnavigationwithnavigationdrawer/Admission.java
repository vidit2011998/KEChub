package website.copyandpaste.bottombarnavigationwithnavigationdrawer;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by root on 11/9/17.
 */

public class Admission extends AppCompatActivity implements Fragment9.OnFragmentInteractionListener,Fragment10.OnFragmentInteractionListener,Fragment11.OnFragmentInteractionListener,Fragment12.OnFragmentInteractionListener,Fragment13.OnFragmentInteractionListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_admission);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout2);
        tabLayout.addTab(tabLayout.newTab().setText("Admission Overview"));
        tabLayout.addTab(tabLayout.newTab().setText("Courses Offered"));
        tabLayout.addTab(tabLayout.newTab().setText("Admission Procedure"));
        tabLayout.addTab(tabLayout.newTab().setText("Instructions"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager2);
        final PageAdapter2 adapter = new PageAdapter2(getSupportFragmentManager(), tabLayout.getTabCount());
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
