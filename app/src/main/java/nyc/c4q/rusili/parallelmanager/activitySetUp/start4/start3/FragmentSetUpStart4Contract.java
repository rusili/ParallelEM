package nyc.c4q.rusili.parallelmanager.activitySetUp.start4.start3;

import nyc.c4q.rusili.parallelmanager.BasePresenter;
import nyc.c4q.rusili.parallelmanager.BaseView;

interface FragmentSetUpStart4Contract {

    interface Presenter extends BasePresenter{}

    interface View extends BaseView<Presenter>{

        void initialize ();

        void setViews ();
    }
}
