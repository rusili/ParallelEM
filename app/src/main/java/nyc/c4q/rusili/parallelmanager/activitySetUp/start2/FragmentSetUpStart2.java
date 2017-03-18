package nyc.c4q.rusili.parallelmanager.activitySetUp.start2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.github.jjobes.slidedatetimepicker.SlideDateTimeListener;
import com.github.jjobes.slidedatetimepicker.SlideDateTimePicker;

import java.text.SimpleDateFormat;
import java.util.Date;

import nyc.c4q.rusili.parallelmanager.R;

public class FragmentSetUpStart2 extends Fragment implements View.OnClickListener, FragmentSetUpStart2Contract.View{
    private FragmentSetUpStart2Contract.Presenter mPresenter;
    private View mView;

    private SimpleDateFormat mFormatter = new SimpleDateFormat("MMMM dd yyyy hh:mm aa");
    private TextView textViewPickStart;
    private TextView textViewPickEnd;
    private Button buttonNext;

    public static FragmentSetUpStart2 newInstance(int id) {
        FragmentSetUpStart2 fragment = new FragmentSetUpStart2();

        Bundle args = new Bundle();
        args.putInt("id", id);
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_setup_start2, container, false);
        initialize();
        return mView;
    }

    @Override
    public void setPresenter (FragmentSetUpStart2Contract.Presenter presenterParam) {
        this.mPresenter = presenterParam;
    }

    @Override
    public void initialize () {
        setViews();
        setOnClickListeners();
    }

    @Override
    public void setViews () {
        textViewPickStart = (TextView) mView.findViewById(R.id.fragment_setup_start_pick1);
        textViewPickEnd = (TextView) mView.findViewById(R.id.fragment_setup_start_pick2);
    }

    private void setOnClickListeners(){
        textViewPickStart.setOnClickListener(this);
        textViewPickEnd.setOnClickListener(this);
    }

    private SlideDateTimeListener listener = new SlideDateTimeListener() {

        @Override
        public void onDateTimeSet(Date date) {
            // Do something with the date. This Date object contains
            // the date and time that the user has selected.
            Toast.makeText(mView.getContext(),
                    mFormatter.format(date), Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onDateTimeCancel() {
            Toast.makeText(mView.getContext(),
                    "Canceled", Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    public void onClick (View v) {
        switch (v.getId()){
            case (R.id.fragment_setup_start_pick1): {
                new SlideDateTimePicker.Builder(getActivity().getSupportFragmentManager())
                        .setListener(listener)
                        .setInitialDate(new Date())
                        .setTheme(SlideDateTimePicker.HOLO_LIGHT)
                        .setIndicatorColor(getResources().getColor(R.color.purpleDark))
                        .build()
                        .show();
                break;
            }
            case (R.id.fragment_setup_start_pick2): {
                new SlideDateTimePicker.Builder(getActivity().getSupportFragmentManager())
                        .setListener(listener)
                        .setInitialDate(new Date())
                        .setTheme(SlideDateTimePicker.HOLO_LIGHT)
                        .setIndicatorColor(getResources().getColor(R.color.purpleDark))
                        .build()
                        .show();
                break;
            }
        }
    }
}
