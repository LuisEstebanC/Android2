package com.example.finalp;

import android.os.Bundle;
import android.widget.Toast;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class Pubicaciones extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener, GoogleMap.OnInfoWindowClickListener {

    private GoogleMap mMap;
    private Marker markerPrueba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pubicaciones);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera



        LatLng salud = new LatLng(18.5094113, -69.8923432);
        mMap.addMarker(new MarkerOptions().position(salud).draggable(true).title("Centro De salud").snippet("Centro de salud ").icon(BitmapDescriptorFactory.fromResource(R.drawable.salud)));


        LatLng monjas = new LatLng(18.509410, -69.891796);
        mMap.addMarker(new MarkerOptions().position(monjas).title("Casa de las hermnas").snippet("Casa de las hermnas").icon(BitmapDescriptorFactory.fromResource(R.drawable.monjas)));


        LatLng parroquia = new LatLng(18.510546, -69.891847);
        mMap.addMarker(new MarkerOptions().position(parroquia).title("Parroquia").snippet("Parroquia ").icon(BitmapDescriptorFactory.fromResource(R.drawable.parroquia)));
        LatLng escuela = new LatLng(18.5110794, -69.8921382);
        mMap.addMarker(new MarkerOptions().position(escuela).title("Escuela Hogar pituca florez").snippet("Escuela hogar pituca florez").icon(BitmapDescriptorFactory.fromResource(R.drawable.escuela)));

        LatLng CIJE = new LatLng(18.509463 , -69.891545);
        markerPrueba =googleMap.addMarker(new MarkerOptions()
                    .position(CIJE)
        .title("CIJE, Centro Infantil Juvenil Enmanuel").snippet("Centro de estudios para todas las edades").icon(BitmapDescriptorFactory.fromResource(R.drawable.cije)));


        mMap.getUiSettings().setZoomControlsEnabled(true);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CIJE,18));

        googleMap.setOnMarkerClickListener(this);
        googleMap.setOnInfoWindowClickListener(this);

    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        if (marker.equals(markerPrueba)){
            Toast.makeText(this,"CIJE",Toast.LENGTH_SHORT).show();

        }
        return false;
    }

    @Override
    public void onInfoWindowClick(Marker marker) {
        if (marker.equals(markerPrueba)){
            InfoCIJE.newInstance(marker.getTitle(),getString(R.string.laInfoCIJE )).show(getSupportFragmentManager(),null);
        }

    }
}
