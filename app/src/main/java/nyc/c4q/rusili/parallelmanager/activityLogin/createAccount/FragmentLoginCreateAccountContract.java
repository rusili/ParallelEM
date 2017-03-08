package nyc.c4q.rusili.parallelmanager.activityLogin.createAccount;

import nyc.c4q.rusili.parallelmanager.BasePresenter;
import nyc.c4q.rusili.parallelmanager.BaseView;

interface FragmentLoginCreateAccountContract {

    interface Presenter extends BasePresenter{}

    interface View extends BaseView<Presenter>{

        void initialize();

        void setViews();
    }
}
