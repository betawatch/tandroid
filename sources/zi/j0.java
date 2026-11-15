package zi;

import android.os.SystemClock;
import c8.le;
import java.io.File;
import java.io.IOException;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ j0(v0 v0Var, int i7) {
        this.a = i7;
        this.b = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v0 v0Var = this.b;
                if (v0Var.a0 == 3) {
                    v0Var.q();
                    return;
                }
                return;
            case 1:
                v0 v0Var2 = this.b;
                y yVar = v0Var2.U;
                File file = v0Var2.V;
                if (yVar != null) {
                    try {
                        synchronized (yVar) {
                            yVar.w = true;
                            try {
                                yVar.g();
                            } finally {
                                yVar.w = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    le.c(yVar.a);
                }
                if (file != null) {
                    le.c(file);
                    return;
                }
                return;
            case 2:
                v0 v0Var3 = this.b;
                int i7 = v0Var3.a0;
                if (i7 == 2 || i7 == 6) {
                    v0Var3.J = SystemClock.elapsedRealtime();
                    v0Var3.m.b("recording started: retainedDurationMs=" + v0Var3.I);
                    v0Var3.x(3);
                    long j3 = v0Var3.q - v0Var3.I;
                    if (j3 > 0 && !v0Var3.D) {
                        v0Var3.i.postDelayed(v0Var3.X, j3);
                        return;
                    } else {
                        v0Var3.D = false;
                        v0Var3.q();
                        return;
                    }
                }
                return;
            default:
                v0 v0Var4 = this.b;
                v0Var4.E = false;
                v0Var4.m.b("recording segment stopped: state=" + p0.b(v0Var4.a0) + ", retainedDurationMs=" + v0Var4.I);
                if (v0Var4.C) {
                    v0Var4.C = false;
                    v0Var4.i();
                    return;
                }
                if (v0Var4.A) {
                    v0Var4.A = false;
                    v0Var4.j.execute(new wn(v0Var4, v0Var4.U, v0Var4.B, v0Var4.T, 18));
                    return;
                }
                if (v0Var4.a0 != 4) {
                    return;
                }
                try {
                    File d = v0Var4.d("round_video_preview_");
                    v0Var4.V = d;
                    v0Var4.N = System.nanoTime();
                    v0Var4.m.b("preview snapshot started: file=" + d.getName());
                    v0Var4.j.execute(new yi.d(v0Var4, v0Var4.U, d, 3));
                    return;
                } catch (IOException e10) {
                    v0Var4.h(e10);
                    return;
                }
        }
    }
}
