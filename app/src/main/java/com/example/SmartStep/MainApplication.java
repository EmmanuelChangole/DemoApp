package com.example.SmartStep;

import android.app.Application;

import com.mapbox.mapboxsdk.Mapbox;

import io.mapwize.mapwizesdk.core.MapwizeConfiguration;

/**
 * This is a demo application for Navisens indoor location provider.
 * After asking for location permission, this app will run a NavisensIndoorLocationProvider with Mapwize.
 * Click on the map to set a user location then walk with your device to see your location moving based on Navisens data.
 */
public class MainApplication extends android.app.Application {

    // This is a demo key, giving you access to the demo building. It is not allowed to use it for production.
    // The key might change at any time without notice. Get your key by signin up at mapwize.io
    static final String MAPWIZE_API_KEY = "63b20610cb5ac03ec410c5ecd17b7b74";
    static final String NAVISENS_API_KEY = "6D6Ru9CRrdA0kjyoh5wEuT7YH4NyHsOf1b9O9yI0rKBNRAZa3dkwoBG9Ox0NkEUl";


    @Override
    public void onCreate() {
        super.onCreate();
        Mapbox.getInstance(this, "pk.mapwize");
        // Mapwize globale initialization
        MapwizeConfiguration config = new MapwizeConfiguration.Builder(this, MAPWIZE_API_KEY).build();
        MapwizeConfiguration.start(config);
    }

}