package com.example.pc.practicatema4pmdm;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.pc.practicatema4pmdm.PrimerFragmentBoton2;
import com.example.pc.practicatema4pmdm.SegundoFragmentBoton2;

public class ViewPagerAdapterBoton2 extends FragmentPagerAdapter
{
    private Fragment[] childFragments;

    public ViewPagerAdapterBoton2(FragmentManager fm) {
        super(fm);
        childFragments = new Fragment[]
                {
                        new PrimerFragmentBoton2(), //0
                        new SegundoFragmentBoton2() //1
                };
    }
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new PrimerFragmentBoton2(); //ChildFragment1 at position 0
            case 1:
                return new SegundoFragmentBoton2(); //ChildFragment2 at position 1

        }
        return null; //does not happen
    }
    @Override
    public int getCount() {
        return 2; //two fragments
    }
}
