// default package

import android.os.Looper;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xs extends dxe {
    public static volatile xs b;
    public final qd3 a = new qd3();

    public static xs a() {
        if (b != null) {
            return b;
        }
        synchronized (xs.class) {
            if (b == null) {
                b = new xs();
            }
        }
        return b;
    }

    public final void b(Runnable runnable) {
        qd3 qd3Var = this.a;
        if (qd3Var.c == null) {
            synchronized (qd3Var.a) {
                if (qd3Var.c == null) {
                    qd3Var.c = qd3.a(Looper.getMainLooper());
                }
            }
        }
        qd3Var.c.post(runnable);
    }
}
