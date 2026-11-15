package r0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
