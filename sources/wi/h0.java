package wi;

import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.rn;
import x7.u5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ h0(t0 t0Var, int i3) {
        this.a = i3;
        this.b = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t0 t0Var = this.b;
                if (t0Var.Z == 3) {
                    t0Var.q();
                    return;
                }
                return;
            case 1:
                t0 t0Var2 = this.b;
                w wVar = t0Var2.T;
                File file = t0Var2.U;
                if (wVar != null) {
                    try {
                        synchronized (wVar) {
                            wVar.w = true;
                            try {
                                wVar.g();
                            } finally {
                                wVar.w = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    u5.c(wVar.a);
                }
                if (file != null) {
                    u5.c(file);
                    return;
                }
                return;
            case 2:
                t0 t0Var3 = this.b;
                int i3 = t0Var3.Z;
                if (i3 == 2 || i3 == 6) {
                    t0Var3.I = SystemClock.elapsedRealtime();
                    t0Var3.m.b("recording started: retainedDurationMs=" + t0Var3.H);
                    t0Var3.w(3);
                    long j10 = t0Var3.q - t0Var3.H;
                    if (j10 > 0 && !t0Var3.D) {
                        t0Var3.i.postDelayed(t0Var3.W, j10);
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
                t0Var4.m.b("recording segment stopped: state=" + t4.c.t(t0Var4.Z) + ", retainedDurationMs=" + t0Var4.H);
                if (t0Var4.C) {
                    t0Var4.C = false;
                    t0Var4.i();
                    return;
                }
                if (t0Var4.A) {
                    t0Var4.A = false;
                    t0Var4.j.execute(new rn(t0Var4, t0Var4.T, t0Var4.B, t0Var4.S, 16));
                    return;
                }
                if (t0Var4.Z != 4) {
                    return;
                }
                try {
                    File d = t0Var4.d("round_video_preview_");
                    t0Var4.U = d;
                    t0Var4.M = System.nanoTime();
                    t0Var4.m.b("preview snapshot started: file=" + d.getName());
                    t0Var4.j.execute(new iv0(t0Var4, t0Var4.T, d, 23));
                    return;
                } catch (IOException e10) {
                    t0Var4.h(e10);
                    return;
                }
        }
    }
}
