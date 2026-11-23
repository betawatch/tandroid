package zi;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.f20;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.b50;
import org.telegram.ui.Components.g50;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.w61;
import org.telegram.ui.ee;
import org.telegram.ui.rj;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ f0(u0 u0Var, long j3, int i7) {
        this.a = i7;
        this.b = u0Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file;
        rj rjVar;
        w61 w61Var;
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                long j3 = this.c;
                if (u0Var.a0 == 6) {
                    u0Var.I = j3;
                    u0Var.O = 0L;
                    u0Var.K = 0L;
                    u0Var.L = j3;
                    u0Var.x(2);
                    u0Var.l.V(u0Var.U, u0Var.I * 1000, u0Var.r);
                    break;
                }
                break;
            default:
                u0 u0Var2 = this.b;
                long j10 = this.c;
                if (u0Var2.a0 == 4) {
                    u0Var2.O = j10;
                    long min = Math.min(u0Var2.q, j10);
                    u0Var2.I = min;
                    u0Var2.K = 0L;
                    u0Var2.L = min;
                    u0Var2.b.setSurfaceTextureListener(null);
                    u0Var2.b.setTransform(u0Var2.h);
                    l2.f0 a10 = new l2.n(u0Var2.a).a();
                    u0Var2.W = a10;
                    a10.z1(u0Var2.b);
                    u0Var2.W.m0(e2.l0.b(Uri.fromFile(u0Var2.V)));
                    u0Var2.W.k(0);
                    u0Var2.W.T(1.0f);
                    u0Var2.W.I0(u0Var2.Z);
                    u0Var2.W.a();
                    u0Var2.W.Z0(5, u0Var2.K);
                    u0Var2.m.b("preview player prepared: durationMs=" + u0Var2.I + ", trim=" + u0Var2.K + ".." + u0Var2.L);
                    u0Var2.x(5);
                    qf qfVar = u0Var2.d;
                    long j11 = u0Var2.I;
                    long j12 = u0Var2.K;
                    long j13 = u0Var2.L;
                    ((b50) qfVar.b).w.setProgress(((float) j11) / 60000.0f);
                    b50 b50Var = (b50) qfVar.b;
                    b50Var.k0 = false;
                    b50Var.I.setAlpha(0.0f);
                    b50 b50Var2 = (b50) qfVar.b;
                    if (b50Var2.V == null) {
                        u0 u0Var3 = b50Var2.P;
                        if (u0Var3 == null) {
                            file = null;
                        } else {
                            u0.v();
                            file = u0Var3.V;
                        }
                        if (file != null) {
                            b50 b50Var3 = (b50) qfVar.b;
                            b50Var3.U = b50Var3.t(file, j11, null);
                            b50 b50Var4 = (b50) qfVar.b;
                            f20 f20Var = b50Var4.U;
                            f20Var.a = j12 > 0 ? j12 : -1L;
                            f20Var.b = j13 < j11 ? j13 : -1L;
                            ls.f(b50Var4.f).k(ls.s2, Integer.valueOf(((b50) qfVar.b).h), ((b50) qfVar.b).U, file.getAbsolutePath(), new ArrayList());
                            float max = Math.max(1L, j11);
                            b50 b50Var5 = (b50) qfVar.b;
                            float f10 = j12 / max;
                            float f11 = j13 / max;
                            g50 g50Var = b50Var5.b;
                            if (g50Var != null && (rjVar = ((ee) g50Var).b.a0) != null && (w61Var = rjVar.g1) != null) {
                                float max2 = Math.max(0.0f, Math.min(1.0f, f10));
                                w61Var.b = max2;
                                w61Var.c = Math.max(max2, Math.min(1.0f, f11));
                                w61Var.invalidate();
                            }
                        }
                    }
                    u0Var2.r();
                    break;
                }
                break;
        }
    }
}
