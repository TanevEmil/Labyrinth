package de.tanev.labyrinth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final Button buttonLP2 = findViewById(R.id.buttonLP2);
//        final Button buttonP2 = findViewById(R.id.buttonP2);
//        final Button buttonPR2 = findViewById(R.id.buttonRP2);
//
//        final Button buttonLP1 = findViewById(R.id.buttonLP1);
//        final Button buttonP1 = findViewById(R.id.buttonP1);
//        final Button buttonRP1 = findViewById(R.id.buttonRP1);
//
//        final Button buttonL = findViewById(R.id.buttonL);
        final Button buttonC = findViewById(R.id.buttonC);
//        final Button buttonR = findViewById(R.id.buttonR);
//
//        final Button buttonLM1 = findViewById(R.id.buttonLM1);
//        final Button buttonM1 = findViewById(R.id.buttonM1);
//        final Button buttonRM1 = findViewById(R.id.buttonRM1);
//
//        final Button buttonLM2 = findViewById(R.id.buttonLM2);
//        final Button buttonM2 = findViewById(R.id.buttonM2);
//        final Button buttonRM2 = findViewById(R.id.buttonRM2);

        buttonC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent activityChangeIntent = new Intent(MainActivity.this, RainbowActivity.class);

                // currentContext.startActivity(activityChangeIntent);

                MainActivity.this.startActivity(activityChangeIntent);
            }
        });
    }
}
