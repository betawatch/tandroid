package zi;

import android.os.SystemClock;
import c8.pe;
import java.io.File;
import java.io.IOException;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ i0(u0 u0Var, int i7) {
        this.a = i7;
        this.b = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                if (u0Var.a0 == 3) {
                    u0Var.q();
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.b;
                x xVar = u0Var2.U;
                File file = u0Var2.V;
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
                    pe.c(xVar.a);
                }
                if (file != null) {
                    pe.c(file);
                    return;
                }
                return;
            case 2:
                u0 u0Var3 = this.b;
                int i7 = u0Var3.a0;
                if (i7 == 2 || i7 == 6) {
                    u0Var3.J = SystemClock.elapsedRealtime();
                    u0Var3.m.b("recording started: retainedDurationMs=" + u0Var3.I);
                    u0Var3.x(3);
                    long j3 = u0Var3.q - u0Var3.I;
                    if (j3 > 0 && !u0Var3.D) {
                        u0Var3.i.postDelayed(u0Var3.X, j3);
                        return;
                    } else {
                        u0Var3.D = false;
                        u0Var3.q();
                        return;
                    }
                }
                return;
            default:
                u0 u0Var4 = this.b;
                u0Var4.E = false;
                u0Var4.m.b("recording segment stopped: state=" + yi.i.e(u0Var4.a0) + ", retainedDurationMs=" + u0Var4.I);
                if (u0Var4.C) {
                    u0Var4.C = false;
                    u0Var4.i();
                    return;
                }
                if (u0Var4.A) {
                    u0Var4.A = false;
                    u0Var4.j.execute(new xn(u0Var4, u0Var4.U, u0Var4.B, u0Var4.T, 18));
                    return;
                }
                if (u0Var4.a0 != 4) {
                    return;
                }
                try {
                    File d = u0Var4.d("round_video_preview_");
                    u0Var4.V = d;
                    u0Var4.N = System.nanoTime();
                    u0Var4.m.b("preview snapshot started: file=" + d.getName());
                    u0Var4.j.execute(new wg.p(u0Var4, u0Var4.U, d, 9));
                    return;
                } catch (IOException e10) {
                    u0Var4.h(e10);
                    return;
                }
        }
    }
}
