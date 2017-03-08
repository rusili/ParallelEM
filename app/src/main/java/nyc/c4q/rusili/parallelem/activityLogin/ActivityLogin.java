package nyc.c4q.rusili.parallelem.activityLogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import nyc.c4q.rusili.parallelem.R;
import nyc.c4q.rusili.parallelem.activityLogin.createAccount.FragmentLoginCreateAccount;
import nyc.c4q.rusili.parallelem.activityLogin.login.FragmentLoginLogin;
import nyc.c4q.rusili.parallelem.activityLogin.splash.FragmentLoginSplash;
import nyc.c4q.rusili.parallelem.activitySetUp.ActivitySetUp;
import nyc.c4q.rusili.parallelem.utility.CustomAlertDialog;
import nyc.c4q.rusili.parallelem.utility.CustomSoundEffects;
import nyc.c4q.rusili.parallelem.utility.CustomToast;

public class ActivityLogin extends AppCompatActivity {
    private int containerID = R.id.activity_login_fragment_container;
    private CustomSoundEffects mCustomSoundEffects;
    private CustomAlertDialog mCustomAlertDialog = new CustomAlertDialog();
    private CustomToast mCustomToast = new CustomToast();
    private ImageView logoViewLeft;
    private ImageView logoViewRight;
    private boolean logoVisible = false;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initialize();

        loadFragmentSplash();
    }

    private void initialize () {
        mCustomSoundEffects = new CustomSoundEffects(getWindow().getDecorView().getRootView());
    }

    private void loadFragmentSplash () {
        FragmentLoginSplash mFragmentLoginSplash = new FragmentLoginSplash();
        getSupportFragmentManager().beginTransaction()
                .add(containerID, mFragmentLoginSplash, "Splash")
                .commit();
    }

    private void loadFragmentLogin () {
        FragmentLoginLogin mFragmentLoginLogin = new FragmentLoginLogin();
        getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_left)
                .replace(containerID, mFragmentLoginLogin, "Login")
                .commit();

        if (!logoVisible) {
            logoViewLeft = (ImageView) findViewById(R.id.activity_login_logoleft);
            logoViewLeft.setVisibility(View.VISIBLE);
            Animation fadeInUp = AnimationUtils.loadAnimation(this, R.anim.fadeinup);
            logoViewLeft.startAnimation(fadeInUp);

            logoViewRight = (ImageView) findViewById(R.id.activity_login_logoright);
            logoViewRight.setVisibility(View.VISIBLE);
            Animation fadeInDown = AnimationUtils.loadAnimation(this, R.anim.fadeindown);
            logoViewRight.startAnimation(fadeInDown);
            logoVisible = true;
        }
    }

    private void loadFragmentCreateAccount () {
        FragmentLoginCreateAccount mFragmentLoginCreateAccount = new FragmentLoginCreateAccount();
        getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_right)
                .replace(containerID, mFragmentLoginCreateAccount)
                .commit();
    }

    public void onClickToLogin (View view) {
        mCustomSoundEffects.setDefaultClick();
        loadFragmentLogin();
    }

    public void onClicktoCreateAccount (View view) {
        mCustomSoundEffects.setDefaultClick();
        loadFragmentCreateAccount();
    }

    @Override
    public void onBackPressed () {
        Fragment currentFragment = getSupportFragmentManager().findFragmentById(containerID);
        if (currentFragment instanceof FragmentLoginLogin) {
            mCustomAlertDialog.exit(this);
        } else if (currentFragment instanceof FragmentLoginCreateAccount) {
            loadFragmentLogin();
        } else {
            super.onBackPressed();
        }
    }

    public void onClickToActivityManager (View view) {
        finish();
        Intent intentToActivityStart = new Intent(this, ActivitySetUp.class);
        startActivity(intentToActivityStart);
    }
}
