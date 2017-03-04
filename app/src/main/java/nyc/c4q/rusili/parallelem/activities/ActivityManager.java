package nyc.c4q.rusili.parallelem.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import nyc.c4q.rusili.parallelem.R;
import nyc.c4q.rusili.parallelem.fragments.activitymanager.FragmentManagerQuestions;
import nyc.c4q.rusili.parallelem.fragments.activitymanager.FragmentManagerStart;
import nyc.c4q.rusili.parallelem.utility.CustomAlertDialog;
import nyc.c4q.rusili.parallelem.utility.CustomSoundEffects;

public class ActivityManager extends AppCompatActivity {
    private int containerID = R.id.activity_manager_fragment_container;
    private CustomSoundEffects mCustomSoundEffects;
    private CustomAlertDialog mCustomAlertDialog = new CustomAlertDialog();

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager);
        initialize();

        loadFragmentStart();
    }

    private void initialize () {
        mCustomSoundEffects = new CustomSoundEffects(getWindow().getDecorView().getRootView());
    }

    private void loadFragmentStart () {
        FragmentManagerStart fragmentManagerStart = new FragmentManagerStart();
        getSupportFragmentManager().beginTransaction()
                .replace(containerID, fragmentManagerStart)
                .commit();
    }

    private void loadFragmentSetUpQuestions () {
        FragmentManagerQuestions fragmentManagerQuestions = new FragmentManagerQuestions();
        getSupportFragmentManager().beginTransaction()
                .replace(containerID, fragmentManagerQuestions)
                .commit();
    }

    @Override
    public void onBackPressed () {
        Fragment currentFragment = getSupportFragmentManager().findFragmentById(containerID);
        if (currentFragment instanceof FragmentManagerStart) {
            mCustomAlertDialog.exit(this);
        } else {
            super.onBackPressed();
        }
    }

    public void onClickToSetUpQuestions (View view) {
        mCustomSoundEffects.setDefaultClick();
        loadFragmentSetUpQuestions();
    }
}
