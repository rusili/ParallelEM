package nyc.c4q.rusili.parallelem.activitySetUp.questions;

import nyc.c4q.rusili.parallelem.BasePresenter;
import nyc.c4q.rusili.parallelem.BaseView;

public interface FragmentSetUpQuestionsContract {

    interface Presenter extends BasePresenter{}

    interface View extends BaseView<Presenter>{

        void initialize();

        void setViews();
    }
}
