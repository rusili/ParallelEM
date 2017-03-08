package nyc.c4q.rusili.parallelem.activitySetUp.questions;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.rusili.parallelem.R;

public class FragmentSetUpQuestions extends Fragment implements FragmentSetUpQuestionsContract.View{
    private View mView;

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_setup_questions, container, false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void setPresenter (FragmentSetUpQuestionsContract.Presenter presenter) {

    }

    @Override
    public void initialize () {

    }

    @Override
    public void setViews () {

    }
}
