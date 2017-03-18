package nyc.c4q.rusili.parallelmanager.activitySetUp.start;

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
import nyc.c4q.rusili.parallelmanager.activitySetUp.questions.FragmentSetUpQuestions;

public class FragmentSetUpStart extends Fragment implements View.OnClickListener, FragmentSetUpStartContract.View{
    private FragmentSetUpStartContract.Presenter mPresenter;
    private View mView;
    private int containerID = R.id.activity_setup_fragment_container;

    private SimpleDateFormat mFormatter = new SimpleDateFormat("MMMM dd yyyy hh:mm aa");
    private TextView textViewPickStart;
    private TextView textViewPickEnd;
    private Button buttonNext;

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_setup_start, container, false);
        initialize();
        return mView;
    }

    @Override
    public void setPresenter (FragmentSetUpStartContract.Presenter presenterParam) {
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
        buttonNext = (Button) mView.findViewById(R.id.fragment_setup_start_button_next);
    }

    private void setOnClickListeners(){
        textViewPickStart.setOnClickListener(this);
        textViewPickEnd.setOnClickListener(this);
        buttonNext.setOnClickListener(this);
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
            case (R.id.fragment_setup_start_button_next): {
                getActivity().getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_right)
                        .replace(containerID, new FragmentSetUpQuestions())
                        .commit();
                break;
            }
            case (R.id.fragment_setup_start_upload): {
                // Something
            }
        }
    }
}
