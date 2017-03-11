package hackathon.taldemo;

/**
 * Created by asafshitrit on 11/03/2017.
 */

public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        DataManager.getInstance().setContext(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        DataManager.getInstance().saveData();
    }
}
