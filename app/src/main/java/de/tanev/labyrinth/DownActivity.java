package de.tanev.labyrinth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DownActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.down_activity);

//        final Button buttonLP2 = findViewById(R.id.buttonLP2);
//        final Button buttonP2 = findViewById(R.id.buttonP2);
//        final Button buttonRP2 = findViewById(R.id.buttonRP2);
//
//        final Button buttonLP1 = findViewById(R.id.buttonLP1);
//        final Button buttonP1 = findViewById(R.id.buttonP1);
//        final Button buttonRP1 = findViewById(R.id.buttonRP1);

        final Button buttonL = findViewById(R.id.buttonL);
//        final Button buttonC = findViewById(R.id.buttonC);
        final Button buttonR = findViewById(R.id.buttonR);

//        final Button buttonLM1 = findViewById(R.id.buttonLM1);
//        final Button buttonM1 = findViewById(R.id.buttonM1);
//        final Button buttonRM1 = findViewById(R.id.buttonRM1);
//
//        final Button buttonLM2 = findViewById(R.id.buttonLM2);
//        final Button buttonM2 = findViewById(R.id.buttonM2);
//        final Button buttonRM2 = findViewById(R.id.buttonRM2);

//        buttonLP2.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent activityChangeIntent =
//                        new Intent(MainActivity.this, RainbowActivity.class);
//                MainActivity.this.startActivity(activityChangeIntent);
//            }
//        });
//
//        buttonP2.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent activityChangeIntent =
//                        new Intent(MainActivity.this, RainbowActivity.class);
//                MainActivity.this.startActivity(activityChangeIntent);
//            }
//        });
//
//        buttonRP2.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent activityChangeIntent =
//                        new Intent(MainActivity.this, RainbowActivity.class);
//                MainActivity.this.startActivity(activityChangeIntent);
//            }
//        });
//
//        buttonLP1.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent activityChangeIntent =
//                        new Intent(MainActivity.this, RainbowActivity.class);
//                MainActivity.this.startActivity(activityChangeIntent);
//            }
//        });
//
//        buttonP1.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent activityChangeIntent =
//                        new Intent(MainActivity.this, RainbowActivity.class);
//                MainActivity.this.startActivity(activityChangeIntent);
//            }
//        });
//
//        buttonRP1.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent activityChangeIntent =
//                        new Intent(MainActivity.this, RainbowActivity.class);
//                MainActivity.this.startActivity(activityChangeIntent);
//            }
//        });

        buttonL.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activityChangeIntent =
                        new Intent(DownActivity.this, RainbowActivity.class);
                Bundle extras = new Bundle();
                extras.putString("ButtonL","<<");
                extras.putString("ButtonC","<");
                extras.putString("ButtonR","?");
                activityChangeIntent.putExtras(extras);
                startActivity(activityChangeIntent);
            }
        });

//        buttonC.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent activityChangeIntent =
//                        new Intent(MainActivity.this, RainbowActivity.class);
//                MainActivity.this.startActivity(activityChangeIntent);
//            }
//        });

        buttonR.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activityChangeIntent =
                        new Intent(DownActivity.this, RainbowActivity.class);
                Bundle extras = new Bundle();
                extras.putString("ButtonL","?");
                extras.putString("ButtonC",">");
                extras.putString("ButtonR",">>");
                activityChangeIntent.putExtras(extras);
                startActivity(activityChangeIntent);
            }
        });

//        buttonLM1.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent activityChangeIntent =
//                        new Intent(MainActivity.this, RainbowActivity.class);
//                MainActivity.this.startActivity(activityChangeIntent);
//            }
//        });
//
//        buttonM1.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent activityChangeIntent =
//                        new Intent(MainActivity.this, RainbowActivity.class);
//                MainActivity.this.startActivity(activityChangeIntent);
//            }
//        });
//
//        buttonRM1.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent activityChangeIntent =
//                        new Intent(MainActivity.this, RainbowActivity.class);
//                MainActivity.this.startActivity(activityChangeIntent);
//            }
//        });
//
//        buttonLM2.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent activityChangeIntent =
//                        new Intent(MainActivity.this, RainbowActivity.class);
//                MainActivity.this.startActivity(activityChangeIntent);
//            }
//        });
//
//        buttonM2.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent activityChangeIntent =
//                        new Intent(MainActivity.this, RainbowActivity.class);
//                MainActivity.this.startActivity(activityChangeIntent);
//            }
//        });
//
//        buttonRM2.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent activityChangeIntent =
//                        new Intent(MainActivity.this, RainbowActivity.class);
//                MainActivity.this.startActivity(activityChangeIntent);
//            }
//        });
    }
}
