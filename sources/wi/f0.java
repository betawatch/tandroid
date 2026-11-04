package wi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.b20;
import org.telegram.messenger.ye;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ t0 b;
    public final /* synthetic */ p0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ File e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ f0(t0 t0Var, p0 p0Var, long j10, File file, boolean z10) {
        this.b = t0Var;
        this.c = p0Var;
        this.d = j10;
        this.e = file;
        this.f = z10;
    }

    private final void a() {
        t0 t0Var = this.b;
        p0 p0Var = this.c;
        File file = this.e;
        long j10 = this.d;
        boolean z10 = this.f;
        synchronized (t0Var.g) {
            if (!t0Var.G && !p0Var.d && !p0Var.e) {
                p0Var.e = true;
                ((gy0) t0Var.e).b(p0Var.a, file.length(), file);
                t0Var.i.post(new f0(t0Var, p0Var, j10, file, z10));
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
                long j10 = this.d;
                File file = this.e;
                boolean z10 = this.f;
                int i3 = t0Var.Z;
                if (i3 == 10 || i3 == 9) {
                    return;
                }
                t0Var.w(8);
                t0Var.m.b("output completed: generation=" + p0Var.a + ", durationMs=" + j10 + ", size=" + file.length() + ", hasAudio=" + z10);
                t0Var.m("completed");
                y00 y00Var = t0Var.d;
                long j11 = p0Var.a;
                j40 j40Var = (j40) y00Var.a;
                i40 i40Var = j40Var.V;
                if (i40Var == null) {
                    return;
                }
                j40Var.V = null;
                j40Var.k0 = true;
                gy0 gy0Var = j40Var.T;
                if (gy0Var == null) {
                    fy0Var2 = null;
                } else {
                    synchronized (gy0Var) {
                        ey0 ey0Var = (ey0) gy0Var.c.get(Long.valueOf(j11));
                        if (ey0Var != null && !ey0Var.e) {
                            fy0Var = new fy0(Math.max(ey0Var.c, file.length()), ey0Var.f, ey0Var.g, ey0Var.h, ey0Var.i);
                        }
                        fy0Var = new fy0(file.length(), null, null, null, null);
                    }
                    fy0Var2 = fy0Var;
                }
                b20 s6 = j40Var.s(file, j10, fy0Var2);
                s6.t = !z10;
                ye yeVar = new ye(0, file.getAbsolutePath(), 0, true, 0, 0);
                yeVar.x = i40Var.c;
                yeVar.y = i40Var.d;
                j40Var.e.u(yeVar, s6, i40Var.a, i40Var.b, 0, false, i40Var.e);
                gy0 gy0Var2 = j40Var.T;
                if (gy0Var2 != null) {
                    gy0Var2.d(false);
                }
                j40Var.T = null;
                MediaController.B().Y(false);
                return;
        }
    }

    public /* synthetic */ f0(t0 t0Var, p0 p0Var, File file, long j10, boolean z10) {
        this.b = t0Var;
        this.c = p0Var;
        this.e = file;
        this.d = j10;
        this.f = z10;
    }
}
