package vh;

import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class i4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k4 b;

    public /* synthetic */ i4(k4 k4Var, int i10) {
        this.a = i10;
        this.b = k4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r();
                break;
            case 1:
                this.b.r();
                break;
            case 2:
                this.b.m(0L);
                break;
            case 3:
                k4 k4Var = this.b;
                i4 i4Var = k4Var.K;
                u61 u61Var = k4Var.e;
                if (u61Var != null && k4Var.F != null) {
                    long S = u61Var.S();
                    if (k4Var.getDuration() > 1) {
                        float duration = S / k4Var.getDuration();
                        if (!k4Var.F.m1) {
                            n5 n5Var = k4Var.d;
                            if ((duration < n5Var.Z || duration > n5Var.a0) && System.currentTimeMillis() - k4Var.J > 500) {
                                k4Var.J = System.currentTimeMillis();
                                u61 u61Var2 = k4Var.e;
                                long duration2 = (long) (k4Var.d.Z * k4Var.getDuration());
                                u61Var2.q0(duration2, false);
                                k4Var.w(true);
                                k4Var.y(true);
                                S = duration2;
                                k4Var.F.setProgress(k4Var.e.S());
                            }
                        }
                        k4Var.w(S < k4Var.I);
                        k4Var.y(S < k4Var.I);
                        k4Var.F.setProgress(k4Var.e.S());
                    } else {
                        k4Var.F.setProgress(k4Var.e.S());
                    }
                    if (k4Var.e.d0()) {
                        org.telegram.messenger.i0.r(i4Var);
                        org.telegram.messenger.i0.h3(i4Var, (long) (1000.0f / org.telegram.messenger.i0.r));
                    }
                    k4Var.I = S;
                    break;
                }
                break;
            case 4:
                k4 k4Var2 = this.b;
                i4 i4Var2 = k4Var2.L;
                if (k4Var2.D != null && k4Var2.e == null && k4Var2.y == null && k4Var2.F != null && !k4Var2.j()) {
                    long S2 = k4Var2.D.S();
                    n5 n5Var2 = k4Var2.d;
                    if (n5Var2 != null) {
                        float f7 = S2;
                        float f10 = n5Var2.E;
                        float f11 = n5Var2.C;
                        if ((f7 < f10 * f11 || f7 > n5Var2.F * f11) && System.currentTimeMillis() - k4Var2.J > 500) {
                            k4Var2.J = System.currentTimeMillis();
                            u61 u61Var3 = k4Var2.D;
                            long j10 = (long) (k4Var2.d.E * r3.C);
                            u61Var3.q0(j10, false);
                            S2 = j10;
                        }
                    }
                    k4Var2.F.setProgress(S2);
                    if (k4Var2.D.d0()) {
                        org.telegram.messenger.i0.r(i4Var2);
                        org.telegram.messenger.i0.h3(i4Var2, (long) (1000.0f / org.telegram.messenger.i0.r));
                        break;
                    }
                }
                break;
            case 5:
                k4 k4Var3 = this.b;
                i4 i4Var3 = k4Var3.M;
                if (k4Var3.y != null && k4Var3.e == null && !k4Var3.j() && k4Var3.F != null) {
                    long S3 = k4Var3.y.S();
                    n5 n5Var3 = k4Var3.d;
                    if (n5Var3 != null) {
                        float f12 = S3;
                        float f13 = n5Var3.s0;
                        float f14 = n5Var3.q0;
                        if ((f12 < f13 * f14 || f12 > n5Var3.t0 * f14) && System.currentTimeMillis() - k4Var3.J > 500) {
                            k4Var3.J = System.currentTimeMillis();
                            u61 u61Var4 = k4Var3.y;
                            long j11 = (long) (k4Var3.d.s0 * r3.q0);
                            u61Var4.q0(j11, false);
                            k4Var3.w(true);
                            S3 = j11;
                        }
                    }
                    k4Var3.F.setProgress(S3);
                    if (k4Var3.y.d0()) {
                        org.telegram.messenger.i0.r(i4Var3);
                        org.telegram.messenger.i0.h3(i4Var3, (long) (1000.0f / org.telegram.messenger.i0.r));
                        break;
                    }
                }
                break;
            default:
                k4 k4Var4 = this.b;
                k61 k61Var = k4Var4.n;
                if (k61Var != null) {
                    gz gzVar = k61Var.b;
                    if (gzVar != null) {
                        gzVar.postRunnable(new dz(gzVar, 0));
                    }
                    k61Var.a = null;
                    k4Var4.removeView(k4Var4.n);
                    k4Var4.n = null;
                    break;
                }
                break;
        }
    }
}
