package zi;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.g20;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.q40;
import org.telegram.ui.Components.v40;
import org.telegram.ui.ce;
import org.telegram.ui.qj;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ g0(v0 v0Var, long j3, int i7) {
        this.a = i7;
        this.b = v0Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file;
        qj qjVar;
        i61 i61Var;
        switch (this.a) {
            case 0:
                v0 v0Var = this.b;
                long j3 = this.c;
                if (v0Var.a0 == 6) {
                    v0Var.I = j3;
                    v0Var.O = 0L;
                    v0Var.K = 0L;
                    v0Var.L = j3;
                    v0Var.x(2);
                    v0Var.l.V(v0Var.U, v0Var.I * 1000, v0Var.r);
                    break;
                }
                break;
            default:
                v0 v0Var2 = this.b;
                long j10 = this.c;
                if (v0Var2.a0 == 4) {
                    v0Var2.O = j10;
                    long min = Math.min(v0Var2.q, j10);
                    v0Var2.I = min;
                    v0Var2.K = 0L;
                    v0Var2.L = min;
                    v0Var2.b.setSurfaceTextureListener(null);
                    v0Var2.b.setTransform(v0Var2.h);
                    l2.f0 a10 = new l2.n(v0Var2.a).a();
                    v0Var2.W = a10;
                    a10.z1(v0Var2.b);
                    v0Var2.W.m0(e2.l0.b(Uri.fromFile(v0Var2.V)));
                    v0Var2.W.k(0);
                    v0Var2.W.T(1.0f);
                    v0Var2.W.I0(v0Var2.Z);
                    v0Var2.W.a();
                    v0Var2.W.Z0(5, v0Var2.K);
                    v0Var2.m.b("preview player prepared: durationMs=" + v0Var2.I + ", trim=" + v0Var2.K + ".." + v0Var2.L);
                    v0Var2.x(5);
                    ff ffVar = v0Var2.d;
                    long j11 = v0Var2.I;
                    long j12 = v0Var2.K;
                    long j13 = v0Var2.L;
                    ((q40) ffVar.b).w.setProgress(((float) j11) / 60000.0f);
                    q40 q40Var = (q40) ffVar.b;
                    q40Var.k0 = false;
                    q40Var.I.setAlpha(0.0f);
                    q40 q40Var2 = (q40) ffVar.b;
                    if (q40Var2.V == null) {
                        v0 v0Var3 = q40Var2.P;
                        if (v0Var3 == null) {
                            file = null;
                        } else {
                            v0.v();
                            file = v0Var3.V;
                        }
                        if (file != null) {
                            q40 q40Var3 = (q40) ffVar.b;
                            q40Var3.U = q40Var3.t(file, j11, null);
                            q40 q40Var4 = (q40) ffVar.b;
                            g20 g20Var = q40Var4.U;
                            g20Var.a = j12 > 0 ? j12 : -1L;
                            g20Var.b = j13 < j11 ? j13 : -1L;
                            ns.f(q40Var4.f).k(ns.s2, Integer.valueOf(((q40) ffVar.b).h), ((q40) ffVar.b).U, file.getAbsolutePath(), new ArrayList());
                            float max = Math.max(1L, j11);
                            q40 q40Var5 = (q40) ffVar.b;
                            float f10 = j12 / max;
                            float f11 = j13 / max;
                            v40 v40Var = q40Var5.b;
                            if (v40Var != null && (qjVar = ((ce) v40Var).b.a0) != null && (i61Var = qjVar.g1) != null) {
                                float max2 = Math.max(0.0f, Math.min(1.0f, f10));
                                i61Var.b = max2;
                                i61Var.c = Math.max(max2, Math.min(1.0f, f11));
                                i61Var.invalidate();
                            }
                        }
                    }
                    v0Var2.r();
                    break;
                }
                break;
        }
    }
}
