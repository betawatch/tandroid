// default package

import android.app.ActivityManager;
import android.os.Build;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class wu7 {
    public static final boolean a;

    static {
        ClassLoader classLoader;
        char[] cArr = xu7.d;
        boolean z = true;
        if (!smd.a("robolectric", Build.FINGERPRINT) && (((classLoader = xu7.class.getClassLoader()) == null || (classLoader.getResource("androidx/test/espresso/Espresso.class") == null && classLoader.getResource("org/junit/runner/Runner.class") == null && classLoader.getResource("androidx/test/platform/app/InstrumentationRegistry.class") == null)) && !ActivityManager.isRunningInTestHarness())) {
            z = false;
        }
        a = z;
    }
}
