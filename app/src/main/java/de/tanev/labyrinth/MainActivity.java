package de.tanev.labyrinth;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import de.tanev.labyrinth.model.BinarySearch;
import de.tanev.labyrinth.model.Renderer;
import de.tanev.labyrinth.model.renderer.Left;
import de.tanev.labyrinth.model.renderer.Right;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final BinarySearch bs = BinarySearch.getInstance();
        Renderer up = bs.getFrames().get(bs.getPathCounter());

        ((Button) findViewById(R.id.buttonLP2)).setText(up.getSlp2());
        ((Button) findViewById(R.id.buttonLP1)).setText(up.getSlp1());
        ((Button) findViewById(R.id.buttonL)).setText(up.getSl());
        ((Button) findViewById(R.id.buttonLM1)).setText(up.getSlm1());
        ((Button) findViewById(R.id.buttonLM2)).setText(up.getSlm2());

        ((Button) findViewById(R.id.buttonP1)).setText(up.getSp1());
        ((Button) findViewById(R.id.buttonC)).setText(up.getSc());
        ((Button) findViewById(R.id.buttonM1)).setText(up.getSm1());
        ((Button) findViewById(R.id.buttonM2)).setText(up.getSm2());

        ((Button) findViewById(R.id.buttonRP2)).setText(up.getSrp2());
        ((Button) findViewById(R.id.buttonRP1)).setText(up.getSrp1());
        ((Button) findViewById(R.id.buttonR)).setText(up.getSr());
        ((Button) findViewById(R.id.buttonRM1)).setText(up.getSrm1());
        ((Button) findViewById(R.id.buttonRM2)).setText(up.getSrm2());

        final Button buttonL = findViewById(R.id.buttonL);
        final Button buttonR = findViewById(R.id.buttonR);

        buttonR.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(bs.getPathCounter() == bs.getFrames().size() - 1) {
                    Toast.makeText(getApplicationContext(), "Match", Toast.LENGTH_LONG).show();
                } else if (bs.getFrames().get(bs.getPathCounter() + 1) instanceof Right) {
                    Intent activityChangeIntent =
                            new Intent(MainActivity.this, RainbowActivity.class);
                    startActivity(activityChangeIntent);
                    bs.incrementPathCounter();
                } else Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_LONG).show();
            }
        });

        buttonL.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(bs.getPathCounter() == bs.getFrames().size() - 1) {
                    Toast.makeText(getApplicationContext(), "Match", Toast.LENGTH_LONG).show();
                } else if (bs.getFrames().get(bs.getPathCounter() + 1) instanceof Left) {
                    Intent activityChangeIntent =
                            new Intent(MainActivity.this, RainbowActivity.class);
                    startActivity(activityChangeIntent);
                    bs.incrementPathCounter();
                } else Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_LONG).show();
            }
        });
    }
}