package r0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
