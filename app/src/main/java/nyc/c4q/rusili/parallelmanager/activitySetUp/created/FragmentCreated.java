package nyc.c4q.rusili.parallelmanager.activitySetUp.created;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hanks.htextview.HTextView;
import com.hanks.htextview.HTextViewType;

import nyc.c4q.rusili.parallelmanager.R;

public class FragmentCreated extends Fragment{
    private View mView;
    private HTextView hTextViewCreated;

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_created, container, false);
        initialize();
        return mView;
    }

    public static FragmentCreated newInstance(int id) {
        FragmentCreated fragment = new FragmentCreated();

        Bundle args = new Bundle();
        args.putInt("id", id);
        fragment.setArguments(args);

        return fragment;
    }

    public void initialize () {
        setViews();
        setOnClickListeners();
    }

    public void setViews () {
        hTextViewCreated = (HTextView) mView.findViewById(R.id.fragment_created_htextview);
        hTextViewCreated.setAnimateType(HTextViewType.SCALE);
        hTextViewCreated.setTextSize(TypedValue.COMPLEX_UNIT_SP, 48);
        hTextViewCreated.animateText("Event Created!");
    }

    private void setOnClickListeners(){
    }
}
