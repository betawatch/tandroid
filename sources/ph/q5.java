package ph;

import android.os.SystemClock;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5 b;

    public /* synthetic */ q5(t5 t5Var, int i10) {
        this.a = i10;
        this.b = t5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t5 t5Var = this.b;
                t5Var.o0 = false;
                t5Var.w0 = false;
                t5Var.s0 = SystemClock.elapsedRealtime();
                t5Var.r0 = true;
                t5Var.t0 = false;
                t5Var.G.c(false);
                t5Var.H.c(false);
                t5Var.I.c(false);
                ((a9) t5Var.a).d(true);
                break;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                t5 t5Var2 = this.b;
                t5Var2.N = currentTimeMillis;
                t5Var2.O = 0L;
                t5Var2.o0 = true;
                ((a9) t5Var2.a).a.G0.a(0L, true);
                break;
            case 2:
                t5 t5Var3 = this.b;
                if (!t5Var3.o0 && !t5Var3.b()) {
                    if (!da.d(((a9) t5Var3.a).a)) {
                        t5Var3.t0 = false;
                        t5Var3.G.c(false);
                        t5Var3.H.c(false);
                        t5Var3.I.c(false);
                        break;
                    } else {
                        t5Var3.w0 = true;
                        t5Var3.x0 = true;
                        ((a9) t5Var3.a).e(new q5(t5Var3, 4), true);
                        break;
                    }
                }
                break;
            case 3:
                t5 t5Var4 = this.b;
                if (!t5Var4.o0 && !t5Var4.b()) {
                    i9 i9Var = ((a9) t5Var4.a).a.y0;
                    if (i9Var != null) {
                        i9Var.toggleDual();
                    }
                    t5Var4.d(360.0f);
                    t5Var4.t0 = false;
                    t5Var4.G.c(false);
                    t5Var4.H.c(false);
                    t5Var4.I.c(false);
                    break;
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                t5 t5Var5 = this.b;
                t5Var5.N = currentTimeMillis2;
                t5Var5.o0 = true;
                r5 r5Var = t5Var5.a;
                t5Var5.O = 0L;
                ((a9) r5Var).a.G0.a(0L, true);
                break;
        }
    }
}
