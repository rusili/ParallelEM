package nyc.c4q.rusili.parallelmanager.activitySetUp.start3;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import nyc.c4q.rusili.parallelmanager.R;

import static android.app.Activity.RESULT_OK;

public class FragmentSetUpStart3 extends Fragment implements View.OnClickListener, FragmentSetUpStart3Contract.View{
    private FragmentSetUpStart3Contract.Presenter mPresenter;
    private View mView;
    private Button buttonUpload;

    private static final int SELECT_PICTURE = 100;
    private ImageView imageViewUpload;

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
        buttonUpload = (Button) mView.findViewById(R.id.fragment_setup_start_upload);
        imageViewUpload = (ImageView) mView.findViewById(R.id.fragment_setup_start3_imageswitcher);
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

    public void onActivityResult (int requestCode, int resultCode, Intent data){
        if(resultCode==RESULT_OK){
            if(requestCode==SELECT_PICTURE){
                Uri selectedImageUri = data.getData();
                if (null != selectedImageUri) {
                    // Get the path from the Uri
                    String path = getPathFromURI(selectedImageUri);
                    Log.i("IMAGE PATH TAG", "Image Path : " + path);
                    // Set the image in ImageView
                    imageViewUpload.setImageURI(selectedImageUri);

                }
            }
        }
    }

    private String getPathFromURI(Uri contentUri) {
        String res = null;
        String[] proj = {MediaStore.Images.Media.DATA};
        Cursor cursor = getContext().getContentResolver().query(contentUri, proj, null, null, null);
        if (cursor.moveToFirst()) {
            int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
            res = cursor.getString(column_index);
        }
        cursor.close();
        return res;
    }


}
