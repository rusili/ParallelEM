package nyc.c4q.rusili.parallelmanager.utility.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import nyc.c4q.rusili.parallelmanager.activitySetUp.basics.FragmentSetUpBasics;
import nyc.c4q.rusili.parallelmanager.activitySetUp.date.FragmentSetUpDate;
import nyc.c4q.rusili.parallelmanager.activitySetUp.location.FragmentSetUpLocation;
import nyc.c4q.rusili.parallelmanager.activitySetUp.questions.FragmentSetUpQuestions;
import nyc.c4q.rusili.parallelmanager.activitySetUp.start4.FragmentSetUpStart4;

public class ViewPagerAdapter extends SmartFragmentStatePagerAdapter {
    private static int NUM_ITEMS = 5;
		
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
                return FragmentSetUpBasics.newInstance(1);
            case 1: // Fragment # 0 - This will show FirstFragment different title
                return FragmentSetUpDate.newInstance(2);
            case 2: // Fragment # 1 - This will show SecondFragment
                return FragmentSetUpLocation.newInstance(3);
            case 3: // Fragment # 1 - This will show SecondFragment
                return FragmentSetUpStart4.newInstance(4);
            case 4: // Fragment # 1 - This will show SecondFragment
                return FragmentSetUpQuestions.newInstance(5);
            case 5: // Fragment # 1 - This will show SecondFragment
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