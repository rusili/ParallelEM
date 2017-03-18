package nyc.c4q.rusili.parallelmanager.activitySetUp.start3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.rusili.parallelmanager.R;

public class FragmentSetUpStart3 extends Fragment implements View.OnClickListener, FragmentSetUpStart3Contract.View{
    private FragmentSetUpStart3Contract.Presenter mPresenter;
    private View mView;

    public static FragmentSetUpStart3 newInstance(int id) {
        FragmentSetUpStart3 fragment = new FragmentSetUpStart3();

        Bundle args = new Bundle();
        args.putInt("id", id);
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_setup_start3, container, false);
        initialize();
        return mView;
    }

    @Override
    public void setPresenter (FragmentSetUpStart3Contract.Presenter presenterParam) {
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
            case (R.id.fragment_setup_start_upload): {
                // Something
            }
        }
    }
}
