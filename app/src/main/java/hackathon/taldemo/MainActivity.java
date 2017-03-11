package hackathon.taldemo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private Button bt1;
    private View.OnClickListener clickListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.tv1);
        bt1 = (Button) findViewById(R.id.bt1);
        tv1.setText("Hello Mister !");

        clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                DataManager.getInstance().setData("Hello world !");
                startActivity(i);
            }
        };
        bt1.setOnClickListener(clickListener);


        SharedPreferences mSharedPref = getSharedPreferences(Const.SHARED_PREF_KEY,MODE_PRIVATE);
        boolean soundMode = mSharedPref.getBoolean("isSoundOn",true);

        mSharedPref.edit().putBoolean("isSoundOn",false).apply();


    }
}
