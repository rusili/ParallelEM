package nyc.c4q.rusili.parallelem.activityLogin.login;

import nyc.c4q.rusili.parallelem.BasePresenter;
import nyc.c4q.rusili.parallelem.BaseView;

interface FragmentLoginLoginContract {

    interface Presenter extends BasePresenter{}

    interface View extends BaseView<Presenter>{

        void initialize ();

        void setViews ();
    }
}
