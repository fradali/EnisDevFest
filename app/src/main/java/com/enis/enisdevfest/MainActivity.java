package com.enis.enisdevfest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.JsonReader;

import com.enis.config.Configuration;
import com.enis.data.Accommodation;
import com.enis.data.AccommodationContainer;
import com.enis.robospice.BaseSampleSpiceActivity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.octo.android.robospice.persistence.DurationInMillis;
import com.octo.android.robospice.persistence.exception.SpiceException;
import com.octo.android.robospice.request.listener.RequestListener;
import com.octo.android.robospice.request.simple.SimpleTextRequest;

import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import roboguice.util.temp.Ln;

public class MainActivity extends BaseSampleSpiceActivity implements RequestListener<String> {

    private SimpleTextRequest loremRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loremRequest = new SimpleTextRequest(Configuration.SERVER + Configuration.API_ACCOM);

    }

    @Override
    protected void onStart() {
        super.onStart();

        setProgressBarIndeterminate(false);
        setProgressBarVisibility(true);

        getSpiceManager().execute(loremRequest, "txt", DurationInMillis.ONE_MINUTE, this);
        // getSpiceManager().execute(imageRequest, EARTH_IMAGE_CACHE_KEY, 5 * DurationInMillis.ONE_MINUTE, new ImageRequestListener());
    }

    @Override
    public void onRequestFailure(SpiceException spiceException) {
        Ln.e("error de connexion");

    }

    @Override
    public void onRequestSuccess(String s) {

        Gson g = new Gson();
        AccommodationContainer ac = g.fromJson(s, AccommodationContainer.class);


    }

}


