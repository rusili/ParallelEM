package nyc.c4q.rusili.parallelmanager.activitySetUp.basics;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import nyc.c4q.rusili.parallelmanager.R;

public class FragmentSetUpBasics extends Fragment implements View.OnClickListener, FragmentSetUpBasicsContract.View{
    private FragmentSetUpBasicsContract.Presenter mPresenter;
    private View mView;

    private Button buttonNext;

    public static FragmentSetUpBasics newInstance(int id) {
        FragmentSetUpBasics fragment = new FragmentSetUpBasics();

        Bundle args = new Bundle();
        args.putInt("id", id);
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_setup_basics, container, false);
        initialize();
        return mView;
    }

    @Override
    public void setPresenter (FragmentSetUpBasicsContract.Presenter presenterParam) {
        this.mPresenter = presenterParam;
    }

    @Override
    public void initialize () {
        setViews();
        setOnClickListeners();
    }

    @Override
    public void setViews () {
    }

    private void setOnClickListeners(){
    }

    @Override
    public void onClick (View v) {
        switch (v.getId()){
        }
    }
}
