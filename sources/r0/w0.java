package r0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class w0 {
    public v0 a;

    public w0(int i10, long j3, Interpolator interpolator) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new u0(r0.b(i10, j3, interpolator));
        } else {
            this.a = new q0(i10, j3, interpolator);
        }
    }
}
