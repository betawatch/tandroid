// default package

import android.os.Looper;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
