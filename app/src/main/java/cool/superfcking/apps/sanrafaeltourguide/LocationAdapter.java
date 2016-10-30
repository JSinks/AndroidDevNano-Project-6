package cool.superfcking.apps.sanrafaeltourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jsinclair on 30/10/16.
 */
public class LocationAdapter extends ArrayAdapter<Location>{

    private int mColorResource;

    public LocationAdapter(Context context, ArrayList<Location> locations, int colorResource) {
        super(context, 0, locations);
        mColorResource = colorResource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Location location = getItem(position);

        if (convertView == null ){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView locationName = (TextView) convertView.findViewById(R.id.text_name);
        locationName.setText(location.toString());

        TextView bkgText = (TextView) convertView.findViewById(R.id.text_name);
        bkgText.setBackgroundResource(mColorResource);

        ImageView image = (ImageView) convertView.findViewById(R.id.icon_list);
        if(location.hasImage()){
            image.setVisibility(View.GONE);
        } else {
            image.setImageResource(location.getImageResourceId());
        }

        return convertView;

    }

}
