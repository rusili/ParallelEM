package nyc.c4q.rusili.parallelem.activityLogin.createAccount;

import android.view.View;

class FragmentLoginCreateAccountPresenter implements FragmentLoginCreateAccountContract.Presenter {
    View mView;

    FragmentLoginCreateAccountPresenter(View viewParam){
        this.mView = viewParam;
    }

    @Override
    public void start () {
    }
}
