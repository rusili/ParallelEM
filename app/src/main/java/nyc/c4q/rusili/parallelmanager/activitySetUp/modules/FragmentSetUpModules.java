package nyc.c4q.rusili.parallelmanager.activitySetUp.modules;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;

import nyc.c4q.rusili.parallelmanager.R;
import nyc.c4q.rusili.parallelmanager.utility.mylibrary.ToggleExpandLayout;

public class FragmentSetUpModules extends Fragment implements View.OnClickListener, FragmentSetUpModulesContract.View{
    private FragmentSetUpModulesContract.Presenter mPresenter;
    private View mView;
    private ToggleExpandLayout toggleExpandLayout;
    private Switch aSwitch;

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
        setOnSwitchListeners();
    }

    private void setOnSwitchListeners () {
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    toggleExpandLayout.open();
                } else {
                    toggleExpandLayout.close();
                }
            }
        });
    }

    @Override
    public void setViews () {
        toggleExpandLayout = (ToggleExpandLayout) mView.findViewById(R.id.expandlayout_module1_expandlayout);
        aSwitch = (Switch) mView.findViewById(R.id.module1_switch);
    }

    private void setOnClickListeners(){
        toggleExpandLayout.setOnToggleTouchListener(new ToggleExpandLayout.OnToggleTouchListener() {
            @Override
            public void onStartOpen (int height, int originalHeight) {

            }

            @Override
            public void onOpen () {

            }

            @Override
            public void onStartClose (int height, int originalHeight) {

            }

            @Override
            public void onClosed () {

            }
        });
    }

    @Override
    public void onClick (View v) {
        switch (v.getId()){
        }
    }

}
