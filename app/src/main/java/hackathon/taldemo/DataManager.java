package hackathon.taldemo;

import android.app.Activity;
import android.content.Context;

/**
 * Created by asafshitrit on 11/03/2017.
 */

public class DataManager {
    private static DataManager dataManager;
    private DataManager(){

    }
    public static DataManager getInstance() {
        if (dataManager == null)
        {
            dataManager = new DataManager();

        }
        return dataManager;
    }
    private String data;
    private Context context;


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setContext(Context context){
        this.context = context;
    }

    public void saveData(){

    }
}
