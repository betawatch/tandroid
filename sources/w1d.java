// default package

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
