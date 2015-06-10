package com.example.aparry.portfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

// ActionBarActivity
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @OnClick({R.id.spotify_button,
            R.id.build_it_bigger_button,
            R.id.scores_button,
            R.id.library_button,
            R.id.xyz_button,
            R.id.capstone_button
        })
    public void showAppToast(Button button) {
        Toast.makeText(this, String.format(getString(R.string.toast_message), button.getText()), Toast.LENGTH_SHORT).show();
    }
   /* public void showAppToast(View view) {
        // Get the text of the button
        Button b = (Button) view;
        String appDescription = b.getText().toString();

        // By default use the button text, but not always as sometimes it will
        // look off, e.g. "This button will launch my Library App app!"
        switch (view.getId()) {
            case R.id.scores_button:
                appDescription = "Scores";
                break;
            case R.id.library_button:
                appDescription = "Library";
                break;
            case R.id.capstone_button:
                appDescription = "Capstone";
                break;
            default:
                appDescription = b.getText().toString();
                break;
        }

        // Create the toast and show it
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, "This button will launch my " + appDescription + " app!", duration);
        toast.show();
    }*/
}
