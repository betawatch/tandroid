package r0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class w0 {
    public v0 a;

    public w0(int i10, long j10, Interpolator interpolator) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new u0(s0.b(i10, j10, interpolator));
        } else {
            this.a = new r0(i10, j10, interpolator);
        }
    }
}
