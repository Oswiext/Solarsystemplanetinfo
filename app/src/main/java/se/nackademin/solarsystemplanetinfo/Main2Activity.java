package se.nackademin.solarsystemplanetinfo;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    private Button button1;
    int point;
    TextView iAvstandsolen;
    TextView iAvstandjorden;
    TextView iDiameter;
    TextView iTemperatur;
    TextView iAtmosfar;
    TextView iDygnlangd;
    TextView iArslangd;
    TextView iManar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        TextView textView; // Två eller en rad funkar både och
        textView = (TextView) findViewById(R.id.textView);

        TextView iAvstandsolen = (TextView) findViewById(R.id.iAvstandsolen); // En rad eller två funkar både och
        TextView iAvstandjorden = (TextView) findViewById(R.id.iAvstandjorden);
        TextView iDiameter = (TextView) findViewById(R.id.iDiameter);
        TextView iTemperatur = (TextView) findViewById(R.id.iTemperatur);
        TextView iAtmosfar = (TextView) findViewById(R.id.iAtmosfar);
        TextView iDygnlangd = (TextView) findViewById(R.id.iDygnlangd);
        TextView iArslangd = (TextView) findViewById(R.id.iArslangd);
        TextView iManar = (TextView) findViewById(R.id.iManar);

        //getString(R.string.earthInfo); behövs inte, den får stringen direkt om man talar om från vart

        // Source: http://www.ungafakta.se/stjarnorplaneter/himlakroppar/himlakroppar.asp
        if (DataItem.planetInfo == 1) {
            textView.setText(R.string.earthInfo);

            iAvstandsolen.setText(R.string.avstandsoleneartha);
            iAvstandjorden.setText(R.string.avstandjordeneartha);
            iDiameter.setText(R.string.diametereartha);
            iTemperatur.setText(R.string.temperatureartha);
            iAtmosfar.setText(R.string.atmosfareartha);
            iDygnlangd.setText(R.string.dygnlangdeartha);
            iArslangd.setText(R.string.arslangdeartha);
            iManar.setText(R.string.manareartha);

            //("Avstånd från Solen:\tCirka 150 miljoner km \n \n Ekvatorns diameter:\t12 140 km \n \n Temperatur solsidan:\tCirka 25 °C (medeltal) \n \n Temperatur nattsidan:\tCirka 15 °C (medeltal) \n \n Atmosfär:\tMest kväve och syre \n \n Dygnets längd:\t24 timmar \n \n Årets längd:\t365,24 dygn \n \n Antal månar:\t1");
        }

        if (DataItem.planetInfo == 2) {
            textView.setText(R.string.jupiterInfo);

            iAvstandsolen.setText(R.string.avstandsolenjupitera);
            iAvstandjorden.setText(R.string.avstandjordenjupitera);
            iDiameter.setText(R.string.diameterjupitera);
            iTemperatur.setText(R.string.temperaturjupitera);
            iAtmosfar.setText(R.string.atmosfarjupitera);
            iDygnlangd.setText(R.string.dygnlangdjupitera);
            iArslangd.setText(R.string.arslangdjupitera);
            iManar.setText(R.string.manarjupitera);

            //("Avstånd från Solen:\tCirka 778 miljoner km  \n \n Avstånd från Jorden:\tCirka 588 miljoner km \n \n Ekvatorns diameter:\t142 800 km \n \n Temperatur i molntäcket:\tCirka -150 °C (medeltal) \n \n Temperatur nattsidan:\tCirka -85 °C (medeltal) \n \n Atmosfär:\tMest väte och helium \n \n Dygnets längd:\t9 timmar 50 minuter \n \n Årets längd:\t11,9 jordiska år \n \n Antal månar:\t63 (kända, man tror att det finns fler)");
        }

        if (DataItem.planetInfo == 3) {
            textView.setText(R.string.marsInfo);

            iAvstandsolen.setText(R.string.avstandsolenmarsa);
            iAvstandjorden.setText(R.string.avstandjordenmarsa);
            iDiameter.setText(R.string.diametermarsa);
            iTemperatur.setText(R.string.temperaturmarsa);
            iAtmosfar.setText(R.string.atmosfarmarsa);
            iDygnlangd.setText(R.string.dygnlangdmarsa);
            iArslangd.setText(R.string.arslangdmarsa);
            iManar.setText(R.string.manarmarsa);

            //("Avstånd från Solen:\tCirka 228 miljoner km \n \n Avstånd från Jorden:\tCirka 56 miljoner km \n \n Ekvatorns diameter:\t6 778 km \n \n Temperatur solsidan:\tCirka -33 °C (medeltal) \n \n Temperatur nattsidan:\tCirka -85 °C (medeltal) \n \n Atmosfär:\tMest koldioxid \n \n Dygnets längd:\t24 timmar 39 minuter \n \n Årets längd:\t687 dygn \n \n Antal månar:\t2");
        }

        if (DataItem.planetInfo == 4) {
            textView.setText(R.string.mercuryInfo);

            iAvstandsolen.setText(R.string.avstandsolenmercurya);
            iAvstandjorden.setText(R.string.avstandjordenmercurya);
            iDiameter.setText(R.string.diametermercurya);
            iTemperatur.setText(R.string.temperaturmercurya);
            iAtmosfar.setText(R.string.atmosfarmercurya);
            iDygnlangd.setText(R.string.dygnlangdmercurya);
            iArslangd.setText(R.string.arslangdmercurya);
            iManar.setText(R.string.manarmercurya);

            //("Avstånd från Solen:\tCirka 60 miljoner km \n \n Avstånd från Jorden:\tCirka 70 miljoner km \n \n Ekvatorns diameter:\t4 878 km \n \n Temperatur solsidan:\t430°C \n \n Temperatur nattsidan:\t-170°C \n \n Atmosfär:\tIngen \n \n Dygnets längd:\t176 jord-dygn \n \n Årets längd:\t88 jord-dygn \n \n Antal månar:\t0");
        }

        if (DataItem.planetInfo == 5) {
            textView.setText(R.string.neptunusInfo);

            iAvstandsolen.setText(R.string.avstandsolenneptunusa);
            iAvstandjorden.setText(R.string.avstandjordenneptunusa);
            iDiameter.setText(R.string.diameterneptunusa);
            iTemperatur.setText(R.string.temperaturneptunusa);
            iAtmosfar.setText(R.string.atmosfarneptunusa);
            iDygnlangd.setText(R.string.dygnlangdneptunusa);
            iArslangd.setText(R.string.arslangdneptunusa);
            iManar.setText(R.string.manarneptunusa);

            //("Avstånd från Solen:\tCirka 4 497 miljoner km \n \n Avstånd från Jorden:\tCirka 4 306 miljoner km \n \n Ekvatorns diameter:\t49 000 km \n \n Temperatur i molntäcket:\tCirka -240 °C (medeltal) \n \n Atmosfär:\tMest väte och helium \n \n Dygnets längd:\t18 timmar \n \n Årets längd:\t165 jordiska år \n \n Antal månar:\t13 (kan finnas fler)");
        }

        if (DataItem.planetInfo == 6) {
            textView.setText(R.string.saturnusInfo);

            iAvstandsolen.setText(R.string.avstandsolensaturnusa);
            iAvstandjorden.setText(R.string.avstandjordensaturnusa);
            iDiameter.setText(R.string.diametersaturnusa);
            iTemperatur.setText(R.string.temperatursaturnusa);
            iAtmosfar.setText(R.string.atmosfarsaturnusa);
            iDygnlangd.setText(R.string.dygnlangdsaturnusa);
            iArslangd.setText(R.string.arslangdsaturnusa);
            iManar.setText(R.string.manarsaturnusa);

            //("Avstånd från Solen:\tCirka 1 430 miljoner km \n \n Avstånd från Jorden:\tCirka 1 195miljoner km \n \n Ekvatorns diameter:\t120 000 km \n \n Temperatur i molntäcket:\tCirka -190 °C (medeltal) \n \n Atmosfär:\tMest väte och helium \n \n Dygnets längd:\t10 timmar 45 minuter \n \n Årets längd:\t29,5 jordiska år \n \n Antal månar:\t56 (kända, man tror att det finns fler)");
        }

        if (DataItem.planetInfo == 7) {
            textView.setText(R.string.uranusInfo);

            iAvstandsolen.setText(R.string.avstandsolenuranusa);
            iAvstandjorden.setText(R.string.avstandjordenuranusa);
            iDiameter.setText(R.string.diameteruranusa);
            iTemperatur.setText(R.string.temperatururanusa);
            iAtmosfar.setText(R.string.atmosfaruranusa);
            iDygnlangd.setText(R.string.dygnlangduranusa);
            iArslangd.setText(R.string.arslangduranusa);
            iManar.setText(R.string.manaruranusa);

            //("Avstånd från Solen:\tCirka 2 870 miljoner km \n \n Avstånd från Jorden:\tCirka 2 582 miljoner km \n \n Ekvatorns diameter:\t52 000 km \n \n Temperatur i molntäcket:\tCirka -220 °C (medeltal) \n \n Atmosfär:\tMest väte och helium \n \n Dygnets längd:\t16 timmar \n \n Årets längd:\t84 jordiska år \n \n Antal månar:\t27 (kan finnas fler)");
        }

        if (DataItem.planetInfo == 8) {
            textView.setText(R.string.venusInfo);

            iAvstandsolen.setText(R.string.avstandsolenvenusa);
            iAvstandjorden.setText(R.string.avstandjordenvenusa);
            iDiameter.setText(R.string.diametervenusa);
            iTemperatur.setText(R.string.temperaturvenusa);
            iAtmosfar.setText(R.string.atmosfarvenusa);
            iDygnlangd.setText(R.string.dygnlangdvenusa);
            iArslangd.setText(R.string.arslangdvenusa);
            iManar.setText(R.string.manarvenusa);

            //("Avstånd från Solen:\tCirka 108 miljoner km \n \n Avstånd från Jorden:\tCirka 40 miljoner km \n \n Ekvatorns diameter:\t12 140 km \n \n Medeltemperatur:\tCirka 737 °C \n \n Atmosfär:\tMest väte och helium \n \n Dygnets längd:\t117 jord-dygn \n \n Årets längd:\t225 jord-dygn \n \n Antal månar:\t0");
        }

        TextView planetNames;
        planetNames = (TextView) findViewById(R.id.planetNames);

        planetNames.setText(getIntent().getStringExtra("planettext"));
        imageView.setImageResource(getIntent().getIntExtra("thumbplanet", R.drawable.thumbearth));
        //getintextra har stringname, int defaultvalue. Thumbearth är default
        // getintextra för det vi skickar från mainactivity thumbplanet är resIdThumbnail som är en int från dataitem

        iAvstandsolen = (TextView) findViewById(R.id.iAvstandsolen);
        iAvstandsolen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DataItem.compareinfo = 1;
                    startActivity(new Intent(Main2Activity.this, Main4Activity.class));
            }
        });

        iAvstandjorden = (TextView) findViewById(R.id.iAvstandjorden);
        iAvstandjorden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DataItem.compareinfo = 2;
                Intent intent1 = new Intent();
                    intent1.setClass(Main2Activity.this, Main4Activity.class); // sätter klass
                    startActivity(intent1); // öppnar annan aktivitet
            }
        });

        iDiameter = (TextView) findViewById(R.id.iDiameter);
        iDiameter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DataItem.compareinfo = 3;
                startActivity(new Intent(Main2Activity.this, Main4Activity.class));
            }
        });

        iTemperatur = (TextView) findViewById(R.id.iTemperatur);
        iTemperatur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DataItem.compareinfo = 4;
                startActivity(new Intent(Main2Activity.this, Main4Activity.class));
            }
        });

        iAtmosfar = (TextView) findViewById(R.id.iAtmosfar);
        iAtmosfar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DataItem.compareinfo = 5;
                startActivity(new Intent(Main2Activity.this, Main4Activity.class));
            }
        });

        iDygnlangd = (TextView) findViewById(R.id.iDygnlangd);
        iDygnlangd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DataItem.compareinfo = 6;
                startActivity(new Intent(Main2Activity.this, Main4Activity.class));
            }
        });

        iArslangd = (TextView) findViewById(R.id.iArslangd);
        iArslangd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DataItem.compareinfo = 7;
                startActivity(new Intent(Main2Activity.this, Main4Activity.class));
            }
        });

        iManar = (TextView) findViewById(R.id.iManar);
        iManar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DataItem.compareinfo = 8;
                startActivity(new Intent(Main2Activity.this, Main4Activity.class));
            }
        });


        button1 = (Button) findViewById(R.id.backButton); // 1. java declared button1. 2. android.widget Button. 3. XML backButton id
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });

    }

    public void openMainActivity() { //Varför vill den inte vara innanför oncreate?
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
