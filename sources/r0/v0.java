package r0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class v0 {
    public u0 a;

    public v0(int i3, long j10, Interpolator interpolator) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new t0(r0.b(i3, j10, interpolator));
        } else {
            this.a = new q0(i3, j10, interpolator);
        }
    }
}
