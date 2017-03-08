package nyc.c4q.rusili.parallelem.activityLogin.splash;

import nyc.c4q.rusili.parallelem.BasePresenter;
import nyc.c4q.rusili.parallelem.BaseView;

interface FragmentLoginSplashContract {

    interface Presenter extends BasePresenter{}

    interface View extends BaseView<Presenter> {

        void initialize();

        void setViews();
    }
}
