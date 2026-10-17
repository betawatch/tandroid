package r0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class v0 {
    public u0 a;

    public v0(int i10, long j10, Interpolator interpolator) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new t0(r0.b(i10, j10, interpolator));
        } else {
            this.a = new q0(i10, j10, interpolator);
        }
    }
}
