package nyc.c4q.rusili.parallelmanager.activityLogin.login;

import nyc.c4q.rusili.parallelmanager.BasePresenter;
import nyc.c4q.rusili.parallelmanager.BaseView;

interface FragmentLoginLoginContract {

    interface Presenter extends BasePresenter{}

    interface View extends BaseView<Presenter>{

        void initialize ();

        void setViews ();
    }
}
