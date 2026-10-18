package si;

import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import org.telegram.ui.Components.ay0;
import w7.p7;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ i0(s0 s0Var, int i10) {
        this.a = i10;
        this.b = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s0 s0Var = this.b;
                if (s0Var.W == 3) {
                    s0Var.p();
                    return;
                }
                return;
            case 1:
                s0 s0Var2 = this.b;
                x xVar = s0Var2.Q;
                File file = s0Var2.R;
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
                s0 s0Var3 = this.b;
                int i10 = s0Var3.W;
                if (i10 == 2 || i10 == 6) {
                    s0Var3.F = SystemClock.elapsedRealtime();
                    s0Var3.m.b("recording started: retainedDurationMs=" + s0Var3.E);
                    s0Var3.v(3);
                    long j10 = s0Var3.o - s0Var3.E;
                    if (j10 <= 0) {
                        s0Var3.p();
                        return;
                    } else {
                        s0Var3.i.postDelayed(s0Var3.T, j10);
                        return;
                    }
                }
                return;
            default:
                s0 s0Var4 = this.b;
                s0Var4.B = false;
                s0Var4.m.b("recording segment stopped: state=" + r4.c.w(s0Var4.W) + ", retainedDurationMs=" + s0Var4.E);
                if (s0Var4.A) {
                    s0Var4.A = false;
                    s0Var4.i();
                    return;
                }
                if (s0Var4.y) {
                    s0Var4.y = false;
                    s0Var4.j.execute(new ug.c(s0Var4, s0Var4.Q, s0Var4.z, s0Var4.P));
                    return;
                }
                if (s0Var4.W != 4) {
                    return;
                }
                try {
                    File d = s0Var4.d("round_video_preview_");
                    s0Var4.R = d;
                    s0Var4.J = System.nanoTime();
                    s0Var4.m.b("preview snapshot started: file=" + d.getName());
                    s0Var4.j.execute(new ay0(s0Var4, s0Var4.Q, d, 21));
                    return;
                } catch (IOException e) {
                    s0Var4.h(e);
                    return;
                }
        }
    }
}
