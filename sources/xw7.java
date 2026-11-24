// default package

import android.app.ActivityManager;
import android.os.Build;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class xw7 {
    public static final boolean a;

    static {
        ClassLoader classLoader;
        char[] cArr = yw7.d;
        boolean z = true;
        if (!vod.a("robolectric", Build.FINGERPRINT) && (((classLoader = yw7.class.getClassLoader()) == null || (classLoader.getResource("androidx/test/espresso/Espresso.class") == null && classLoader.getResource("org/junit/runner/Runner.class") == null && classLoader.getResource("androidx/test/platform/app/InstrumentationRegistry.class") == null)) && !ActivityManager.isRunningInTestHarness())) {
            z = false;
        }
        a = z;
    }
}
