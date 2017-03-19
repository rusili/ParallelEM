package nyc.c4q.rusili.parallelmanager.activitySetUp.start4.start3;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import nyc.c4q.rusili.parallelmanager.R;

public class FragmentSetUpStart4 extends Fragment implements View.OnClickListener, FragmentSetUpStart4Contract.View{
    private FragmentSetUpStart4Contract.Presenter mPresenter;
    private View mView;
    private Button buttonUpload;

    private static final int SELECT_PICTURE = 100;
    private ImageView imageViewUpload;

    public static FragmentSetUpStart4 newInstance(int id) {
        FragmentSetUpStart4 fragment = new FragmentSetUpStart4();

        Bundle args = new Bundle();
        args.putInt("id", id);
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_setup_start4, container, false);
        initialize();
        return mView;
    }

    @Override
    public void setPresenter (FragmentSetUpStart4Contract.Presenter presenterParam) {
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
        buttonUpload.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {
        switch (v.getId()){
            case (R.id.fragment_setup_start_upload): {
                Intent pickImage = new Intent();
                pickImage.setType("image/*");
                pickImage.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(pickImage, "Select Picture"),SELECT_PICTURE );

            }
        }
    }

}
