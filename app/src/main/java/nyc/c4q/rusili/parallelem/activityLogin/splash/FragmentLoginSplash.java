package nyc.c4q.rusili.parallelem.activityLogin.splash;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import nyc.c4q.rusili.parallelem.R;

public class FragmentLoginSplash extends Fragment implements FragmentLoginSplashContract.View{
    private FragmentLoginSplashContract.Presenter mPresenter;
    private View mView;
    private ImageView parallelLineLeft;
    private ImageView parallelLineRight;
    private ImageView parallelWordLeft;
    private ImageView parallelWordRight;


    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_login_splash, container, false);
        initialize();
        splashLineAnimation();
        return mView;
    }

    public void initialize () {
        if (mPresenter == null) {
            mPresenter = new FragmentLoginSplashPresenter(mView);
        }
        setPresenter(mPresenter);
        setViews();
    }

    private void splashWordAnimation () {
        parallelWordLeft.setVisibility(View.VISIBLE);
        parallelWordRight.setVisibility(View.VISIBLE);

        final AnimatorSet setLeftIn = (AnimatorSet) AnimatorInflater.loadAnimator(mView.getContext(),
                R.animator.animator_fade_in_left);
        setLeftIn.setTarget(parallelWordLeft);
        setLeftIn.start();

        final AnimatorSet setRightIn = (AnimatorSet) AnimatorInflater.loadAnimator(mView.getContext(),
                R.animator.animator_fade_in_right);
        setRightIn.setTarget(parallelWordRight);
        setRightIn.start();
    }

    private void splashLineAnimation () {
        parallelLineLeft.setVisibility(View.VISIBLE);
        parallelLineRight.setVisibility(View.VISIBLE);

        Animation accelerateUp = AnimationUtils.loadAnimation(mView.getContext(), R.anim.accelerateup);
        accelerateUp.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart (Animation animation) {
            }

            @Override
            public void onAnimationEnd (Animation animation) {
                Animation slowDown = AnimationUtils.loadAnimation(mView.getContext(), R.anim.slowdown);
                slowDown.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart (Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd (Animation animation) {
                        splashWordAnimation();
                    }

                    @Override
                    public void onAnimationRepeat (Animation animation) {
                    }
                });
                parallelLineRight.startAnimation(slowDown);
            }

            @Override
            public void onAnimationRepeat (Animation animation) {
            }
        });
        parallelLineRight.startAnimation(accelerateUp);

        Animation accelerateDown = AnimationUtils.loadAnimation(mView.getContext(), R.anim.acceleratedown);
        accelerateDown.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart (Animation animation) {
            }

            @Override
            public void onAnimationEnd (Animation animation) {
                Animation slowUp = AnimationUtils.loadAnimation(mView.getContext(), R.anim.slowup);
                parallelLineLeft.startAnimation(slowUp);
            }

            @Override
            public void onAnimationRepeat (Animation animation) {
            }
        });
        parallelLineLeft.startAnimation(accelerateDown);
    }

    @Override
    public void setPresenter (FragmentLoginSplashContract.Presenter presenterParam) {
        this.mPresenter = presenterParam;
    }

    @Override
    public void setViews () {
        parallelWordLeft = (ImageView) mView.findViewById(R.id.fragment_login_splash_wordleft);
        parallelWordRight = (ImageView) mView.findViewById(R.id.fragment_login_splash_wordright);
        parallelLineLeft = (ImageView) mView.findViewById(R.id.fragment_login_splash_lineleft);
        parallelLineRight = (ImageView) mView.findViewById(R.id.fragment_login_splash_lineright);
    }
}
