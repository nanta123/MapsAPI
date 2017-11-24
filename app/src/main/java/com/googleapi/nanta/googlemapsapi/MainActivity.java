package com.googleapi.nanta.googlemapsapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

-

public class MainActivity extends AppCompatActivity {
 import com.google.android.gms.maps.CameraUpdateFactory
 import com.google.android.gms.maps.GoogleMap
 import com.google.android.gms.maps.MapFragment
 import com.google.android.gms.maps.OnMapReadyCallback
 import com.google.android.gms.maps.model.CameraPosition
 import com.google.android.gms.maps.model.LatLng

         +

    LatLng IND = new LatLng(-6.175392, 106.827178);
    LatLng FRC = new LatLng(48.858270, 2.294509);
    LatLng USA = new LatLng(38.897678, -77.036477);
    LatLng AUS = new LatLng(-33.856820, 151.215279);

    MarkerOptions()

    m_map.addMarker(ina)
            m_map.addMarker(aust)

    France =new

    position(new LatLng(48.858270, 2.294509)
 .

    title("Eiffel Tower"))
            .

    icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)
 .

    MarkerOptions())

    UnitedState =new

    position(new LatLng(38.897678, -77.036477)
 .

    title("The White House"))
            .

    icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)
 .

    MarkerOptions())

    Australia =new

    position(new LatLng(-33.856820, 151.215279)
 .

    title("Sydney Opera House"))
            .

    icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)
 .
    public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

        static final CameraPosition NEWYORK = CameraPosition.builder()
                .target(new LatLng(40.784, -73.9857))
                .zoom(21)
                .bearing(0)
                .tilt(45)
                .build();
        static final CameraPosition SEATTLE = CameraPosition.builder()
                .target(new LatLng(47.6204, -122.3491))
                .zoom(17)
                .bearing(0)
                .tilt(45)
                .build();
        static final CameraPosition DUBLIN = CameraPosition.builder()
                .target(new LatLng(53.3478, -6.2597))
                .zoom(17)
                .bearing(90)
                .tilt(45)
                .build();
        static final CameraPosition TOKYO = CameraPosition.builder()
                +            .
        static final CameraPosition TOKYO = CameraPosition.builder()
                .target(new LatLng(35.6895, 139.6917))
                .zoom(17)
                .bearing(90)
                .tilt(45)
                .build();)
                +.
        final CameraPosition DUBLIN = CameraPosition.builder()
                .target(new LatLng(53.3478, -6.2597))
                .zoom(17)
                .bearing(90)
                .tilt(45)
                .build();
             .
        GoogleMap m_map;
             .
        boolean mapReady = false;
             .

        target(new LatLng(35.6895, 139.6917)

        zoom(17)

        bearing(90)

        build();

        MarkerOptions()

        position(new LatLng(-33.856820, 151.215279)


        title("Sydney Opera House")

        ina =new

        MarkerOptions()
                .

        position(new LatLng(-6.175392, 106.827178))
                .

        title("Monumen Nasional")

        aust =new

        tatic tilt(45)
                .
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Button btnSeattle = findViewById(R.id.btnSeattle);
            btnSeattle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mapReady)
                        flyTo(SEATTLE);
                }
            });

            Button btnDublin = findViewById(R.id.btnDublin);
            btnDublin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mapReady)
                        flyTo(DUBLIN);
                }
            });

            Button btnTokyo = findViewById(R.id.btnTokyo);
            btnTokyo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mapReady)
                        +flyTo(TOKYO);
                }
            });
            +
                    MapFragment
            mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);
        })
                .
        @Override
        public void onMapReady(GoogleMap map) {
            mapReady = true;
            m_map = map;
            m_map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
            flyTo(NEWYORK);
        }

        private void flyTo(CameraPosition target) {
            m_map.animateCamera(CameraUpdateFactory.newCameraPosition(target), 10000, null);
        }
    })

    public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

        static final CameraPosition INDONESIA = CameraPosition.builder()
                .target(new LatLng(-6.967854, 107.583750))
                .zoom(15)
                .bearing(0)
                .tilt(45)
                .build();
        GoogleMap m_map;
        boolean mapReady = false;
        LatLng IND = new LatLng(-6.967854, 107.583750);
        MarkerOptions Indonesia;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Indonesia = new MarkerOptions()
                    .position(new LatLng(-6.967854, 107.583750))
                    .title("Perumahan")
                    .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher));

            MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);
        }

        private void flyTo(CameraPosition target) {
            m_map.animateCamera(CameraUpdateFactory.newCameraPosition(target), 10000, null);
        }

        @Override
        public void onMapReady(GoogleMap map) {
            mapReady = true;
            m_map = map;
            map.moveCamera(CameraUpdateFactory.newCameraPosition(INDONESIA));
            map.addCircle(new CircleOptions()
                    .center(IND)
                    .radius(500)
                    .strokeColor(Color.GREEN)
                    .fillColor(Color.argb(64, 0, 255, 0)));
            m_map.addMarker(Indonesia);
        }

        @Override
        public void onStreetViewPanoramaReady(StreetViewPanorama panorama) {
            panorama.setPosition(new LatLng(-6.921932, 107.607639));
            panorama.setStreetNamesEnabled(false);
            StreetViewPanoramaCamera camera = new StreetViewPanoramaCamera.Builder()
                    .bearing(180)
                    .build();
            panorama.animateTo(camera, 10000);

        }

        public class MainActivity extends AppCompatActivity implements OnStreetViewPanoramaReadyCallback {

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                StreetViewPanoramaFragment streetViewPanoramaFragment = (StreetViewPanoramaFragment) getFragmentManager().findFragmentById(R.id.streetviewpanorama);
                streetViewPanoramaFragment.getStreetViewPanoramaAsync(this);

            }

            @Override
            public void onStreetViewPanoramaReady(StreetViewPanorama panorama) {
                panorama.setPosition(new LatLng(-6.921932, 107.607639));
                StreetViewPanoramaCamera camera = new StreetViewPanoramaCamera.Builder()
                        .bearing(180)
                        .build();
                panorama.animateTo(camera, 10000);

            }
        }
    }