package r0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
