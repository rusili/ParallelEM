package nyc.c4q.rusili.parallelmanager.activitySetUp.start;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.rusili.parallelmanager.R;

public class FragmentSetUpStart extends Fragment implements FragmentSetUpStartContract.View{
    private FragmentSetUpStartContract.Presenter mPresenter;
    private View mView;

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_setup_start, container, false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void setPresenter (FragmentSetUpStartContract.Presenter presenterParam) {
        this.mPresenter = presenterParam;
    }

    @Override
    public void initialize () {

    }

    @Override
    public void setViews () {

    }
}
