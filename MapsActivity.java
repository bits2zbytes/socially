package com.mapp.socially;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * An activity that displays a Google map with a marker (pin) to indicate a particular location.
 */
// [START maps_marker_on_map_ready]
public class MapsActivity extends AppCompatActivity
        implements OnMapReadyCallback {

    private Bitmap BitMapMarker;
    private Bitmap BitMapMarker1;

    // [START_EXCLUDE]
    // [START maps_marker_get_map_async]
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_maps);
        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }
    // [END maps_marker_get_map_async]
    // [END_EXCLUDE]

    // [START_EXCLUDE silent]
    // [END_EXCLUDE]
    // [START maps_marker_on_map_ready_add_marker]
    // this function also marks the current location of the user

    @Override
    public void onMapReady(GoogleMap googleMap) {
        // [START_EXCLUDE silent]
        // Add a marker in Sydney, Australia,
        // and move the map's camera to the same location.
        // [END_EXCLUDE]

        //customizing marker
         BitmapDrawable bitmapdraw = (BitmapDrawable) getResources().getDrawable(R.drawable.currentlocationmarker);
              Bitmap b = bitmapdraw.getBitmap();
               BitMapMarker = Bitmap.createScaledBitmap(b, 100, 100, true);
               //customizing fridge marker

             BitmapDrawable bitmapdrawFridge = (BitmapDrawable) getResources().getDrawable(R.drawable.fridge);
             Bitmap c = bitmapdrawFridge.getBitmap();
             BitMapMarker1 = Bitmap.createScaledBitmap(c, 50, 100, true);

        LatLng sydney = new LatLng(-33.852, 151.211);
        googleMap.addMarker(new MarkerOptions()
                .position(sydney)
                .title("7 food packets present")
                .icon(BitmapDescriptorFactory.fromBitmap(BitMapMarker1)));
        LatLng place1 = new LatLng(-23, 119);
        googleMap.addMarker(new MarkerOptions()
                .position(place1)
                .title("8 food packets present")
                . icon (BitmapDescriptorFactory.fromBitmap(BitMapMarker1)));
        LatLng place2 = new LatLng(33.852, 80.21);
        googleMap.addMarker(new MarkerOptions()
                .position(place2)
                .title("0 food packets present.Needs Donation")
                . icon(BitmapDescriptorFactory.fromBitmap(BitMapMarker1)));
        LatLng place3 = new LatLng(28.704, 77.102);
        googleMap.addMarker(new MarkerOptions()
                .position(place3)
                .title("15 food packets present here")
                . icon(BitmapDescriptorFactory.fromBitmap(BitMapMarker1)));
        LatLng place4 = new LatLng(45.417, -77.10201);
        googleMap.addMarker(new MarkerOptions()
                .position(place4)
                .title("2 food packets present. Needs Donation")
                .icon(BitmapDescriptorFactory.fromBitmap(BitMapMarker1)));
        LatLng place5 = new LatLng(41.99, -81.101);
        googleMap.addMarker(new MarkerOptions()
                .position(place5)
                .title("Full capacity"). icon(BitmapDescriptorFactory.fromBitmap(BitMapMarker1)));

        LatLng place6 = new LatLng(42.10, -77.202);
        googleMap.addMarker(new MarkerOptions()
                .position(place6)
                .title("5 food packets present ")
                . icon(BitmapDescriptorFactory.fromBitmap(BitMapMarker1)));
        LatLng place7 = new LatLng(42.2808, -83.7430);
        googleMap.addMarker(new MarkerOptions()
                .position(place7)
                .title("User Location"). icon(BitmapDescriptorFactory.fromBitmap(BitMapMarker)));
        LatLng place8 = new LatLng(45.2808, -90.7430);
        googleMap.addMarker(new MarkerOptions()
                .position(place8)
                .title("10 food packets present"). icon(BitmapDescriptorFactory.fromBitmap(BitMapMarker1)));
        LatLng place9 = new LatLng(49.2808, -85.7430);
        googleMap.addMarker(new MarkerOptions()
                .position(place9)
                .title("30 food packets present "). icon(BitmapDescriptorFactory.fromBitmap(BitMapMarker1)));
        LatLng place10 = new LatLng(30.2808, -88.7430);
        googleMap.addMarker(new MarkerOptions()
                .position(place10)
                .title("1 food packets present.Needs Donation"). icon(BitmapDescriptorFactory.fromBitmap(BitMapMarker1)));
        LatLng place11 = new LatLng(35.2808, -5.7430);
        googleMap.addMarker(new MarkerOptions()
                .position(place11)
                .title("12 food packets present"). icon(BitmapDescriptorFactory.fromBitmap(BitMapMarker1)));
        LatLng place12 = new LatLng(21.2808, -80.7430);
        googleMap.addMarker(new MarkerOptions()
                .position(place12)
                .title("Full capacity"). icon(BitmapDescriptorFactory.fromBitmap(BitMapMarker1)));


        // [START_EXCLUDE silent]
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(place7));
        googleMap.animateCamera(CameraUpdateFactory.zoomTo(3));

        // [END_EXCLUDE]
    }
    // [END maps_marker_on_map_ready_add_marker]
}
// [END maps_marker_on_map_ready]
