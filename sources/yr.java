// default package

import android.os.Looper;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
