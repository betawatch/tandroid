package wi;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.j20;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.t40;
import org.telegram.ui.fe;
import org.telegram.ui.sj;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ f0(t0 t0Var, long j3, int i7) {
        this.a = i7;
        this.b = t0Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file;
        sj sjVar;
        i61 i61Var;
        switch (this.a) {
            case 0:
                t0 t0Var = this.b;
                long j3 = this.c;
                if (t0Var.a0 == 6) {
                    t0Var.I = j3;
                    t0Var.O = 0L;
                    t0Var.K = 0L;
                    t0Var.L = j3;
                    t0Var.x(2);
                    t0Var.l.V(t0Var.U, t0Var.I * 1000, t0Var.r);
                    break;
                }
                break;
            default:
                t0 t0Var2 = this.b;
                long j10 = this.c;
                if (t0Var2.a0 == 4) {
                    t0Var2.O = j10;
                    long min = Math.min(t0Var2.q, j10);
                    t0Var2.I = min;
                    t0Var2.K = 0L;
                    t0Var2.L = min;
                    t0Var2.b.setSurfaceTextureListener(null);
                    t0Var2.b.setTransform(t0Var2.h);
                    l2.i0 a10 = new l2.n(t0Var2.a).a();
                    t0Var2.W = a10;
                    a10.z1(t0Var2.b);
                    t0Var2.W.m0(e2.l0.b(Uri.fromFile(t0Var2.V)));
                    t0Var2.W.k(0);
                    t0Var2.W.T(1.0f);
                    t0Var2.W.I0(t0Var2.Z);
                    t0Var2.W.a();
                    t0Var2.W.Z0(5, t0Var2.K);
                    t0Var2.m.b("preview player prepared: durationMs=" + t0Var2.I + ", trim=" + t0Var2.K + ".." + t0Var2.L);
                    t0Var2.x(5);
                    rt rtVar = t0Var2.d;
                    long j11 = t0Var2.I;
                    long j12 = t0Var2.K;
                    long j13 = t0Var2.L;
                    ((o40) rtVar.b).w.setProgress(((float) j11) / 60000.0f);
                    o40 o40Var = (o40) rtVar.b;
                    o40Var.j0 = false;
                    o40Var.H.setAlpha(0.0f);
                    o40 o40Var2 = (o40) rtVar.b;
                    if (o40Var2.U == null) {
                        t0 t0Var3 = o40Var2.O;
                        if (t0Var3 == null) {
                            file = null;
                        } else {
                            t0.v();
                            file = t0Var3.V;
                        }
                        if (file != null) {
                            o40 o40Var3 = (o40) rtVar.b;
                            o40Var3.T = o40Var3.t(file, j11, null);
                            o40 o40Var4 = (o40) rtVar.b;
                            j20 j20Var = o40Var4.T;
                            j20Var.a = j12 > 0 ? j12 : -1L;
                            j20Var.b = j13 < j11 ? j13 : -1L;
                            qs.f(o40Var4.f).k(qs.s2, Integer.valueOf(((o40) rtVar.b).h), ((o40) rtVar.b).T, file.getAbsolutePath(), new ArrayList());
                            float max = Math.max(1L, j11);
                            o40 o40Var5 = (o40) rtVar.b;
                            float f10 = j12 / max;
                            float f11 = j13 / max;
                            t40 t40Var = o40Var5.b;
                            if (t40Var != null && (sjVar = ((fe) t40Var).b.Z) != null && (i61Var = sjVar.f1) != null) {
                                float max2 = Math.max(0.0f, Math.min(1.0f, f10));
                                i61Var.b = max2;
                                i61Var.c = Math.max(max2, Math.min(1.0f, f11));
                                i61Var.invalidate();
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
