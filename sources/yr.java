// default package

import android.os.Looper;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class yr extends uze {
    public static volatile yr b;
    public final xc3 a = new xc3();

    public static yr a() {
        if (b != null) {
            return b;
        }
        synchronized (yr.class) {
            if (b == null) {
                b = new yr();
            }
        }
        return b;
    }

    public final void b(Runnable runnable) {
        xc3 xc3Var = this.a;
        if (xc3Var.c == null) {
            synchronized (xc3Var.a) {
                if (xc3Var.c == null) {
                    xc3Var.c = xc3.a(Looper.getMainLooper());
                }
            }
        }
        xc3Var.c.post(runnable);
    }
}
