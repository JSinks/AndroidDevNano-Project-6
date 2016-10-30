package cool.superfcking.apps.sanrafaeltourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.bar_one), R.drawable.beer));
        locations.add(new Location(getString(R.string.bar_two), R.drawable.cocktail));

        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.category_bars);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
