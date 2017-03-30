package nyc.c4q.rusili.parallelmanager.activitySetUp.modules;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.rusili.parallelmanager.R;

public class FragmentSetUpModules extends Fragment implements View.OnClickListener, FragmentSetUpModulesContract.View{
    private FragmentSetUpModulesContract.Presenter mPresenter;
    private View mView;

    public static FragmentSetUpModules newInstance(int id) {
        FragmentSetUpModules fragment = new FragmentSetUpModules();

        Bundle args = new Bundle();
        args.putInt("id", id);
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_setup_modules, container, false);
        initialize();
        return mView;
    }

    @Override
    public void setPresenter (FragmentSetUpModulesContract.Presenter presenterParam) {
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
