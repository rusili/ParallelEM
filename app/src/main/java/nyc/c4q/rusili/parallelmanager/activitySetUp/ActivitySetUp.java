package nyc.c4q.rusili.parallelmanager.activitySetUp;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.eftimoff.viewpagertransformers.DefaultTransformer;

import nyc.c4q.rusili.parallelmanager.R;
import nyc.c4q.rusili.parallelmanager.utility.viewpager.ViewPagerAdapter;

public class ActivitySetUp extends AppCompatActivity implements View.OnClickListener {
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;
    private TextView textViewStep;
    private ImageButton buttonNext;
    private ImageButton buttonPrevious;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);
        initialize();
    }

    private void initialize () {
        setViews();
        setOnClickListeners();
        setupViewpager();
    }

    private void setOnClickListeners () {
        buttonNext.setOnClickListener(this);
        buttonPrevious.setOnClickListener(this);
    }

    private void setViews () {
        buttonNext = (ImageButton) findViewById(R.id.activity_setup_button_next);
        buttonPrevious = (ImageButton) findViewById(R.id.activity_setup_button_previous);
        textViewStep = (TextView) findViewById(R.id.activity_setup_textview_step);
    }

    public void setupViewpager() {
        viewPager = (ViewPager) findViewById(R.id.activity_setup_viewpager);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled (int positionP, float positionOffset, int positionOffsetPixels) {
                int position = positionP + 1;
                String stepName = null;
                if (position == 1){
                    stepName = "Event Basics";
                    buttonPrevious.setVisibility(View.INVISIBLE);
                    buttonNext.setVisibility(View.VISIBLE);
                } else if (position == 2 || position == 3){
                    stepName = "Date and Time";
                    buttonPrevious.setVisibility(View.VISIBLE);
                    buttonNext.setVisibility(View.VISIBLE);
                } else if (position == 3){
                    stepName = "Location";
                    buttonPrevious.setVisibility(View.VISIBLE);
                    buttonNext.setVisibility(View.VISIBLE);
                } else if (position == 4) {
                    stepName = "Modules";
                    buttonPrevious.setVisibility(View.VISIBLE);
                    buttonNext.setVisibility(View.INVISIBLE);
                }
                textViewStep.setText("Step " + position + " of 4 - " + stepName);
            }

            @Override
            public void onPageSelected (int position) {}
            @Override
            public void onPageScrollStateChanged (int state) {}
        });
        viewPager.setPageTransformer(true, new DefaultTransformer());
    }


    @Override
    public void onBackPressed () {
        super.onBackPressed();
    }

    @Override
    public void onClick (View v) {
        switch (v.getId()){
            case R.id.activity_setup_button_previous:
                viewPager.setCurrentItem(viewPager.getCurrentItem()-1, true);
                break;
            case R.id.activity_setup_button_next:
                viewPager.setCurrentItem(viewPager.getCurrentItem()+1, true);
                break;
        }
    }
}
