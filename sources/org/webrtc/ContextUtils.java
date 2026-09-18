package org.webrtc;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public class ContextUtils {
    private static final String TAG = "ContextUtils";
    private static Context applicationContext;

    @Deprecated
    public static Context getApplicationContext() {
        return applicationContext;
    }

    public static void initialize(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Application context cannot be null for ContextUtils.initialize.");
        }
        applicationContext = context;
    }
}
