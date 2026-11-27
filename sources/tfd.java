// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
