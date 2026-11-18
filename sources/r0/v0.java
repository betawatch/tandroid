package r0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
