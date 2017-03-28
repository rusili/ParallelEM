package nyc.c4q.rusili.parallelmanager.activitySetUp.location;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.rusili.parallelmanager.R;

public class FragmentSetUpLocation extends Fragment implements View.OnClickListener, FragmentSetUpLocationContract.View{
    private FragmentSetUpLocationContract.Presenter mPresenter;
    private View mView;

    public static FragmentSetUpLocation newInstance(int id) {
        FragmentSetUpLocation fragment = new FragmentSetUpLocation();

        Bundle args = new Bundle();
        args.putInt("id", id);
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_setup_location, container, false);
        initialize();
        return mView;
    }

    @Override
    public void setPresenter (FragmentSetUpLocationContract.Presenter presenterParam) {
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
