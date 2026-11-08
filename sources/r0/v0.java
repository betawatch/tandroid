package r0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class v0 {
    public u0 a;

    public v0(int i7, long j3, Interpolator interpolator) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new t0(r0.b(i7, j3, interpolator));
        } else {
            this.a = new q0(i7, j3, interpolator);
        }
    }
}
