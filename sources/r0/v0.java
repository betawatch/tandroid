package r0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
