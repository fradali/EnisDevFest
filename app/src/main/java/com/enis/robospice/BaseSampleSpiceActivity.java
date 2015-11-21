package com.enis.robospice;

/**
 * Created by ali on 21/11/15.
 */
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

import com.octo.android.robospice.SpiceManager;

/**
 * This class is the base class of all activities of the sample project. This class offers all
 * subclasses an easy access to a {@link SpiceManager} that is linked to the {@link Activity}
 * lifecycle. Typically, in a new project, you will have to create a base class like this one and
 * copy the content of the {@link BaseSampleSpiceActivity} into your own class.
 * @author sni
 */
public abstract class BaseSampleSpiceActivity extends AppCompatActivity {
    private SpiceManager spiceManager = new SpiceManager(SampleSpiceService.class);

    @Override
    protected void onStart() {
        spiceManager.start(this);
        super.onStart();
    }

    @Override
    protected void onStop() {
        spiceManager.shouldStop();
        super.onStop();
    }

    protected SpiceManager getSpiceManager() {
        return spiceManager;
    }

}
