package r0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class w0 {
    public v0 a;

    public w0(int i10, long j10, Interpolator interpolator) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new u0(r0.b(i10, j10, interpolator));
        } else {
            this.a = new q0(i10, j10, interpolator);
        }
    }
}
