package r0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
