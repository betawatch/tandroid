package si;

import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import org.telegram.ui.Components.ay0;
import w7.p7;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ j0(t0 t0Var, int i10) {
        this.a = i10;
        this.b = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t0 t0Var = this.b;
                if (t0Var.W == 3) {
                    t0Var.p();
                    return;
                }
                return;
            case 1:
                t0 t0Var2 = this.b;
                x xVar = t0Var2.Q;
                File file = t0Var2.R;
                if (xVar != null) {
                    try {
                        synchronized (xVar) {
                            xVar.v = true;
                            try {
                                xVar.g();
                            } finally {
                                xVar.v = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    p7.c(xVar.a);
                }
                if (file != null) {
                    p7.c(file);
                    return;
                }
                return;
            case 2:
                t0 t0Var3 = this.b;
                int i10 = t0Var3.W;
                if (i10 == 2 || i10 == 6) {
                    t0Var3.F = SystemClock.elapsedRealtime();
                    t0Var3.m.b("recording started: retainedDurationMs=" + t0Var3.E);
                    t0Var3.v(3);
                    long j10 = t0Var3.o - t0Var3.E;
                    if (j10 <= 0) {
                        t0Var3.p();
                        return;
                    } else {
                        t0Var3.i.postDelayed(t0Var3.T, j10);
                        return;
                    }
                }
                return;
            default:
                t0 t0Var4 = this.b;
                t0Var4.B = false;
                t0Var4.m.b("recording segment stopped: state=" + r.c.w(t0Var4.W) + ", retainedDurationMs=" + t0Var4.E);
                if (t0Var4.A) {
                    t0Var4.A = false;
                    t0Var4.i();
                    return;
                }
                if (t0Var4.y) {
                    t0Var4.y = false;
                    t0Var4.j.execute(new i0(t0Var4, t0Var4.Q, t0Var4.z, t0Var4.P));
                    return;
                }
                if (t0Var4.W != 4) {
                    return;
                }
                try {
                    File d = t0Var4.d("round_video_preview_");
                    t0Var4.R = d;
                    t0Var4.J = System.nanoTime();
                    t0Var4.m.b("preview snapshot started: file=" + d.getName());
                    t0Var4.j.execute(new ay0(t0Var4, t0Var4.Q, d, 21));
                    return;
                } catch (IOException e) {
                    t0Var4.h(e);
                    return;
                }
        }
    }
}
