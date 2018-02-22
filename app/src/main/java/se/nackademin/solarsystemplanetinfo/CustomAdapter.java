package se.nackademin.solarsystemplanetinfo;

import android.app.Activity;
import android.content.Context;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Oskar on 2018-02-07.
 */
// kartlägger data från itemrow till dataitem
public class CustomAdapter extends ArrayAdapter<DataItem> { // customadapter extend arrayadapter widget
    Context context;
    int layoutResourceId;
    List<DataItem> data=null;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull List<DataItem> objects) {
        super(context, resource, objects); //Konstruktör som ersätter

        this.layoutResourceId = resource;
        this.context = context;
        this.data = objects;
    }
    static class DataHolder {
        ImageView ivplanet;
        TextView tvPlanet;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // ersätter och skapar en rad
        DataHolder holder = null;

        if(convertView==null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();

                    convertView = inflater.inflate(layoutResourceId, parent, false);

                holder = new DataHolder();
                holder.ivplanet = (ImageView)convertView.findViewById(R.id.ivPlanet);
                holder.tvPlanet = (TextView)convertView.findViewById(R.id.tvPlanet);

            convertView.setTag(holder);
        }
        else{
            holder = (DataHolder)convertView.getTag();
        }

        DataItem dataItem = data.get(position);
        holder.tvPlanet.setText(dataItem.planetName);
        holder.ivplanet.setImageResource(dataItem.resIdThumbnail);

        return convertView;
    }
}
