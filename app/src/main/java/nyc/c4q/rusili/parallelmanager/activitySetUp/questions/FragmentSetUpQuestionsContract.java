package nyc.c4q.rusili.parallelmanager.activitySetUp.questions;

import nyc.c4q.rusili.parallelmanager.BasePresenter;
import nyc.c4q.rusili.parallelmanager.BaseView;

public interface FragmentSetUpQuestionsContract {

    interface Presenter extends BasePresenter{}

    interface View extends BaseView<Presenter>{

        void initialize();

        void setViews();
    }
}
