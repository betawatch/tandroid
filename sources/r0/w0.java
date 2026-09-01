package r0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
