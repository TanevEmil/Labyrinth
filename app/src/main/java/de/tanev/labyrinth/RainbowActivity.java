package de.tanev.labyrinth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class RainbowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rainbow_activity);

//        final Button _buttonLP2 = findViewById(R.id._buttonLP2);
//        final Button _buttonP2 = findViewById(R.id._buttonP2);
//        final Button _buttonPR2 = findViewById(R.id._buttonRP2);
//
//        final Button _buttonLP1 = findViewById(R.id._buttonLP1);
//        final Button _buttonP1 = findViewById(R.id._buttonP1);
//        final Button _buttonRP1 = findViewById(R.id._buttonRP1);
//
//        final Button _buttonL = findViewById(R.id._buttonL);
        final Button _buttonC = findViewById(R.id._buttonC);
//        final Button _buttonR = findViewById(R.id._buttonR);
//
//        final Button _buttonLM1 = findViewById(R.id._buttonLM1);
//        final Button _buttonM1 = findViewById(R.id._buttonM1);
//        final Button _buttonRM1 = findViewById(R.id._buttonRM1);
//
//        final Button _buttonLM2 = findViewById(R.id._buttonLM2);
//        final Button _buttonM2 = findViewById(R.id._buttonM2);
//        final Button _buttonRM2 = findViewById(R.id._buttonRM2);

        _buttonC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent activityChangeIntent = new Intent(RainbowActivity.this, MainActivity.class);

                // currentContext.startActivity(activityChangeIntent);

                RainbowActivity.this.startActivity(activityChangeIntent);
            }
        });
    }
}

