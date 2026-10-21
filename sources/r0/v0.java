package r0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
