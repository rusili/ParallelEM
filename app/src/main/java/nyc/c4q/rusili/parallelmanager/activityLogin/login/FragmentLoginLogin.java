package nyc.c4q.rusili.parallelmanager.activityLogin.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import nyc.c4q.rusili.parallelmanager.R;

public class FragmentLoginLogin extends Fragment implements FragmentLoginLoginContract.View{
    private FragmentLoginLoginContract.Presenter mPresenter;
    private View mView;
    private Button buttonLogin;
    private String username;
    private String password;

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_login_login, container, false);
        initialize();
        return mView;
    }

    public void initialize () {
        if (mPresenter == null) {
            mPresenter = new FragmentLoginLoginPresenter(mView);
        }
        setPresenter(mPresenter);
        setViews();
    }

    public void setViews () {
        EditText editTextUsername = (EditText) mView.findViewById(R.id.fragment_login_login_edittext_username);
        EditText editTextPassword = (EditText) mView.findViewById(R.id.fragment_login_login_edittext_password);
        buttonLogin = (Button) mView.findViewById(R.id.fragment_login_login_button_login);

        username = editTextUsername.getText().toString();
        password = editTextPassword.getText().toString();
    }

    @Override
    public void setPresenter (FragmentLoginLoginContract.Presenter presenter) {
        this.mPresenter = presenter;
    }
}
