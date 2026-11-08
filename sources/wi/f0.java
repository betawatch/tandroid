package wi;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.j20;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.s40;
import org.telegram.ui.fe;
import org.telegram.ui.qj;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
        qj qjVar;
        h61 h61Var;
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
                    t0Var.l.W(t0Var.U, t0Var.I * 1000, t0Var.r);
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
                    ((n40) rtVar.b).w.setProgress(((float) j11) / 60000.0f);
                    n40 n40Var = (n40) rtVar.b;
                    n40Var.j0 = false;
                    n40Var.H.setAlpha(0.0f);
                    n40 n40Var2 = (n40) rtVar.b;
                    if (n40Var2.U == null) {
                        t0 t0Var3 = n40Var2.O;
                        if (t0Var3 == null) {
                            file = null;
                        } else {
                            t0.v();
                            file = t0Var3.V;
                        }
                        if (file != null) {
                            n40 n40Var3 = (n40) rtVar.b;
                            n40Var3.T = n40Var3.t(file, j11, null);
                            n40 n40Var4 = (n40) rtVar.b;
                            j20 j20Var = n40Var4.T;
                            j20Var.a = j12 > 0 ? j12 : -1L;
                            j20Var.b = j13 < j11 ? j13 : -1L;
                            qs.f(n40Var4.f).k(qs.s2, Integer.valueOf(((n40) rtVar.b).h), ((n40) rtVar.b).T, file.getAbsolutePath(), new ArrayList());
                            float max = Math.max(1L, j11);
                            n40 n40Var5 = (n40) rtVar.b;
                            float f10 = j12 / max;
                            float f11 = j13 / max;
                            s40 s40Var = n40Var5.b;
                            if (s40Var != null && (qjVar = ((fe) s40Var).b.Z) != null && (h61Var = qjVar.f1) != null) {
                                float max2 = Math.max(0.0f, Math.min(1.0f, f10));
                                h61Var.b = max2;
                                h61Var.c = Math.max(max2, Math.min(1.0f, f11));
                                h61Var.invalidate();
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
