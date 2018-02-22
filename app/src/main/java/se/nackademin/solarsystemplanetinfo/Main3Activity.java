package se.nackademin.solarsystemplanetinfo;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {
    ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE); //
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        imageView2 = (ImageView) findViewById(R.id.imageView2);

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });
    }

    public void onConfigurationChanged(Configuration newConfig) { //TODO Landscape bugg?
        super.onConfigurationChanged(newConfig);
        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {

            imageView2.setImageResource(R.drawable.startplanetb);

        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {

            imageView2.setImageResource(R.drawable.startplaneta);


        }
    }

    public void openMainActivity() { //Varför vill den inte vara innanför oncreate?
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}

// Försök till landscape change
/*
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {

            imageView2.setImageResource(R.drawable.startplanetb);

        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {

            imageView2.setImageResource(R.drawable.startplaneta);
 */