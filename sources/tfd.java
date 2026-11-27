// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class tfd {
    public static final ffd a;

    static {
        ffd ffdVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            ffdVar = new ffd((byte) 0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            ffdVar = new ffd((byte) 1);
        }
        a = ffdVar;
    }
}
