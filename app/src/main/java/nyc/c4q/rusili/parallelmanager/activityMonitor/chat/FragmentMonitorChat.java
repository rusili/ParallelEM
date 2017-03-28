package nyc.c4q.rusili.parallelmanager.activityMonitor.chat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.rusili.parallelmanager.R;

public class FragmentMonitorChat extends Fragment implements FragmentMonitorChatContract.View{
    private View mView;

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_setup_basics, container, false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void setPresenter (FragmentMonitorChatContract.Presenter presenter) {

    }

    @Override
    public void initialize () {

    }

    @Override
    public void setViews () {

    }
}
