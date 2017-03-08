package nyc.c4q.rusili.parallelmanager.activityMonitor.chat;

import nyc.c4q.rusili.parallelmanager.BasePresenter;
import nyc.c4q.rusili.parallelmanager.BaseView;

public interface FragmentMonitorChatContract {

    interface Presenter extends BasePresenter{}

    interface View extends BaseView<Presenter>{

        void initialize ();

        void setViews ();
    }
}
