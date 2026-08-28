package r0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class w0 {
    public v0 a;

    public w0(int i9, long j10, Interpolator interpolator) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new u0(s0.b(i9, j10, interpolator));
        } else {
            this.a = new r0(i9, j10, interpolator);
        }
    }
}
