package nyc.c4q.rusili.parallelem.activityLogin.login;

import android.view.View;

class FragmentLoginLoginPresenter implements FragmentLoginLoginContract.Presenter {
    View mView;

    FragmentLoginLoginPresenter (View viewParam){
        this.mView = viewParam;
    }

    @Override
    public void start () {
    }
}
