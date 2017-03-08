package nyc.c4q.rusili.parallelem.activityLogin.createAccount;

import nyc.c4q.rusili.parallelem.BasePresenter;
import nyc.c4q.rusili.parallelem.BaseView;

interface FragmentLoginCreateAccountContract {

    interface Presenter extends BasePresenter{}

    interface View extends BaseView<Presenter>{

        void initialize();

        void setViews();
    }
}
