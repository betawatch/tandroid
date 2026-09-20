package xf;

import android.os.Build;
import na.d;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
