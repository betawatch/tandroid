package xf;

import android.os.Build;
import na.d;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final class b {
    public static final a a;

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            a = new d(26);
        } else {
            a = new ob.a(26);
        }
    }
}
