package cool.superfcking.apps.sanrafaeltourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.restaurant_one)));
        locations.add(new Location(getString(R.string.restaurant_two)));
        locations.add(new Location(getString(R.string.restaurant_three)));
        locations.add(new Location(getString(R.string.restaurant_four)));

        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.category_restaurants);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
