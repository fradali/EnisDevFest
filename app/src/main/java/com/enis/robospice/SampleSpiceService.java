package com.enis.robospice;

/**
 * Created by ali on 21/11/15.
 */
import android.app.Application;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.octo.android.robospice.SpiceService;
import com.octo.android.robospice.persistence.CacheManager;
import com.octo.android.robospice.persistence.binary.InFileBitmapObjectPersister;
import com.octo.android.robospice.persistence.exception.CacheCreationException;
import com.octo.android.robospice.persistence.string.InFileStringObjectPersister;


public class SampleSpiceService extends SpiceService {

    @Override
    public CacheManager createCacheManager(Application application) throws CacheCreationException {
        CacheManager cacheManager = new CacheManager();

        // init
        InFileStringObjectPersister inFileStringObjectPersister = new InFileStringObjectPersister(application);
        InFileBitmapObjectPersister inFileBitmapObjectPersister = new InFileBitmapObjectPersister(application);

        cacheManager.addPersister(inFileStringObjectPersister);
        cacheManager.addPersister(inFileBitmapObjectPersister);
        return cacheManager;
    }

    @Override
    public int getThreadCount() {
        return 3;
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        Log.v("SampleSpiceService","Starting service");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.v("SampleSpiceService","Starting service");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.v("SampleSpiceService","Stopping service");
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.v("SampleSpiceService","Bound service");
        return super.onBind(intent);
    }

    @Override
    public void onRebind(Intent intent) {
        Log.v("SampleSpiceService","Rebound service");
        super.onRebind(intent);
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.v("SampleSpiceService","Unbound service");
        return super.onUnbind(intent);
    }
}