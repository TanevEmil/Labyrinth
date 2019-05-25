package de.tanev.labyrinth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    BinarySearch bs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bs = new BinarySearch();
        int findMe = bs.getFindMe();

        int indexMin = 0;
        int indexMax = bs.getArray().length - 1;
        int indexLowAvg = (bs.getArray().length - 1) / 2;
        int indexHighAvg = (bs.getArray().length - 1) / 2 + 1;
        int index1div4 = indexMax / 4;
        int index3div4 = 3 * indexMax / 4;

        int intMin = bs.getArray()[indexMin];
        int intMax = bs.getArray()[indexMax];
        int intLowAvg = bs.getArray()[indexLowAvg];
        int intHighAvg = bs.getArray()[indexHighAvg];
        final int int1div4 = bs.getArray()[index1div4];
        final int int3div4 = bs.getArray()[index3div4];

        String sButtonLP2 = "^^\n[ " + indexLowAvg + " ]";
        String sButtonLP1 = "^\n" + intLowAvg;
        String sButtonL = "<\n[ " + index1div4 + " ]";
        String sButtonLM1 = "v\n" + intMin;
        String sButtonLM2 = "<\n[ " + indexMin + " ]";

        String sButtonP1 = "^^\n[ " + indexMax + " ]";
        String sButtonC = "^\n" + intMax;
        final String sButtonM1 = "!=\n" + findMe;
        String sButtonM2 = "v\n" + intMin;

        String sButtonRP2 = "^^\n[ " + indexMax + " ]";
        String sButtonRP1 = "^\n" + intMax;
        String sButtonR = ">\n[ " + index3div4 + " ]";
        String sButtonRM1 = "v\n" + intHighAvg;
        String sButtonRM2 = "vv\n[ " + indexHighAvg + " ]";

        final Bundle extras = new Bundle();

        extras.putString("ButtonLP2", sButtonLP2);
        extras.putString("ButtonLP1", sButtonLP1);
//        extras.putString("ButtonL", sButtonL);
        extras.putString("ButtonLM1", sButtonLM1);
        extras.putString("ButtonLM2", sButtonLM2);

        extras.putString("ButtonP1", sButtonP1);
        extras.putString("ButtonC", sButtonC);
        extras.putString("ButtonM1", sButtonM1);
        extras.putString("ButtonM2", sButtonM2);

        extras.putString("ButtonRP2", sButtonRP2);
        extras.putString("ButtonRP1", sButtonRP1);
//        extras.putString("ButtonR", sButtonR);
        extras.putString("ButtonRM1", sButtonRM1);
        extras.putString("ButtonRM2", sButtonRM2);

        ((Button) findViewById(R.id.buttonLP2)).setText(sButtonLP2);
        ((Button) findViewById(R.id.buttonLP1)).setText(sButtonLP1);
        ((Button) findViewById(R.id.buttonL)).setText(sButtonL);
        ((Button) findViewById(R.id.buttonLM1)).setText(sButtonLM1);
        ((Button) findViewById(R.id.buttonLM2)).setText(sButtonLM2);

        ((Button) findViewById(R.id.buttonP1)).setText(sButtonP1);
        ((Button) findViewById(R.id.buttonC)).setText(sButtonC);
        ((Button) findViewById(R.id.buttonM1)).setText(sButtonM1);
        ((Button) findViewById(R.id.buttonM2)).setText(sButtonM2);

        ((Button) findViewById(R.id.buttonRP2)).setText(sButtonRP2);
        ((Button) findViewById(R.id.buttonRP1)).setText(sButtonRP1);
        ((Button) findViewById(R.id.buttonR)).setText(sButtonR);
        ((Button) findViewById(R.id.buttonRM1)).setText(sButtonRM1);
        ((Button) findViewById(R.id.buttonRM2)).setText(sButtonRM2);



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
                        new Intent(MainActivity.this, RainbowActivity.class);
                extras.putString("ButtonL","<<\n" + int1div4);
                extras.putString("ButtonR",sButtonM1);
                extras.putIntegerArrayList("BS", new ArrayList(Arrays.asList(bs.getArray())));
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
                        new Intent(MainActivity.this, RainbowActivity.class);
                extras.putString("ButtonL",sButtonM1);
                extras.putString("ButtonR",">>\n" + int3div4);
                extras.putIntegerArrayList("BS", new ArrayList(Arrays.asList(bs.getArray())));
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
