package ri;

import android.os.SystemClock;
import bi.h4;
import java.io.File;
import java.io.IOException;
import org.telegram.ui.Cells.c1;
import w7.m7;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ g0(r0 r0Var, int i10) {
        this.a = i10;
        this.b = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r0 r0Var = this.b;
                if (r0Var.W == 3) {
                    r0Var.p();
                    return;
                }
                return;
            case 1:
                r0 r0Var2 = this.b;
                v vVar = r0Var2.Q;
                File file = r0Var2.R;
                if (vVar != null) {
                    try {
                        synchronized (vVar) {
                            vVar.v = true;
                            try {
                                vVar.g();
                            } finally {
                                vVar.v = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    m7.c(vVar.a);
                }
                if (file != null) {
                    m7.c(file);
                    return;
                }
                return;
            case 2:
                r0 r0Var3 = this.b;
                int i10 = r0Var3.W;
                if (i10 == 2 || i10 == 6) {
                    r0Var3.F = SystemClock.elapsedRealtime();
                    r0Var3.m.b("recording started: retainedDurationMs=" + r0Var3.E);
                    r0Var3.v(3);
                    long j10 = r0Var3.o - r0Var3.E;
                    if (j10 <= 0) {
                        r0Var3.p();
                        return;
                    } else {
                        r0Var3.i.postDelayed(r0Var3.T, j10);
                        return;
                    }
                }
                return;
            default:
                r0 r0Var4 = this.b;
                r0Var4.B = false;
                r0Var4.m.b("recording segment stopped: state=" + c1.y(r0Var4.W) + ", retainedDurationMs=" + r0Var4.E);
                if (r0Var4.A) {
                    r0Var4.A = false;
                    r0Var4.i();
                    return;
                }
                if (r0Var4.y) {
                    r0Var4.y = false;
                    r0Var4.j.execute(new h4(r0Var4, r0Var4.Q, r0Var4.z, r0Var4.P, 29));
                    return;
                }
                if (r0Var4.W != 4) {
                    return;
                }
                try {
                    File d = r0Var4.d("round_video_preview_");
                    r0Var4.R = d;
                    r0Var4.J = System.nanoTime();
                    r0Var4.m.b("preview snapshot started: file=" + d.getName());
                    r0Var4.j.execute(new pi.g(r0Var4, r0Var4.Q, d, 6));
                    return;
                } catch (IOException e) {
                    r0Var4.h(e);
                    return;
                }
        }
    }
}
