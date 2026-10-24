package r4;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public abstract class g {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
