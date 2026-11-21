package zi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.e20;
import org.telegram.messenger.ef;
import org.telegram.ui.Components.a50;
import org.telegram.ui.Components.b50;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.Components.sy0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ q0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ File e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ g0(u0 u0Var, q0 q0Var, long j3, File file, boolean z10) {
        this.b = u0Var;
        this.c = q0Var;
        this.d = j3;
        this.e = file;
        this.f = z10;
    }

    private final void a() {
        u0 u0Var = this.b;
        q0 q0Var = this.c;
        File file = this.e;
        long j3 = this.d;
        boolean z10 = this.f;
        synchronized (u0Var.g) {
            if (!u0Var.H && !q0Var.d && !q0Var.e) {
                q0Var.e = true;
                ((sy0) u0Var.e).b(q0Var.a, file.length(), file);
                u0Var.i.post(new g0(u0Var, q0Var, j3, file, z10));
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ry0 ry0Var;
        ry0 ry0Var2;
        switch (this.a) {
            case 0:
                a();
                return;
            default:
                u0 u0Var = this.b;
                q0 q0Var = this.c;
                long j3 = this.d;
                File file = this.e;
                boolean z10 = this.f;
                int i7 = u0Var.a0;
                if (i7 == 10 || i7 == 9) {
                    return;
                }
                u0Var.x(8);
                u0Var.m.b("output completed: generation=" + q0Var.a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z10);
                u0Var.m("completed");
                qf qfVar = u0Var.d;
                long j10 = q0Var.a;
                b50 b50Var = (b50) qfVar.b;
                a50 a50Var = b50Var.V;
                if (a50Var != null) {
                    b50Var.V = null;
                    b50Var.l0 = true;
                    sy0 sy0Var = b50Var.T;
                    if (sy0Var == null) {
                        ry0Var2 = null;
                    } else {
                        synchronized (sy0Var) {
                            try {
                                try {
                                    qy0 qy0Var = (qy0) sy0Var.c.get(Long.valueOf(j10));
                                    if (qy0Var == null || qy0Var.e) {
                                        ry0Var = new ry0(file.length(), null, null, null, null);
                                    } else {
                                        ry0Var = new ry0(Math.max(qy0Var.c, file.length()), qy0Var.f, qy0Var.g, qy0Var.h, qy0Var.i);
                                    }
                                    ry0Var2 = ry0Var;
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                        }
                    }
                    e20 t6 = b50Var.t(file, j3, ry0Var2);
                    t6.t = !z10;
                    ef efVar = new ef(0, file.getAbsolutePath(), 0, true, 0, 0);
                    efVar.x = a50Var.c;
                    efVar.y = a50Var.d;
                    b50Var.e.u(efVar, t6, a50Var.a, a50Var.b, 0, false, a50Var.e);
                    sy0 sy0Var2 = b50Var.T;
                    if (sy0Var2 != null) {
                        sy0Var2.d(false);
                    }
                    b50Var.T = null;
                    MediaController.B().Y(false);
                    if (b50Var.a0) {
                        b50Var.a0 = false;
                        b50Var.P = null;
                    }
                }
                if (u0Var.G) {
                    u0Var.s();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ g0(u0 u0Var, q0 q0Var, File file, long j3, boolean z10) {
        this.b = u0Var;
        this.c = q0Var;
        this.e = file;
        this.d = j3;
        this.f = z10;
    }
}
