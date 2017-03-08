package nyc.c4q.rusili.parallelem.activitySetUp.eventinfo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.rusili.parallelem.R;

public class FragmentSetUpEventInfo extends Fragment implements FragmentSetUpEventInfoContract.View{
    private View mView;

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_setup_eventinfo, container, false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void setPresenter (FragmentSetUpEventInfoContract.Presenter presenter) {

    }

    @Override
    public void initialize () {

    }

    @Override
    public void setViews () {

    }
}
