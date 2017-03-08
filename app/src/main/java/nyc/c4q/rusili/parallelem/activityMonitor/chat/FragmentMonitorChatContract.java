package nyc.c4q.rusili.parallelem.activityMonitor.chat;

import nyc.c4q.rusili.parallelem.BasePresenter;
import nyc.c4q.rusili.parallelem.BaseView;

public interface FragmentMonitorChatContract {

    interface Presenter extends BasePresenter{}

    interface View extends BaseView<Presenter>{

        void initialize ();

        void setViews ();
    }
}
