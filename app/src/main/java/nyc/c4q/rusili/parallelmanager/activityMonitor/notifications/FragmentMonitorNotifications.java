package nyc.c4q.rusili.parallelmanager.activityMonitor.notifications;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import nyc.c4q.rusili.parallelmanager.R;

public class FragmentMonitorNotifications extends Fragment implements FragmentMonitorNotificationsContract.View{
    private View mView;
    private WebView myWebView;

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_monitor_notifications, container, false);
        initialize();
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void setPresenter (FragmentMonitorNotificationsContract.Presenter presenter) {
        
    }

    @Override
    public void initialize () {
        setViews();
    }

    @Override
    public void setViews () {
        myWebView = (WebView) mView.findViewById(R.id.fragment_monitor_notifications_webview);
        myWebView.loadUrl("https://console.firebase.google.com/project/parallel-3276f/notification");
    }
}
