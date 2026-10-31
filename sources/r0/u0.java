package r0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
