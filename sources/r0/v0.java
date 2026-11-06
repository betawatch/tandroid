package r0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
