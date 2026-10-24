package si;

import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import org.telegram.ui.Components.fy0;
import w7.m7;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ j0(u0 u0Var, int i10) {
        this.a = i10;
        this.b = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                if (u0Var.W == 3) {
                    u0Var.p();
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.b;
                w wVar = u0Var2.Q;
                File file = u0Var2.R;
                if (wVar != null) {
                    try {
                        synchronized (wVar) {
                            wVar.v = true;
                            try {
                                wVar.g();
                            } finally {
                                wVar.v = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    m7.c(wVar.a);
                }
                if (file != null) {
                    m7.c(file);
                    return;
                }
                return;
            case 2:
                u0 u0Var3 = this.b;
                int i10 = u0Var3.W;
                if (i10 == 2 || i10 == 6) {
                    u0Var3.F = SystemClock.elapsedRealtime();
                    u0Var3.m.b("recording started: retainedDurationMs=" + u0Var3.E);
                    u0Var3.v(3);
                    long j10 = u0Var3.o - u0Var3.E;
                    if (j10 <= 0) {
                        u0Var3.p();
                        return;
                    } else {
                        u0Var3.i.postDelayed(u0Var3.T, j10);
                        return;
                    }
                }
                return;
            default:
                u0 u0Var4 = this.b;
                u0Var4.B = false;
                u0Var4.m.b("recording segment stopped: state=" + o0.w(u0Var4.W) + ", retainedDurationMs=" + u0Var4.E);
                if (u0Var4.A) {
                    u0Var4.A = false;
                    u0Var4.i();
                    return;
                }
                if (u0Var4.y) {
                    u0Var4.y = false;
                    u0Var4.j.execute(new i0(u0Var4, u0Var4.Q, u0Var4.z, u0Var4.P));
                    return;
                }
                if (u0Var4.W != 4) {
                    return;
                }
                try {
                    File d = u0Var4.d("round_video_preview_");
                    u0Var4.R = d;
                    u0Var4.J = System.nanoTime();
                    u0Var4.m.b("preview snapshot started: file=" + d.getName());
                    u0Var4.j.execute(new fy0(u0Var4, u0Var4.Q, d, 21));
                    return;
                } catch (IOException e) {
                    u0Var4.h(e);
                    return;
                }
        }
    }
}
