package se.nackademin.solarsystemplanetinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {

    List<DataItem> lstdata; // Deklarerar variabel
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE); //TODO Not instant
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView;
        textView = (TextView) findViewById(R.id.textView);

        //TODO Maintain/Save/Restore scroll position when returning to a ListView
        lstdata = new ArrayList<>();

        lstdata.add(new DataItem(R.drawable.thumbearth, "Earth"));
        lstdata.add(new DataItem(R.drawable.thumbjupiter, "Jupiter"));
        lstdata.add(new DataItem(R.drawable.thumbmars, "Mars"));
        lstdata.add(new DataItem(R.drawable.thumbmercury, "Mercury"));
        lstdata.add(new DataItem(R.drawable.thumbneptunus, "Neptune"));
        lstdata.add(new DataItem(R.drawable.thumbsaturnus, "Saturn"));
        lstdata.add(new DataItem(R.drawable.thumburanus, "Uranus"));
        lstdata.add(new DataItem(R.drawable.thumbvenus, "Venus"));

        ListView listView = (ListView)findViewById(R.id.ListView);

        CustomAdapter adapter = new CustomAdapter(this,R.layout.itemrow,lstdata);

        listView.setAdapter(adapter); // 3 linjer binder data till listview

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(); // skapar objekt
                intent.putExtra("planettext", lstdata.get(position).planetName); // lägger till data
                intent.putExtra("thumbplanet", lstdata.get(position).resIdThumbnail); // lägger till data
                /* putExtra skickar värde från en aktivitet till den andra
                int position & get(position)
                */

                if(position==0) {
                    DataItem.planetInfo = 1;
                    intent.setClass(MainActivity.this, Main2Activity.class); // sätter klass
                    startActivity(intent); // öppnar annan aktivitet
                }

                if(position==1) {
                    DataItem.planetInfo = 2;
                    intent.setClass(MainActivity.this, Main2Activity.class); // sätter klass
                    startActivity(intent); // öppnar annan aktivitet
                }

                if(position==2) {
                    DataItem.planetInfo = 3;
                    intent.setClass(MainActivity.this, Main2Activity.class); // sätter klass
                    startActivity(intent); // öppnar annan aktivitet
                }

                if(position==3) {
                    DataItem.planetInfo = 4;
                    intent.setClass(MainActivity.this, Main2Activity.class); // sätter klass
                    startActivity(intent); // öppnar annan aktivitet
                }

                if(position==4) {
                    DataItem.planetInfo = 5;
                    intent.setClass(MainActivity.this, Main2Activity.class); // sätter klass
                    startActivity(intent); // öppnar annan aktivitet
                }

                if(position==5) {
                    DataItem.planetInfo = 6;
                    intent.setClass(MainActivity.this, Main2Activity.class); // sätter klass
                    startActivity(intent); // öppnar annan aktivitet
                }

                if(position==6) {
                    DataItem.planetInfo = 7;
                    intent.setClass(MainActivity.this, Main2Activity.class); // sätter klass
                    startActivity(intent); // öppnar annan aktivitet
                }

                if(position==7) {
                    DataItem.planetInfo = 8;
                    intent.setClass(MainActivity.this, Main2Activity.class); // sätter klass
                    startActivity(intent); // öppnar annan aktivitet
                }
            }
        });


    }
}
