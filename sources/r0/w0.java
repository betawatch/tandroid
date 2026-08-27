package r0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class w0 {
    public v0 a;

    public w0(int i10, long j10, Interpolator interpolator) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new u0(s0.b(i10, j10, interpolator));
        } else {
            this.a = new r0(i10, j10, interpolator);
        }
    }
}
