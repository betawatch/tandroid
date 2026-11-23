package zi;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.d20;
import org.telegram.messenger.ks;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.y40;
import org.telegram.ui.ee;
import org.telegram.ui.rj;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        x61 x61Var;
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
                    l2.g0 a10 = new l2.o(u0Var2.a).a();
                    u0Var2.W = a10;
                    a10.z1(u0Var2.b);
                    u0Var2.W.n0(e2.l0.b(Uri.fromFile(u0Var2.V)));
                    u0Var2.W.k(0);
                    u0Var2.W.U(1.0f);
                    u0Var2.W.J0(u0Var2.Z);
                    u0Var2.W.a();
                    u0Var2.W.Z0(5, u0Var2.K);
                    u0Var2.m.b("preview player prepared: durationMs=" + u0Var2.I + ", trim=" + u0Var2.K + ".." + u0Var2.L);
                    u0Var2.x(5);
                    aa aaVar = u0Var2.d;
                    long j11 = u0Var2.I;
                    long j12 = u0Var2.K;
                    long j13 = u0Var2.L;
                    ((y40) aaVar.b).w.setProgress(((float) j11) / 60000.0f);
                    y40 y40Var = (y40) aaVar.b;
                    y40Var.k0 = false;
                    y40Var.I.setAlpha(0.0f);
                    y40 y40Var2 = (y40) aaVar.b;
                    if (y40Var2.V == null) {
                        u0 u0Var3 = y40Var2.P;
                        if (u0Var3 == null) {
                            file = null;
                        } else {
                            u0.v();
                            file = u0Var3.V;
                        }
                        if (file != null) {
                            y40 y40Var3 = (y40) aaVar.b;
                            y40Var3.U = y40Var3.t(file, j11, null);
                            y40 y40Var4 = (y40) aaVar.b;
                            d20 d20Var = y40Var4.U;
                            d20Var.a = j12 > 0 ? j12 : -1L;
                            d20Var.b = j13 < j11 ? j13 : -1L;
                            ks.f(y40Var4.f).k(ks.s2, Integer.valueOf(((y40) aaVar.b).h), ((y40) aaVar.b).U, file.getAbsolutePath(), new ArrayList());
                            float max = Math.max(1L, j11);
                            y40 y40Var5 = (y40) aaVar.b;
                            float f10 = j12 / max;
                            float f11 = j13 / max;
                            d50 d50Var = y40Var5.b;
                            if (d50Var != null && (rjVar = ((ee) d50Var).b.a0) != null && (x61Var = rjVar.g1) != null) {
                                float max2 = Math.max(0.0f, Math.min(1.0f, f10));
                                x61Var.b = max2;
                                x61Var.c = Math.max(max2, Math.min(1.0f, f11));
                                x61Var.invalidate();
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
