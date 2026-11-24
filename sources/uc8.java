// default package

import android.media.metrics.LogSessionId;
import android.os.Build;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class uc8 {
    public static final uc8 c;
    public final String a;
    public final tc8 b;

    static {
        new uc8("");
        c = new uc8("preload");
    }

    public uc8(String str) {
        this.a = str;
        this.b = Build.VERSION.SDK_INT >= 31 ? new tc8() : null;
    }

    public final synchronized LogSessionId a() {
        tc8 tc8Var;
        tc8Var = this.b;
        tc8Var.getClass();
        return tc8Var.a;
    }
}
