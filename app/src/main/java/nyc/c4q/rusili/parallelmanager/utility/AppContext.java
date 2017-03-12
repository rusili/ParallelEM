package nyc.c4q.rusili.parallelmanager.utility;

import android.app.Application;
import android.content.Context;

/**
 * Created by rook on 3/12/17.
 */

public class AppContext extends Application {

    private static Context appContext;

    public static Context getAppContext () {
        return appContext;
    }

    @Override
    public void onCreate () {
        super.onCreate();
        appContext = this;
    }
}
