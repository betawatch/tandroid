// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
