package qh;

import android.os.SystemClock;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r5 b;

    public /* synthetic */ o5(r5 r5Var, int i10) {
        this.a = i10;
        this.b = r5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r5 r5Var = this.b;
                r5Var.o0 = false;
                r5Var.w0 = false;
                r5Var.s0 = SystemClock.elapsedRealtime();
                r5Var.r0 = true;
                r5Var.t0 = false;
                r5Var.G.c(false);
                r5Var.H.c(false);
                r5Var.I.c(false);
                ((y8) r5Var.a).d(true);
                break;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                r5 r5Var2 = this.b;
                r5Var2.N = currentTimeMillis;
                r5Var2.O = 0L;
                r5Var2.o0 = true;
                ((y8) r5Var2.a).a.G0.a(0L, true);
                break;
            case 2:
                r5 r5Var3 = this.b;
                if (!r5Var3.o0 && !r5Var3.b()) {
                    if (!ca.d(((y8) r5Var3.a).a)) {
                        r5Var3.t0 = false;
                        r5Var3.G.c(false);
                        r5Var3.H.c(false);
                        r5Var3.I.c(false);
                        break;
                    } else {
                        r5Var3.w0 = true;
                        r5Var3.x0 = true;
                        ((y8) r5Var3.a).e(new o5(r5Var3, 4), true);
                        break;
                    }
                }
                break;
            case 3:
                r5 r5Var4 = this.b;
                if (!r5Var4.o0 && !r5Var4.b()) {
                    g9 g9Var = ((y8) r5Var4.a).a.y0;
                    if (g9Var != null) {
                        g9Var.toggleDual();
                    }
                    r5Var4.d(360.0f);
                    r5Var4.t0 = false;
                    r5Var4.G.c(false);
                    r5Var4.H.c(false);
                    r5Var4.I.c(false);
                    break;
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                r5 r5Var5 = this.b;
                r5Var5.N = currentTimeMillis2;
                r5Var5.o0 = true;
                p5 p5Var = r5Var5.a;
                r5Var5.O = 0L;
                ((y8) p5Var).a.G0.a(0L, true);
                break;
        }
    }
}
