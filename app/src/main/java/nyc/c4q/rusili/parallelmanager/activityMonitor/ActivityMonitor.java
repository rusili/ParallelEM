package nyc.c4q.rusili.parallelmanager.activityMonitor;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import nyc.c4q.rusili.parallelmanager.R;
import nyc.c4q.rusili.parallelmanager.activityMonitor.notifications.FragmentMonitorNotifications;
import nyc.c4q.rusili.parallelmanager.utility.CustomAlertDialog;

public class ActivityMonitor extends AppCompatActivity {
    private int containerID = R.id.activity_monitor_fragment_container;
    private CustomAlertDialog mCustomAlertDialog = new CustomAlertDialog();

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitor);
        initialize();

        loadFragmentStart();
    }

    private void initialize () {
    }

    private void loadFragmentStart () {
        FragmentMonitorNotifications fragmentMonitorNotifications = new FragmentMonitorNotifications();
        getSupportFragmentManager().beginTransaction()
                .replace(containerID, fragmentMonitorNotifications)
                .commit();
    }

    @Override
    public void onBackPressed () {
        Fragment currentFragment = getSupportFragmentManager().findFragmentById(containerID);
        if (currentFragment instanceof FragmentMonitorNotifications) {
            mCustomAlertDialog.exit(this);
        } else {
            super.onBackPressed();
        }
    }
}
