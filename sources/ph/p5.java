package ph;

import android.os.SystemClock;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s5 b;

    public /* synthetic */ p5(s5 s5Var, int i10) {
        this.a = i10;
        this.b = s5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s5 s5Var = this.b;
                s5Var.o0 = false;
                s5Var.w0 = false;
                s5Var.s0 = SystemClock.elapsedRealtime();
                s5Var.r0 = true;
                s5Var.t0 = false;
                s5Var.G.c(false);
                s5Var.H.c(false);
                s5Var.I.c(false);
                ((a9) s5Var.a).d(true);
                break;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                s5 s5Var2 = this.b;
                s5Var2.N = currentTimeMillis;
                s5Var2.O = 0L;
                s5Var2.o0 = true;
                ((a9) s5Var2.a).a.G0.a(0L, true);
                break;
            case 2:
                s5 s5Var3 = this.b;
                if (!s5Var3.o0 && !s5Var3.b()) {
                    if (!da.d(((a9) s5Var3.a).a)) {
                        s5Var3.t0 = false;
                        s5Var3.G.c(false);
                        s5Var3.H.c(false);
                        s5Var3.I.c(false);
                        break;
                    } else {
                        s5Var3.w0 = true;
                        s5Var3.x0 = true;
                        ((a9) s5Var3.a).e(new p5(s5Var3, 4), true);
                        break;
                    }
                }
                break;
            case 3:
                s5 s5Var4 = this.b;
                if (!s5Var4.o0 && !s5Var4.b()) {
                    i9 i9Var = ((a9) s5Var4.a).a.y0;
                    if (i9Var != null) {
                        i9Var.toggleDual();
                    }
                    s5Var4.d(360.0f);
                    s5Var4.t0 = false;
                    s5Var4.G.c(false);
                    s5Var4.H.c(false);
                    s5Var4.I.c(false);
                    break;
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                s5 s5Var5 = this.b;
                s5Var5.N = currentTimeMillis2;
                s5Var5.o0 = true;
                q5 q5Var = s5Var5.a;
                s5Var5.O = 0L;
                ((a9) q5Var).a.G0.a(0L, true);
                break;
        }
    }
}
