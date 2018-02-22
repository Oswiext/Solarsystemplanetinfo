package se.nackademin.solarsystemplanetinfo;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    TextView compareText1;
    TextView compareTitle;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        TextView compareText1 = (TextView) findViewById(R.id.compareText1);
        TextView compareText2 = (TextView) findViewById(R.id.compareText2);
        TextView compareText3 = (TextView) findViewById(R.id.compareText3);
        TextView compareText4 = (TextView) findViewById(R.id.compareText4);
        TextView compareText5 = (TextView) findViewById(R.id.compareText5);
        TextView compareText6 = (TextView) findViewById(R.id.compareText6);
        TextView compareText7 = (TextView) findViewById(R.id.compareText7);
        TextView compareText8 = (TextView) findViewById(R.id.compareText8);

        TextView comparetitle = (TextView) findViewById(R.id.comparetitle);
        comparetitle.setText(R.string.comparetra);

        if (DataItem.compareinfo == 1) {
            compareText1.setText(R.string.avstandsolenearthb);
            compareText2.setText(R.string.avstandsolenjupiterb);
            compareText3.setText(R.string.avstandsolenmarsb);
            compareText4.setText(R.string.avstandsolenmercuryb);
            compareText5.setText(R.string.avstandsolenneptunusb);
            compareText6.setText(R.string.avstandsolensaturnusb);
            compareText7.setText(R.string.avstandsolenuranusb);
            compareText8.setText(R.string.avstandsolenvenusb);

        }
        if (DataItem.compareinfo == 2) {
            DataItem.planetInfo = 2;
            compareText1.setText(R.string.avstandjordenearthb);
            compareText2.setText(R.string.avstandjordenjupiterb);
            compareText3.setText(R.string.avstandjordenmarsb);
            compareText4.setText(R.string.avstandjordenmercuryb);
            compareText5.setText(R.string.avstandjordenneptunusb);
            compareText6.setText(R.string.avstandjordensaturnusb);
            compareText7.setText(R.string.avstandjordenuranusb);
            compareText8.setText(R.string.avstandjordenvenusb);
        }
        if (DataItem.compareinfo == 3) {
            compareText1.setText(R.string.diameterearthb);
            compareText2.setText(R.string.diameterjupiterb);
            compareText3.setText(R.string.diametermarsb);
            compareText4.setText(R.string.diametermercuryb);
            compareText5.setText(R.string.diameterneptunusb);
            compareText6.setText(R.string.diametersaturnusb);
            compareText7.setText(R.string.diameteruranusb);
            compareText8.setText(R.string.diametervenusb);
        }
        if (DataItem.compareinfo == 4) {
            compareText1.setText(R.string.temperaturearthb);
            compareText2.setText(R.string.temperaturjupiterb);
            compareText3.setText(R.string.temperaturmarsb);
            compareText4.setText(R.string.temperaturmercuryb);
            compareText5.setText(R.string.temperaturneptunusb);
            compareText6.setText(R.string.temperatursaturnusb);
            compareText7.setText(R.string.temperatururanusb);
            compareText8.setText(R.string.temperaturvenusb);
        }
        if (DataItem.compareinfo == 5) {
            compareText1.setText(R.string.atmosfarearthb);
            compareText2.setText(R.string.atmosfarjupiterb);
            compareText3.setText(R.string.atmosfarmarsb);
            compareText4.setText(R.string.atmosfarmercuryb);
            compareText5.setText(R.string.atmosfarneptunusb);
            compareText6.setText(R.string.atmosfarsaturnusb);
            compareText7.setText(R.string.atmosfaruranusb);
            compareText8.setText(R.string.atmosfarvenusb);
        }
        if (DataItem.compareinfo == 6) {
            compareText1.setText(R.string.dygnlangdearthb);
            compareText2.setText(R.string.dygnlangdjupiterb);
            compareText3.setText(R.string.dygnlangdmarsb);
            compareText4.setText(R.string.dygnlangdmercuryb);
            compareText5.setText(R.string.dygnlangdneptunusb);
            compareText6.setText(R.string.dygnlangdsaturnusb);
            compareText7.setText(R.string.dygnlangduranusb);
            compareText8.setText(R.string.dygnlangdvenusb);
        }
        if (DataItem.compareinfo == 7) {
            compareText1.setText(R.string.arslangdearthb);
            compareText2.setText(R.string.arslangdjupiterb);
            compareText3.setText(R.string.arslangdmarsb);
            compareText4.setText(R.string.arslangdmercuryb);
            compareText5.setText(R.string.arslangdneptunusb);
            compareText6.setText(R.string.arslangdsaturnusb);
            compareText7.setText(R.string.arslangduranusb);
            compareText8.setText(R.string.arslangdvenusb);
        }
        if (DataItem.compareinfo == 8) {
            compareText1.setText(R.string.manarearthb);
            compareText2.setText(R.string.manarjupiterb);
            compareText3.setText(R.string.manarmarsb);
            compareText4.setText(R.string.manarmercuryb);
            compareText5.setText(R.string.manarneptunusb);
            compareText6.setText(R.string.manarsaturnusb);
            compareText7.setText(R.string.manaruranusb);
            compareText8.setText(R.string.manarvenusb);
        }
        button2 = (Button) findViewById(R.id.menuButton); // 1. java declared button1. 2. android.widget Button. 3. XML backButton id
        button2.setOnClickListener(new View.OnClickListener() {
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
