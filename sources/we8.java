// default package

import android.media.metrics.LogSessionId;
import android.os.Build;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class we8 {
    public static final we8 c;
    public final String a;
    public final ve8 b;

    static {
        new we8("");
        c = new we8("preload");
    }

    public we8(String str) {
        this.a = str;
        this.b = Build.VERSION.SDK_INT >= 31 ? new ve8() : null;
    }

    public final synchronized LogSessionId a() {
        ve8 ve8Var;
        ve8Var = this.b;
        ve8Var.getClass();
        return ve8Var.a;
    }
}
