package wi;

import android.os.SystemClock;
import c8.jd;
import java.io.File;
import java.io.IOException;
import org.telegram.ui.Components.r31;
import org.telegram.ui.vn;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ i0(t0 t0Var, int i7) {
        this.a = i7;
        this.b = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t0 t0Var = this.b;
                if (t0Var.a0 == 3) {
                    t0Var.q();
                    return;
                }
                return;
            case 1:
                t0 t0Var2 = this.b;
                x xVar = t0Var2.U;
                File file = t0Var2.V;
                if (xVar != null) {
                    try {
                        synchronized (xVar) {
                            xVar.w = true;
                            try {
                                xVar.g();
                            } finally {
                                xVar.w = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    jd.c(xVar.a);
                }
                if (file != null) {
                    jd.c(file);
                    return;
                }
                return;
            case 2:
                t0 t0Var3 = this.b;
                int i7 = t0Var3.a0;
                if (i7 == 2 || i7 == 6) {
                    t0Var3.J = SystemClock.elapsedRealtime();
                    t0Var3.m.b("recording started: retainedDurationMs=" + t0Var3.I);
                    t0Var3.x(3);
                    long j3 = t0Var3.q - t0Var3.I;
                    if (j3 > 0 && !t0Var3.D) {
                        t0Var3.i.postDelayed(t0Var3.X, j3);
                        return;
                    } else {
                        t0Var3.D = false;
                        t0Var3.q();
                        return;
                    }
                }
                return;
            default:
                t0 t0Var4 = this.b;
                t0Var4.E = false;
                t0Var4.m.b("recording segment stopped: state=" + rf.b.u(t0Var4.a0) + ", retainedDurationMs=" + t0Var4.I);
                if (t0Var4.C) {
                    t0Var4.C = false;
                    t0Var4.i();
                    return;
                }
                if (t0Var4.A) {
                    t0Var4.A = false;
                    t0Var4.j.execute(new vn(t0Var4, t0Var4.U, t0Var4.B, t0Var4.T, 18));
                    return;
                }
                if (t0Var4.a0 != 4) {
                    return;
                }
                try {
                    File d = t0Var4.d("round_video_preview_");
                    t0Var4.V = d;
                    t0Var4.N = System.nanoTime();
                    t0Var4.m.b("preview snapshot started: file=" + d.getName());
                    t0Var4.j.execute(new r31(t0Var4, t0Var4.U, d, 25));
                    return;
                } catch (IOException e10) {
                    t0Var4.h(e10);
                    return;
                }
        }
    }
}
