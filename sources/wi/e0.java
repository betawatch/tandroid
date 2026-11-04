package wi;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.b20;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.y00;
import org.telegram.ui.de;
import org.telegram.ui.mj;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ e0(t0 t0Var, long j10, int i3) {
        this.a = i3;
        this.b = t0Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file;
        mj mjVar;
        a61 a61Var;
        switch (this.a) {
            case 0:
                t0 t0Var = this.b;
                long j10 = this.c;
                if (t0Var.Z == 6) {
                    t0Var.H = j10;
                    t0Var.N = 0L;
                    t0Var.J = 0L;
                    t0Var.K = j10;
                    t0Var.w(2);
                    t0Var.l.X(t0Var.T, t0Var.H * 1000, t0Var.r);
                    break;
                }
                break;
            default:
                t0 t0Var2 = this.b;
                long j11 = this.c;
                if (t0Var2.Z == 4) {
                    t0Var2.N = j11;
                    long min = Math.min(t0Var2.q, j11);
                    t0Var2.H = min;
                    t0Var2.J = 0L;
                    t0Var2.K = min;
                    t0Var2.b.setSurfaceTextureListener(null);
                    t0Var2.b.setTransform(t0Var2.h);
                    k2.i0 a10 = new k2.n(t0Var2.a).a();
                    t0Var2.V = a10;
                    a10.z1(t0Var2.b);
                    t0Var2.V.v0(d2.n0.b(Uri.fromFile(t0Var2.U)));
                    t0Var2.V.k(0);
                    t0Var2.V.R(1.0f);
                    t0Var2.V.u0(t0Var2.Y);
                    t0Var2.V.a();
                    t0Var2.V.Z0(5, t0Var2.J);
                    t0Var2.m.b("preview player prepared: durationMs=" + t0Var2.H + ", trim=" + t0Var2.J + ".." + t0Var2.K);
                    t0Var2.w(5);
                    y00 y00Var = t0Var2.d;
                    long j12 = t0Var2.H;
                    long j13 = t0Var2.J;
                    long j14 = t0Var2.K;
                    ((j40) y00Var.a).w.setProgress(((float) j12) / 60000.0f);
                    j40 j40Var = (j40) y00Var.a;
                    j40Var.j0 = false;
                    j40Var.I.setAlpha(0.0f);
                    j40 j40Var2 = (j40) y00Var.a;
                    if (j40Var2.V == null) {
                        t0 t0Var3 = j40Var2.P;
                        if (t0Var3 == null) {
                            file = null;
                        } else {
                            t0.u();
                            file = t0Var3.U;
                        }
                        if (file != null) {
                            j40 j40Var3 = (j40) y00Var.a;
                            j40Var3.U = j40Var3.s(file, j12, null);
                            j40 j40Var4 = (j40) y00Var.a;
                            b20 b20Var = j40Var4.U;
                            b20Var.a = j13 > 0 ? j13 : -1L;
                            b20Var.b = j14 < j12 ? j14 : -1L;
                            hs.f(j40Var4.f).k(hs.s2, Integer.valueOf(((j40) y00Var.a).h), ((j40) y00Var.a).U, file.getAbsolutePath(), new ArrayList());
                            float max = Math.max(1L, j12);
                            j40 j40Var5 = (j40) y00Var.a;
                            float f10 = j13 / max;
                            float f11 = j14 / max;
                            o40 o40Var = j40Var5.b;
                            if (o40Var != null && (mjVar = ((de) o40Var).b.a0) != null && (a61Var = mjVar.g1) != null) {
                                float max2 = Math.max(0.0f, Math.min(1.0f, f10));
                                a61Var.b = max2;
                                a61Var.c = Math.max(max2, Math.min(1.0f, f11));
                                a61Var.invalidate();
                            }
                        }
                    }
                    t0Var2.r();
                    break;
                }
                break;
        }
    }
}
