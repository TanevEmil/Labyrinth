package de.tanev.labyrinth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import de.tanev.labyrinth.model.BinarySearch;
import de.tanev.labyrinth.model.Renderer;
import de.tanev.labyrinth.model.renderer.Down;
import de.tanev.labyrinth.model.renderer.Up;

public class RainbowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rainbow_activity);

        final BinarySearch bs = BinarySearch.getInstance();
        Renderer rainbow = bs.getFrames().get(bs.getPathCounter());

        ((Button) findViewById(R.id._buttonLM1)).setText(rainbow.getSlm1());
        ((Button) findViewById(R.id._buttonL)).setText(rainbow.getSl());
        ((Button) findViewById(R.id._buttonLP1)).setText(rainbow.getSlp1());

        ((Button) findViewById(R.id._buttonP2)).setText(rainbow.getSp2());
        ((Button) findViewById(R.id._buttonP1)).setText(rainbow.getSp1());
        ((Button) findViewById(R.id._buttonC)).setText(rainbow.getSc());
        ((Button) findViewById(R.id._buttonM1)).setText(rainbow.getSm1());
        ((Button) findViewById(R.id._buttonM2)).setText(rainbow.getSm2());

        ((Button) findViewById(R.id._buttonRP1)).setText(rainbow.getSrp1());
        ((Button) findViewById(R.id._buttonR)).setText(rainbow.getSr());
        ((Button) findViewById(R.id._buttonRM1)).setText(rainbow.getSrm1());

        final Button _buttonP1 = findViewById(R.id._buttonP1);
        final Button _buttonM1 = findViewById(R.id._buttonM1);

        _buttonP1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(bs.getPathCounter() == bs.getFrames().size() - 1) {
                    Toast.makeText(getApplicationContext(), "Match!!!", Toast.LENGTH_LONG).show();
                    BinarySearch.deleteInstance();                    Intent activityChangeIntent =
                            new Intent(RainbowActivity.this, MainActivity.class);
                    startActivity(activityChangeIntent);
                } else if (bs.getFrames().get(bs.getPathCounter() + 1) instanceof Up){
                    Intent activityChangeIntent =
                            new Intent(RainbowActivity.this, MainActivity.class);
                    RainbowActivity.this.startActivity(activityChangeIntent);
                    startActivity(activityChangeIntent);
                    bs.incrementPathCounter();
                } else Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_LONG).show();
            }
        });
        _buttonM1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(bs.getPathCounter() == bs.getFrames().size() - 1) {
                    Toast.makeText(getApplicationContext(), "Match!!!", Toast.LENGTH_LONG).show();
                    BinarySearch.deleteInstance();
                    Intent activityChangeIntent =
                            new Intent(RainbowActivity.this, MainActivity.class);
                    startActivity(activityChangeIntent);
                } else if (bs.getFrames().get(bs.getPathCounter() + 1) instanceof Down) {
                    Intent activityChangeIntent =
                            new Intent(RainbowActivity.this, DownActivity.class);
                    RainbowActivity.this.startActivity(activityChangeIntent);
                    startActivity(activityChangeIntent);
                    bs.incrementPathCounter();
                } else Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_LONG).show();
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}

