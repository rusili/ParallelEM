package nyc.c4q.rusili.parallelmanager.utility.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import nyc.c4q.rusili.parallelmanager.activitySetUp.start1.FragmentSetUpStart1;
import nyc.c4q.rusili.parallelmanager.activitySetUp.start2.FragmentSetUpStart2;
import nyc.c4q.rusili.parallelmanager.activitySetUp.start3.FragmentSetUpStart3;

public class ViewPagerAdapter extends SmartFragmentStatePagerAdapter {
    private static int NUM_ITEMS = 3;
		
        public ViewPagerAdapter (FragmentManager fragmentManager) {
            super(fragmentManager);
        }
        
        // Returns total number of pages
        @Override
        public int getCount() {
            return NUM_ITEMS;
        }
 
        // Returns the fragment to display for that page
        @Override
        public Fragment getItem(int position) {
            switch (position) {
            case 0: // Fragment # 0 - This will show FirstFragment
                return FragmentSetUpStart1.newInstance(1);
            case 1: // Fragment # 0 - This will show FirstFragment different title
                return FragmentSetUpStart2.newInstance(2);
            case 2: // Fragment # 1 - This will show SecondFragment
                return FragmentSetUpStart3.newInstance(3);
            default:
            	return null;
            }
        }
        
        // Returns the page title for the top indicator
        @Override
        public CharSequence getPageTitle(int position) {
        	return "" + (position + 1);
        }
        
    }