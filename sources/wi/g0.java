package wi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.gf;
import org.telegram.messenger.j20;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.qt;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
            if (!t0Var.G && !p0Var.d && !p0Var.e) {
                p0Var.e = true;
                ((gy0) t0Var.e).b(p0Var.a, file.length(), file);
                t0Var.i.post(new g0(t0Var, p0Var, j3, file, z9));
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        fy0 fy0Var;
        fy0 fy0Var2;
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
                int i7 = t0Var.Z;
                if (i7 == 10 || i7 == 9) {
                    return;
                }
                t0Var.w(8);
                t0Var.m.b("output completed: generation=" + p0Var.a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z9);
                t0Var.m("completed");
                qt qtVar = t0Var.d;
                long j10 = p0Var.a;
                n40 n40Var = (n40) qtVar.b;
                m40 m40Var = n40Var.U;
                if (m40Var == null) {
                    return;
                }
                n40Var.U = null;
                n40Var.j0 = true;
                gy0 gy0Var = n40Var.S;
                if (gy0Var == null) {
                    fy0Var2 = null;
                } else {
                    synchronized (gy0Var) {
                        ey0 ey0Var = (ey0) gy0Var.c.get(Long.valueOf(j10));
                        if (ey0Var != null && !ey0Var.e) {
                            fy0Var = new fy0(Math.max(ey0Var.c, file.length()), ey0Var.f, ey0Var.g, ey0Var.h, ey0Var.i);
                        }
                        fy0Var = new fy0(file.length(), null, null, null, null);
                    }
                    fy0Var2 = fy0Var;
                }
                j20 s5 = n40Var.s(file, j3, fy0Var2);
                s5.t = !z9;
                gf gfVar = new gf(0, file.getAbsolutePath(), 0, true, 0, 0);
                gfVar.x = m40Var.c;
                gfVar.y = m40Var.d;
                n40Var.e.u(gfVar, s5, m40Var.a, m40Var.b, 0, false, m40Var.e);
                gy0 gy0Var2 = n40Var.S;
                if (gy0Var2 != null) {
                    gy0Var2.d(false);
                }
                n40Var.S = null;
                MediaController.B().Y(false);
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
