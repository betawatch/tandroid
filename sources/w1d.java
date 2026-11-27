// default package

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class w1d {
    public v1d a;

    public w1d(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new u1d(uc3.b(i, interpolator, j));
        } else {
            this.a = new s1d(i, interpolator, j);
        }
    }
}
