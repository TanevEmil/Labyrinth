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

        Bundle extras = getIntent().getExtras();
        final String l = extras.getString("ButtonL");
//        final String c = extras.getString("ButtonC");
        final String r = extras.getString("ButtonR");

        ((Button) findViewById(R.id._buttonL)).setText(l);
//        ((Button) findViewById(R.id._buttonC)).setText(c);
        ((Button) findViewById(R.id._buttonR)).setText(r);

//        final Button _buttonLP2 = findViewById(R.id._buttonLP2);
//        final Button _buttonP2 = findViewById(R.id._buttonP2);
//        final Button _buttonRP2 = findViewById(R.id._buttonRP2);
//
//        final Button _buttonLP1 = findViewById(R.id._buttonLP1);
        final Button _buttonP1 = findViewById(R.id._buttonP1);
//        final Button _buttonRP1 = findViewById(R.id._buttonRP1);

        final Button _buttonL = findViewById(R.id._buttonL);
//        final Button _buttonC = findViewById(R.id._buttonC);
        final Button _buttonR = findViewById(R.id._buttonR);

//        final Button _buttonLM1 = findViewById(R.id._buttonLM1);
        final Button _buttonM1 = findViewById(R.id._buttonM1);
//        final Button _buttonRM1 = findViewById(R.id._buttonRM1);
//
//        final Button _buttonLM2 = findViewById(R.id._buttonLM2);
//        final Button _buttonM2 = findViewById(R.id._buttonM2);
//        final Button _buttonRM2 = findViewById(R.id._buttonRM2);

//        _buttonLP2.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent activityChangeIntent =
//                        new Intent(RainbowActivity.this, MainActivity.class);
//                RainbowActivity.this.startActivity(activityChangeIntent);
//            }
//        });
//
//        _buttonP2.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent activityChangeIntent =
//                        new Intent(RainbowActivity.this, MainActivity.class);
//                RainbowActivity.this.startActivity(activityChangeIntent);
//            }
//        });
//
//        _buttonRP2.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent activityChangeIntent =
//                        new Intent(RainbowActivity.this, MainActivity.class);
//                RainbowActivity.this.startActivity(activityChangeIntent);
//            }
//        });
//
//        _buttonLP1.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent activityChangeIntent =
//                        new Intent(RainbowActivity.this, MainActivity.class);
//                RainbowActivity.this.startActivity(activityChangeIntent);
//            }
//        });
        _buttonP1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activityChangeIntent =
                        new Intent(RainbowActivity.this, MainActivity.class);
                RainbowActivity.this.startActivity(activityChangeIntent);
            }
        });

//        _buttonRP1.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent activityChangeIntent =
//                        new Intent(RainbowActivity.this, MainActivity.class);
//                RainbowActivity.this.startActivity(activityChangeIntent);
//            }
//        });

        _buttonL.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//                if(l.equals("!=")) {
                    Intent activityChangeIntent =
                            new Intent(RainbowActivity.this, MainActivity.class);
                    RainbowActivity.this.startActivity(activityChangeIntent);
                }
//            }
        });

//        _buttonC.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent activityChangeIntent =
//                        new Intent(RainbowActivity.this, MainActivity.class);
//                RainbowActivity.this.startActivity(activityChangeIntent);
//            }
//        });

        _buttonR.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//                if (r.equals("!=")) {
                    Intent activityChangeIntent =
                            new Intent(RainbowActivity.this, MainActivity.class);
                    RainbowActivity.this.startActivity(activityChangeIntent);
                }
//            }
        });

//        _buttonLM1.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent activityChangeIntent =
//                        new Intent(RainbowActivity.this, MainActivity.class);
//                RainbowActivity.this.startActivity(activityChangeIntent);
//            }
//        });

        _buttonM1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activityChangeIntent =
                        new Intent(RainbowActivity.this, DownActivity.class);
                RainbowActivity.this.startActivity(activityChangeIntent);
            }
        });

//        _buttonRM1.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent activityChangeIntent =
//                        new Intent(RainbowActivity.this, MainActivity.class);
//                RainbowActivity.this.startActivity(activityChangeIntent);
//            }
//        });
//
//        _buttonLM2.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent activityChangeIntent =
//                        new Intent(RainbowActivity.this, MainActivity.class);
//                RainbowActivity.this.startActivity(activityChangeIntent);
//            }
//        });
//
//        _buttonM2.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent activityChangeIntent =
//                        new Intent(RainbowActivity.this, MainActivity.class);
//                RainbowActivity.this.startActivity(activityChangeIntent);
//            }
//        });
//
//        _buttonRM2.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent activityChangeIntent =
//                        new Intent(RainbowActivity.this, MainActivity.class);
//                RainbowActivity.this.startActivity(activityChangeIntent);
//            }
//        });
    }
}

