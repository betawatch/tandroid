package r0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
