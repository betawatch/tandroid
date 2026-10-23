package r0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
