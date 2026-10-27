package vi;

import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.oy0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ i0(u0 u0Var, int i10) {
        this.a = i10;
        this.b = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                if (u0Var.Z == 3) {
                    u0Var.q();
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.b;
                w wVar = u0Var2.T;
                File file = u0Var2.U;
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
                    w7.x.c(wVar.a);
                }
                if (file != null) {
                    w7.x.c(file);
                    return;
                }
                return;
            case 2:
                u0 u0Var3 = this.b;
                int i10 = u0Var3.Z;
                if (i10 == 2 || i10 == 6) {
                    u0Var3.I = SystemClock.elapsedRealtime();
                    u0Var3.m.b("recording started: retainedDurationMs=" + u0Var3.H);
                    u0Var3.w(3);
                    long j10 = u0Var3.q - u0Var3.H;
                    if (j10 > 0 && !u0Var3.D) {
                        u0Var3.i.postDelayed(u0Var3.W, j10);
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
                u0Var4.m.b("recording segment stopped: state=" + b10.x(u0Var4.Z) + ", retainedDurationMs=" + u0Var4.H);
                if (u0Var4.C) {
                    u0Var4.C = false;
                    u0Var4.i();
                    return;
                }
                if (u0Var4.A) {
                    u0Var4.A = false;
                    u0Var4.j.execute(new vg.c(u0Var4, u0Var4.T, u0Var4.B, u0Var4.S));
                    return;
                }
                if (u0Var4.Z != 4) {
                    return;
                }
                try {
                    File d = u0Var4.d("round_video_preview_");
                    u0Var4.U = d;
                    u0Var4.M = System.nanoTime();
                    u0Var4.m.b("preview snapshot started: file=" + d.getName());
                    u0Var4.j.execute(new oy0(u0Var4, u0Var4.T, d, 25));
                    return;
                } catch (IOException e) {
                    u0Var4.h(e);
                    return;
                }
        }
    }
}
