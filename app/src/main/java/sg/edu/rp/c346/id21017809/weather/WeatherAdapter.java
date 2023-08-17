package sg.edu.rp.c346.id21017809.weather;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WeatherAdapter extends ArrayAdapter<Weather>{

        Context parent_context;
        int layout_id;
        ArrayList<Weather> al;

    public WeatherAdapter(Context context, int resource, ArrayList<Weather> objects) {
            super(context, resource, objects);

            parent_context = context;
            layout_id = resource;
            al = objects;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Obtain the LayoutInflater object
            LayoutInflater inflater = (LayoutInflater)
                    parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            // "Inflate" the View for each row
            View rowView = inflater.inflate(layout_id, parent, false);

            return rowView;
        }
}

