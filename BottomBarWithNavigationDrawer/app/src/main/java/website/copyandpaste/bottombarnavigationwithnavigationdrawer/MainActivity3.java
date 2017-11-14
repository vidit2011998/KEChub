package website.copyandpaste.bottombarnavigationwithnavigationdrawer;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import website.copyandpaste.bottombarnavigationwithnavigationdrawer.Fragmenttraining1;
import website.copyandpaste.bottombarnavigationwithnavigationdrawer.Fragmenttraining2;
import website.copyandpaste.bottombarnavigationwithnavigationdrawer.Fragmenttraining2.OnFragmentInteractionListener;
import website.copyandpaste.bottombarnavigationwithnavigationdrawer.PageAdapter;
import website.copyandpaste.bottombarnavigationwithnavigationdrawer.R;

public class MainActivity3 extends AppCompatActivity implements Fragmenttraining1.OnFragmentInteractionListener, Fragmenttraining2.OnFragmentInteractionListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout2);
        tabLayout.addTab(tabLayout.newTab().setText("Placement and Finishing School Team"));
        tabLayout.addTab(tabLayout.newTab().setText("About"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager2);
        final PageAdapter3 adapter = new PageAdapter3(getSupportFragmentManager(), tabLayout.getTabCount());
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
