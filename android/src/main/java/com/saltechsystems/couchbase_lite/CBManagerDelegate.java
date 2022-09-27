package com.saltechsystems.couchbase_lite;

import android.content.Context;
import android.content.res.AssetManager;

public interface CBManagerDelegate {
    String lookupKeyForAsset(String asset);
     AssetManager getAssets();
     Context getContext();
}
