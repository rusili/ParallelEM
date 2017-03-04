package nyc.c4q.rusili.parallelem.fragments.activitymanager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.rusili.parallelem.R;

public class FragmentManagerChat extends Fragment {
    private View mView;

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_manager_start, container, false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
