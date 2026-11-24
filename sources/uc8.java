// default package

import android.media.metrics.LogSessionId;
import android.os.Build;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
