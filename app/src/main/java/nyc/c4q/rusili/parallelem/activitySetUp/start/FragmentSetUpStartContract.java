package nyc.c4q.rusili.parallelem.activitySetUp.start;

import nyc.c4q.rusili.parallelem.BasePresenter;
import nyc.c4q.rusili.parallelem.BaseView;

interface FragmentSetUpStartContract {

    interface Presenter extends BasePresenter{}

    interface View extends BaseView<Presenter>{

        void initialize();

        void setViews();
    }
}
