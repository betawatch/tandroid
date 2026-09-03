package qh;

import android.os.SystemClock;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q5 b;

    public /* synthetic */ n5(q5 q5Var, int i10) {
        this.a = i10;
        this.b = q5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q5 q5Var = this.b;
                q5Var.o0 = false;
                q5Var.w0 = false;
                q5Var.s0 = SystemClock.elapsedRealtime();
                q5Var.r0 = true;
                q5Var.t0 = false;
                q5Var.G.c(false);
                q5Var.H.c(false);
                q5Var.I.c(false);
                ((x8) q5Var.a).d(true);
                break;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                q5 q5Var2 = this.b;
                q5Var2.N = currentTimeMillis;
                q5Var2.O = 0L;
                q5Var2.o0 = true;
                ((x8) q5Var2.a).a.G0.a(0L, true);
                break;
            case 2:
                q5 q5Var3 = this.b;
                if (!q5Var3.o0 && !q5Var3.b()) {
                    if (!ba.d(((x8) q5Var3.a).a)) {
                        q5Var3.t0 = false;
                        q5Var3.G.c(false);
                        q5Var3.H.c(false);
                        q5Var3.I.c(false);
                        break;
                    } else {
                        q5Var3.w0 = true;
                        q5Var3.x0 = true;
                        ((x8) q5Var3.a).e(new n5(q5Var3, 4), true);
                        break;
                    }
                }
                break;
            case 3:
                q5 q5Var4 = this.b;
                if (!q5Var4.o0 && !q5Var4.b()) {
                    f9 f9Var = ((x8) q5Var4.a).a.y0;
                    if (f9Var != null) {
                        f9Var.toggleDual();
                    }
                    q5Var4.d(360.0f);
                    q5Var4.t0 = false;
                    q5Var4.G.c(false);
                    q5Var4.H.c(false);
                    q5Var4.I.c(false);
                    break;
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                q5 q5Var5 = this.b;
                q5Var5.N = currentTimeMillis2;
                q5Var5.o0 = true;
                o5 o5Var = q5Var5.a;
                q5Var5.O = 0L;
                ((x8) o5Var).a.G0.a(0L, true);
                break;
        }
    }
}
