package qh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.xz;
import org.telegram.ui.Components.y61;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j5 b;

    public /* synthetic */ h5(j5 j5Var, int i10) {
        this.a = i10;
        this.b = j5Var;
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
                j5 j5Var = this.b;
                h5 h5Var = j5Var.H;
                k71 k71Var = j5Var.e;
                if (k71Var != null && j5Var.C != null) {
                    long n10 = k71Var.n();
                    if (j5Var.getDuration() > 1) {
                        float duration = n10 / j5Var.getDuration();
                        if (!j5Var.C.j1) {
                            s6 s6Var = j5Var.d;
                            if ((duration < s6Var.Z || duration > s6Var.a0) && System.currentTimeMillis() - j5Var.G > 500) {
                                j5Var.G = System.currentTimeMillis();
                                k71 k71Var2 = j5Var.e;
                                long duration2 = (long) (j5Var.d.Z * j5Var.getDuration());
                                k71Var2.L(duration2, false);
                                j5Var.w(true);
                                j5Var.y(true);
                                n10 = duration2;
                                j5Var.C.setProgress(j5Var.e.n());
                            }
                        }
                        j5Var.w(n10 < j5Var.F);
                        j5Var.y(n10 < j5Var.F);
                        j5Var.C.setProgress(j5Var.e.n());
                    } else {
                        j5Var.C.setProgress(j5Var.e.n());
                    }
                    if (j5Var.e.y()) {
                        AndroidUtilities.cancelRunOnUIThread(h5Var);
                        AndroidUtilities.runOnUIThread(h5Var, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                    }
                    j5Var.F = n10;
                    break;
                }
                break;
            case 4:
                j5 j5Var2 = this.b;
                h5 h5Var2 = j5Var2.I;
                if (j5Var2.y != null && j5Var2.e == null && j5Var2.x == null && j5Var2.C != null && !j5Var2.j()) {
                    long n11 = j5Var2.y.n();
                    s6 s6Var2 = j5Var2.d;
                    if (s6Var2 != null) {
                        float f10 = n11;
                        float f11 = s6Var2.E;
                        float f12 = s6Var2.C;
                        if ((f10 < f11 * f12 || f10 > s6Var2.F * f12) && System.currentTimeMillis() - j5Var2.G > 500) {
                            j5Var2.G = System.currentTimeMillis();
                            k71 k71Var3 = j5Var2.y;
                            long j10 = (long) (j5Var2.d.E * r3.C);
                            k71Var3.L(j10, false);
                            n11 = j10;
                        }
                    }
                    j5Var2.C.setProgress(n11);
                    if (j5Var2.y.y()) {
                        AndroidUtilities.cancelRunOnUIThread(h5Var2);
                        AndroidUtilities.runOnUIThread(h5Var2, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                        break;
                    }
                }
                break;
            case 5:
                j5 j5Var3 = this.b;
                h5 h5Var3 = j5Var3.J;
                if (j5Var3.x != null && j5Var3.e == null && !j5Var3.j() && j5Var3.C != null) {
                    long n12 = j5Var3.x.n();
                    s6 s6Var3 = j5Var3.d;
                    if (s6Var3 != null) {
                        float f13 = n12;
                        float f14 = s6Var3.s0;
                        float f15 = s6Var3.q0;
                        if ((f13 < f14 * f15 || f13 > s6Var3.t0 * f15) && System.currentTimeMillis() - j5Var3.G > 500) {
                            j5Var3.G = System.currentTimeMillis();
                            k71 k71Var4 = j5Var3.x;
                            long j11 = (long) (j5Var3.d.s0 * r3.q0);
                            k71Var4.L(j11, false);
                            j5Var3.w(true);
                            n12 = j11;
                        }
                    }
                    j5Var3.C.setProgress(n12);
                    if (j5Var3.x.y()) {
                        AndroidUtilities.cancelRunOnUIThread(h5Var3);
                        AndroidUtilities.runOnUIThread(h5Var3, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                        break;
                    }
                }
                break;
            default:
                j5 j5Var4 = this.b;
                y61 y61Var = j5Var4.n;
                if (y61Var != null) {
                    xz xzVar = y61Var.b;
                    if (xzVar != null) {
                        xzVar.postRunnable(new uz(xzVar, 0));
                    }
                    y61Var.a = null;
                    j5Var4.removeView(j5Var4.n);
                    j5Var4.n = null;
                    break;
                }
                break;
        }
    }
}
