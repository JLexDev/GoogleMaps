package jlexdev.com.googlemapshp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class FirstMapActivity extends AppCompatActivity implements OnMapReadyCallback{

    private FirstMapFragment firstMapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_map);

        firstMapFragment = FirstMapFragment.newInstance();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.activity_first_map, firstMapFragment)
                .commit();

        // Registro escucha onMapReadyCallback
        firstMapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        // Apuntar una ubicación
        LatLng trujillo = new LatLng(-8.101036, -79.011466);

        googleMap
                .addMarker(new MarkerOptions()
                .position(trujillo)
                .title("My Home :)"));

        CameraPosition cameraPosition = CameraPosition.builder()
                .target(trujillo)
                .zoom(15)
                .build();

        googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
    }
}
