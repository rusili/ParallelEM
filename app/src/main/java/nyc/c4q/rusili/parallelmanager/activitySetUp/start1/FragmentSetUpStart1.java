package nyc.c4q.rusili.parallelmanager.activitySetUp.start1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import nyc.c4q.rusili.parallelmanager.R;

public class FragmentSetUpStart1 extends Fragment implements View.OnClickListener, FragmentSetUpStart1Contract.View{
    private FragmentSetUpStart1Contract.Presenter mPresenter;
    private View mView;

    private Button buttonNext;

    public static FragmentSetUpStart1 newInstance(int id) {
        FragmentSetUpStart1 fragment = new FragmentSetUpStart1();

        Bundle args = new Bundle();
        args.putInt("id", id);
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_setup_start1, container, false);
        initialize();
        return mView;
    }

    @Override
    public void setPresenter (FragmentSetUpStart1Contract.Presenter presenterParam) {
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
