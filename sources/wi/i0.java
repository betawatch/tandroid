package wi;

import android.os.SystemClock;
import c8.id;
import java.io.File;
import java.io.IOException;
import org.telegram.ui.Components.l31;
import org.telegram.ui.vn;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                if (t0Var.Z == 3) {
                    t0Var.q();
                    return;
                }
                return;
            case 1:
                t0 t0Var2 = this.b;
                x xVar = t0Var2.T;
                File file = t0Var2.U;
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
                    id.c(xVar.a);
                }
                if (file != null) {
                    id.c(file);
                    return;
                }
                return;
            case 2:
                t0 t0Var3 = this.b;
                int i7 = t0Var3.Z;
                if (i7 == 2 || i7 == 6) {
                    t0Var3.I = SystemClock.elapsedRealtime();
                    t0Var3.m.b("recording started: retainedDurationMs=" + t0Var3.H);
                    t0Var3.w(3);
                    long j3 = t0Var3.q - t0Var3.H;
                    if (j3 > 0 && !t0Var3.D) {
                        t0Var3.i.postDelayed(t0Var3.W, j3);
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
                t0Var4.m.b("recording segment stopped: state=" + rf.b.t(t0Var4.Z) + ", retainedDurationMs=" + t0Var4.H);
                if (t0Var4.C) {
                    t0Var4.C = false;
                    t0Var4.i();
                    return;
                }
                if (t0Var4.A) {
                    t0Var4.A = false;
                    t0Var4.j.execute(new vn(t0Var4, t0Var4.T, t0Var4.B, t0Var4.S, 18));
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
                    t0Var4.j.execute(new l31(t0Var4, t0Var4.T, d, 25));
                    return;
                } catch (IOException e10) {
                    t0Var4.h(e10);
                    return;
                }
        }
    }
}
