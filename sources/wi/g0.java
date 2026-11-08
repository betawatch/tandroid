package wi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.gf;
import org.telegram.messenger.j20;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.rt;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ t0 b;
    public final /* synthetic */ p0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ File e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ g0(t0 t0Var, p0 p0Var, long j3, File file, boolean z9) {
        this.b = t0Var;
        this.c = p0Var;
        this.d = j3;
        this.e = file;
        this.f = z9;
    }

    private final void a() {
        t0 t0Var = this.b;
        p0 p0Var = this.c;
        File file = this.e;
        long j3 = this.d;
        boolean z9 = this.f;
        synchronized (t0Var.g) {
            if (!t0Var.H && !p0Var.d && !p0Var.e) {
                p0Var.e = true;
                ((hy0) t0Var.e).b(p0Var.a, file.length(), file);
                t0Var.i.post(new g0(t0Var, p0Var, j3, file, z9));
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        gy0 gy0Var;
        gy0 gy0Var2;
        switch (this.a) {
            case 0:
                a();
                return;
            default:
                t0 t0Var = this.b;
                p0 p0Var = this.c;
                long j3 = this.d;
                File file = this.e;
                boolean z9 = this.f;
                int i7 = t0Var.a0;
                if (i7 == 10 || i7 == 9) {
                    return;
                }
                t0Var.x(8);
                t0Var.m.b("output completed: generation=" + p0Var.a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z9);
                t0Var.m("completed");
                rt rtVar = t0Var.d;
                long j10 = p0Var.a;
                n40 n40Var = (n40) rtVar.b;
                m40 m40Var = n40Var.U;
                if (m40Var != null) {
                    n40Var.U = null;
                    n40Var.k0 = true;
                    hy0 hy0Var = n40Var.S;
                    if (hy0Var == null) {
                        gy0Var2 = null;
                    } else {
                        synchronized (hy0Var) {
                            try {
                                try {
                                    fy0 fy0Var = (fy0) hy0Var.c.get(Long.valueOf(j10));
                                    if (fy0Var == null || fy0Var.e) {
                                        gy0Var = new gy0(file.length(), null, null, null, null);
                                    } else {
                                        gy0Var = new gy0(Math.max(fy0Var.c, file.length()), fy0Var.f, fy0Var.g, fy0Var.h, fy0Var.i);
                                    }
                                    gy0Var2 = gy0Var;
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
                    j20 t6 = n40Var.t(file, j3, gy0Var2);
                    t6.t = !z9;
                    gf gfVar = new gf(0, file.getAbsolutePath(), 0, true, 0, 0);
                    gfVar.x = m40Var.c;
                    gfVar.y = m40Var.d;
                    n40Var.e.u(gfVar, t6, m40Var.a, m40Var.b, 0, false, m40Var.e);
                    hy0 hy0Var2 = n40Var.S;
                    if (hy0Var2 != null) {
                        hy0Var2.d(false);
                    }
                    n40Var.S = null;
                    MediaController.B().Y(false);
                    if (n40Var.W) {
                        n40Var.W = false;
                        n40Var.O = null;
                    }
                }
                if (t0Var.G) {
                    t0Var.s();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ g0(t0 t0Var, p0 p0Var, File file, long j3, boolean z9) {
        this.b = t0Var;
        this.c = p0Var;
        this.e = file;
        this.d = j3;
        this.f = z9;
    }
}
