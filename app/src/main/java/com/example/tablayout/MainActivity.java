package com.example.tablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // private TextView tab1,tab2,tab3,tab4,tab5;
    private ViewPager viewPager;
    private PagerViewAdaptor pagerViewAdaptor;
    private TabLayout tabLayout;
    private int[] tabicons = {

            R.drawable.ic_call_black_24dp,
            R.drawable.ic_chat_black_24dp,
            R.drawable.ic_voice_chat_black_24dp,
            R.drawable.ic_message_black_24dp,
            R.drawable.ic_visibility_black_24dp
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.fragmentcontainer);
        tabLayout = findViewById(R.id.tablayout);

        settexttabs();
        adaptorsetViewpager();


        tabselectedlistener();
        tabselectedchanger();

        setupTabIcons();
        // setimage();

    }

    private void settexttabs(){
//setting the text in tabs
        tabLayout.addTab(tabLayout.newTab().setText("Tab1"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab2"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab3"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab4"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab5"));

    }


    private void adaptorsetViewpager()
    {//setting the adapter in viewpager

        pagerViewAdaptor = new PagerViewAdaptor(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pagerViewAdaptor);

    }

    private void tabselectedlistener(){
        // for interaction on selecting the tab

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }

    private void tabselectedchanger(){
        //scroll the tabs on selecting the tab bar

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if (tab.getPosition() == 0) {
                    viewPager.setCurrentItem(0);

                }
                if (tab.getPosition() == 1) {
                    viewPager.setCurrentItem(1);
                }
                if (tab.getPosition() == 2) {
                    viewPager.setCurrentItem(2);
                }
                if (tab.getPosition() == 3) {
                    viewPager.setCurrentItem(3);
                }
                if (tab.getPosition() == 4) {
                    viewPager.setCurrentItem(4);
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }



    private void setimage() {
// for making text image
        tabLayout.getTabAt(0).setIcon(tabicons[0]);
        tabLayout.getTabAt(1).setIcon(tabicons[1]);
        tabLayout.getTabAt(2).setIcon(tabicons[2]);
        tabLayout.getTabAt(3).setIcon(tabicons[3]);
        tabLayout.getTabAt(4).setIcon(tabicons[4]);
    }


    private void setupTabIcons() {
        // for making the custom tabs

        TextView tabOne = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabOne.setText("ONE ");
        tabOne.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_call_black_24dp, 0);
        tabLayout.getTabAt(0).setCustomView(tabOne);

        TextView tabTwo = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabTwo.setText("TWO ");
        tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_chat_black_24dp, 0, 0);
        tabLayout.getTabAt(1).setCustomView(tabTwo);

        TextView tabThree = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabThree.setText("THREE ");
        tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_voice_chat_black_24dp, 0, 0);
        tabLayout.getTabAt(2).setCustomView(tabThree);

    }
}


