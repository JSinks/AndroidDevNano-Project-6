package cool.superfcking.apps.sanrafaeltourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView barView = (TextView) findViewById(R.id.view_bars);
        TextView restaurantView = (TextView) findViewById(R.id.view_restaurants);
        TextView hotelView = (TextView) findViewById(R.id.view_hotels);
        TextView attractionView = (TextView) findViewById(R.id.view_attractions);

        restaurantView.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent restaurantIntent = new Intent(MainActivity.this, RestaurantActivity.class);
                startActivity(restaurantIntent);
            }
        });

        barView.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent barIntent = new Intent(MainActivity.this, BarActivity.class);
                startActivity(barIntent);
            }
        });

        hotelView.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent hotelIntent = new Intent(MainActivity.this, HotelActivity.class);
                startActivity(hotelIntent);
            }
        });

        attractionView.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent attractionIntent = new Intent(MainActivity.this, AttractionActivity.class);
                startActivity(attractionIntent);
            }
        });

    }
}
