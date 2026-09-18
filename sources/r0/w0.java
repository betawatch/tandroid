package r0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
