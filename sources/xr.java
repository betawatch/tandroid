// default package

import android.os.Looper;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class xr extends bve {
    public static volatile xr b;
    public final ec3 a = new ec3();

    public static xr a() {
        if (b != null) {
            return b;
        }
        synchronized (xr.class) {
            if (b == null) {
                b = new xr();
            }
        }
        return b;
    }

    public final void b(Runnable runnable) {
        ec3 ec3Var = this.a;
        if (ec3Var.c == null) {
            synchronized (ec3Var.a) {
                if (ec3Var.c == null) {
                    ec3Var.c = ec3.a(Looper.getMainLooper());
                }
            }
        }
        ec3Var.c.post(runnable);
    }
}
