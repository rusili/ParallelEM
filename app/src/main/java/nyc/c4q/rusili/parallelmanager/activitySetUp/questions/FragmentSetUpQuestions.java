package nyc.c4q.rusili.parallelmanager.activitySetUp.questions;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import nyc.c4q.rusili.parallelmanager.R;

public class FragmentSetUpQuestions extends Fragment implements View.OnClickListener, FragmentSetUpQuestionsContract.View{
    private View mView;
    private Button buttonNext;
    private FloatingActionButton floatingActionButton;
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_setup_questions, container, false);
        return mView;
    }

    public static FragmentSetUpQuestions newInstance(int id) {
        FragmentSetUpQuestions fragment = new FragmentSetUpQuestions();

        Bundle args = new Bundle();
        args.putInt("id", id);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void setPresenter (FragmentSetUpQuestionsContract.Presenter presenter) {}

    @Override
    public void initialize () {
        setViews();
        setOnClickListeners();
    }

    @Override
    public void setViews () {
        floatingActionButton = (FloatingActionButton) mView.findViewById(R.id.fragment_setup_questions_floatingactionbutton);
    }

    private void setOnClickListeners(){
        floatingActionButton.setOnClickListener(this);
        buttonNext.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {
        switch (v.getId()){
            case R.id.fragment_setup_questions_floatingactionbutton: {
            }
        }
    }
}
