package android.activity.com.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    private static final String TAG =ActivityTwo.class.getName();
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        b1=(Button)findViewById(R.id.button);

        int age = getIntent().getIntExtra("user-age",22);
        String name = getIntent().getStringExtra("name");
        TextView txtLabel = (TextView) findViewById(R.id.textViewActTwo);
        txtLabel.setText(" Your name is " + name  + " you are " + age + " years old. ");
        Log.d(TAG,"calling second activity : ");

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ActivityTwo.this,ActivityThree.class);
                Log.d(TAG,"Starting 3rd activity : ");
                startActivity(intent1);
                Log.d(TAG,"started 3rd: ");
            }
        });
    }

}
