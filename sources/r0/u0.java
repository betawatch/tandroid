package r0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class u0 {
    public t0 a;

    public u0(int i10, long j10, Interpolator interpolator) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new s0(q0.b(i10, j10, interpolator));
        } else {
            this.a = new p0(i10, j10, interpolator);
        }
    }
}
