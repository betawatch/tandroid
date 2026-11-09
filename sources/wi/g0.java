package wi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.gf;
import org.telegram.messenger.j20;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.iy0;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.rt;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                ((iy0) t0Var.e).b(p0Var.a, file.length(), file);
                t0Var.i.post(new g0(t0Var, p0Var, j3, file, z9));
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        hy0 hy0Var;
        hy0 hy0Var2;
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
                o40 o40Var = (o40) rtVar.b;
                n40 n40Var = o40Var.U;
                if (n40Var != null) {
                    o40Var.U = null;
                    o40Var.k0 = true;
                    iy0 iy0Var = o40Var.S;
                    if (iy0Var == null) {
                        hy0Var2 = null;
                    } else {
                        synchronized (iy0Var) {
                            try {
                                try {
                                    gy0 gy0Var = (gy0) iy0Var.c.get(Long.valueOf(j10));
                                    if (gy0Var == null || gy0Var.e) {
                                        hy0Var = new hy0(file.length(), null, null, null, null);
                                    } else {
                                        hy0Var = new hy0(Math.max(gy0Var.c, file.length()), gy0Var.f, gy0Var.g, gy0Var.h, gy0Var.i);
                                    }
                                    hy0Var2 = hy0Var;
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
                    j20 t6 = o40Var.t(file, j3, hy0Var2);
                    t6.t = !z9;
                    gf gfVar = new gf(0, file.getAbsolutePath(), 0, true, 0, 0);
                    gfVar.x = n40Var.c;
                    gfVar.y = n40Var.d;
                    o40Var.e.u(gfVar, t6, n40Var.a, n40Var.b, 0, false, n40Var.e);
                    iy0 iy0Var2 = o40Var.S;
                    if (iy0Var2 != null) {
                        iy0Var2.d(false);
                    }
                    o40Var.S = null;
                    MediaController.B().Y(false);
                    if (o40Var.W) {
                        o40Var.W = false;
                        o40Var.O = null;
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
