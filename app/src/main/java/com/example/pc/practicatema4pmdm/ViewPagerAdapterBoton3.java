package com.example.pc.practicatema4pmdm;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.pc.practicatema4pmdm.PrimerFragmentBoton3;
import com.example.pc.practicatema4pmdm.SegundoFragmentBoton3;

public class ViewPagerAdapterBoton3 extends FragmentPagerAdapter
{
    private Fragment[] childFragments;

    public ViewPagerAdapterBoton3(FragmentManager fm) {
        super(fm);
        childFragments = new Fragment[]
                {
                        new PrimerFragmentBoton3(), //0
                        new SegundoFragmentBoton3() //1
                };
    }
    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                return new PrimerFragmentBoton3(); //ChildFragment1 at position 0
            case 1:
                return new SegundoFragmentBoton3(); //ChildFragment2 at position 1

        }
        return null; //does not happen
    }
    @Override
    public int getCount() {
        return 2; //two fragments
    }
}
