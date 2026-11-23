package zi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.d20;
import org.telegram.messenger.ef;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.Components.x40;
import org.telegram.ui.Components.y40;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                ((ry0) u0Var.e).b(q0Var.a, file.length(), file);
                u0Var.i.post(new g0(u0Var, q0Var, j3, file, z10));
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        qy0 qy0Var;
        qy0 qy0Var2;
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
                aa aaVar = u0Var.d;
                long j10 = q0Var.a;
                y40 y40Var = (y40) aaVar.b;
                x40 x40Var = y40Var.V;
                if (x40Var != null) {
                    y40Var.V = null;
                    y40Var.l0 = true;
                    ry0 ry0Var = y40Var.T;
                    if (ry0Var == null) {
                        qy0Var2 = null;
                    } else {
                        synchronized (ry0Var) {
                            try {
                                try {
                                    py0 py0Var = (py0) ry0Var.c.get(Long.valueOf(j10));
                                    if (py0Var == null || py0Var.e) {
                                        qy0Var = new qy0(file.length(), null, null, null, null);
                                    } else {
                                        qy0Var = new qy0(Math.max(py0Var.c, file.length()), py0Var.f, py0Var.g, py0Var.h, py0Var.i);
                                    }
                                    qy0Var2 = qy0Var;
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
                    d20 t6 = y40Var.t(file, j3, qy0Var2);
                    t6.t = !z10;
                    ef efVar = new ef(0, file.getAbsolutePath(), 0, true, 0, 0);
                    efVar.x = x40Var.c;
                    efVar.y = x40Var.d;
                    y40Var.e.u(efVar, t6, x40Var.a, x40Var.b, 0, false, x40Var.e);
                    ry0 ry0Var2 = y40Var.T;
                    if (ry0Var2 != null) {
                        ry0Var2.d(false);
                    }
                    y40Var.T = null;
                    MediaController.B().Y(false);
                    if (y40Var.a0) {
                        y40Var.a0 = false;
                        y40Var.P = null;
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
