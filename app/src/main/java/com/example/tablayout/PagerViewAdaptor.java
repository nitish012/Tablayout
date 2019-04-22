package com.example.tablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class PagerViewAdaptor extends FragmentPagerAdapter {

 private  int tabNum;


    public PagerViewAdaptor(FragmentManager fm,int tabNum){

        //setting data to adaptor
        super(fm);
        this.tabNum = tabNum;

    }

    @Override
    public Fragment getItem(int i) {
        //adding fragment to adaptor

        Fragment fragment=null;
        switch (i){

            case 0:
                fragment=new fragment1();
                break;

            case 1:
               fragment=new fragment2();
                break;
            case 2:
                fragment =new fragment3();
                break;

            case 3:
                fragment=new fragment4();
                break;
            case 4:
                fragment=new fragment5();

                break;

            default:return null;


        }

        return fragment;
    }

    @Override
    public int getCount() {
        //return no of dataitems
        return tabNum;
    }



//    @Nullable
//    @Override
//    public CharSequence getPageTitle(int position) {
//        return super.getPageTitle(position);
//    }
}
