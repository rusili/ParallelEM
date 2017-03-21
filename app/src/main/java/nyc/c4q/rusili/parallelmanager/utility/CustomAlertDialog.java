package nyc.c4q.rusili.parallelmanager.utility;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.view.ViewPager;

// Custom alert dialog allowing the user to use their own layout, title, text, and icon. Defaults to finish() onClick
// Parameters:  1) Context
// Optional:    1) Icon
//              2) View/Layout

public class CustomAlertDialog {

    public void exit (final Context contextP) {
        new AlertDialog.Builder(contextP)
                .setIcon(null)
                .setView(null)
                .setTitle("Exiting App")
                .setMessage("Are you sure you want to close Parallel?")
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick (DialogInterface dialog, int which) {
                        ((Activity) contextP).finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    public void confirmReplaceFragment (final Activity activityP, final ViewPager viewPager) {
        new AlertDialog.Builder(activityP)
                .setIcon(null)
                .setView(null)
                .setTitle("Create")
                .setMessage("Are you sure you want to create this event?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick (DialogInterface dialog, int which) {
                        viewPager.setCurrentItem(viewPager.getCurrentItem()+1, true);
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }


}
