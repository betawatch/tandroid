package vh;

import android.os.SystemClock;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r4 b;

    public /* synthetic */ p4(r4 r4Var, int i10) {
        this.a = i10;
        this.b = r4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r4 r4Var = this.b;
                r4Var.r0 = false;
                r4Var.z0 = false;
                r4Var.v0 = SystemClock.elapsedRealtime();
                r4Var.u0 = true;
                r4Var.w0 = false;
                r4Var.J.c(false);
                r4Var.K.c(false);
                r4Var.L.c(false);
                ((o7) r4Var.a).e(true);
                break;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                r4 r4Var2 = this.b;
                r4Var2.Q = currentTimeMillis;
                r4Var2.R = 0L;
                r4Var2.r0 = true;
                ((o7) r4Var2.a).a.J0.a(0L, true);
                break;
            case 2:
                r4 r4Var3 = this.b;
                if (!r4Var3.r0 && !r4Var3.b()) {
                    if (!o8.c(((o7) r4Var3.a).a)) {
                        r4Var3.w0 = false;
                        r4Var3.J.c(false);
                        r4Var3.K.c(false);
                        r4Var3.L.c(false);
                        break;
                    } else {
                        r4Var3.z0 = true;
                        r4Var3.A0 = true;
                        ((o7) r4Var3.a).f(new p4(r4Var3, 4), true);
                        break;
                    }
                }
                break;
            case 3:
                r4 r4Var4 = this.b;
                if (!r4Var4.r0 && !r4Var4.b()) {
                    t7 t7Var = ((o7) r4Var4.a).a.B0;
                    if (t7Var != null) {
                        t7Var.toggleDual();
                    }
                    r4Var4.d(360.0f);
                    r4Var4.w0 = false;
                    r4Var4.J.c(false);
                    r4Var4.K.c(false);
                    r4Var4.L.c(false);
                    break;
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                r4 r4Var5 = this.b;
                r4Var5.Q = currentTimeMillis2;
                r4Var5.r0 = true;
                q4 q4Var = r4Var5.a;
                r4Var5.R = 0L;
                ((o7) q4Var).a.J0.a(0L, true);
                break;
        }
    }
}
