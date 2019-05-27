package de.tanev.labyrinth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import de.tanev.labyrinth.model.BinarySearch;
import de.tanev.labyrinth.model.Renderer;
import de.tanev.labyrinth.model.renderer.Left;
import de.tanev.labyrinth.model.renderer.Right;

public class DownActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.down_activity);

        final BinarySearch bs = BinarySearch.getInstance();
        Renderer down = bs.getFrames().get(bs.getPathCounter());

        ((Button) findViewById(R.id.buttonLP2)).setText(down.getSlp2());
        ((Button) findViewById(R.id.buttonLP1)).setText(down.getSlp1());
        ((Button) findViewById(R.id.buttonL)).setText(down.getSl());
        ((Button) findViewById(R.id.buttonLM1)).setText(down.getSlm1());
        ((Button) findViewById(R.id.buttonLM2)).setText(down.getSlm2());

        ((Button) findViewById(R.id.buttonP2)).setText(down.getSp2());
        ((Button) findViewById(R.id.buttonP1)).setText(down.getSp1());
        ((Button) findViewById(R.id.buttonC)).setText(down.getSc());
        ((Button) findViewById(R.id.buttonM1)).setText(down.getSm1());

        ((Button) findViewById(R.id.buttonRP2)).setText(down.getSrp2());
        ((Button) findViewById(R.id.buttonRP1)).setText(down.getSrp1());
        ((Button) findViewById(R.id.buttonR)).setText(down.getSr());
        ((Button) findViewById(R.id.buttonRM1)).setText(down.getSrm1());
        ((Button) findViewById(R.id.buttonRM2)).setText(down.getSrm2());

        final Button buttonL = findViewById(R.id.buttonL);
        final Button buttonR = findViewById(R.id.buttonR);

        buttonR.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(bs.getPathCounter() == bs.getFrames().size() - 1) {
                    Toast.makeText(getApplicationContext(), "Match", Toast.LENGTH_LONG).show();
                } else if (bs.getFrames().get(bs.getPathCounter() + 1) instanceof Right) {
                    Intent activityChangeIntent =
                            new Intent(DownActivity.this, RainbowActivity.class);
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
                            new Intent(DownActivity.this, RainbowActivity.class);
                    startActivity(activityChangeIntent);
                    bs.incrementPathCounter();
                } else Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_LONG).show();

            }
        });
    }
}
