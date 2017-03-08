package nyc.c4q.rusili.parallelmanager.activitySetUp.eventinfo;

import nyc.c4q.rusili.parallelmanager.BasePresenter;
import nyc.c4q.rusili.parallelmanager.BaseView;

public interface FragmentSetUpEventInfoContract {

    interface Presenter extends BasePresenter{}

    interface View extends BaseView<Presenter>{

        void initialize ();

        void setViews ();
    }
}
