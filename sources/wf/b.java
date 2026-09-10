package wf;

import android.os.Build;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class b {
    public static final a a;

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            a = new qb.b(25);
        } else {
            a = new rb.a(25);
        }
    }
}
