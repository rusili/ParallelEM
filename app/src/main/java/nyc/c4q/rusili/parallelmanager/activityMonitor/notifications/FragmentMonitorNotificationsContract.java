package nyc.c4q.rusili.parallelmanager.activityMonitor.notifications;

import nyc.c4q.rusili.parallelmanager.BasePresenter;
import nyc.c4q.rusili.parallelmanager.BaseView;

public interface FragmentMonitorNotificationsContract {

    interface Presenter extends BasePresenter{}

    interface View extends BaseView<Presenter>{

        void initialize ();

        void setViews ();
    }
}
