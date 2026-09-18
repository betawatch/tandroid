package xf;

import android.os.Build;
import na.d;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
