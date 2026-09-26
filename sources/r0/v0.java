package r0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class v0 {
    public u0 a;

    public v0(int i10, long j3, Interpolator interpolator) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new t0(r0.b(i10, j3, interpolator));
        } else {
            this.a = new q0(i10, j3, interpolator);
        }
    }
}
