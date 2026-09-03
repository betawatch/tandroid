package qh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.xz;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i5 b;

    public /* synthetic */ g5(i5 i5Var, int i10) {
        this.a = i10;
        this.b = i5Var;
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
                i5 i5Var = this.b;
                g5 g5Var = i5Var.H;
                j71 j71Var = i5Var.e;
                if (j71Var != null && i5Var.C != null) {
                    long n10 = j71Var.n();
                    if (i5Var.getDuration() > 1) {
                        float duration = n10 / i5Var.getDuration();
                        if (!i5Var.C.j1) {
                            r6 r6Var = i5Var.d;
                            if ((duration < r6Var.Z || duration > r6Var.a0) && System.currentTimeMillis() - i5Var.G > 500) {
                                i5Var.G = System.currentTimeMillis();
                                j71 j71Var2 = i5Var.e;
                                long duration2 = (long) (i5Var.d.Z * i5Var.getDuration());
                                j71Var2.L(duration2, false);
                                i5Var.w(true);
                                i5Var.y(true);
                                n10 = duration2;
                                i5Var.C.setProgress(i5Var.e.n());
                            }
                        }
                        i5Var.w(n10 < i5Var.F);
                        i5Var.y(n10 < i5Var.F);
                        i5Var.C.setProgress(i5Var.e.n());
                    } else {
                        i5Var.C.setProgress(i5Var.e.n());
                    }
                    if (i5Var.e.y()) {
                        AndroidUtilities.cancelRunOnUIThread(g5Var);
                        AndroidUtilities.runOnUIThread(g5Var, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                    }
                    i5Var.F = n10;
                    break;
                }
                break;
            case 4:
                i5 i5Var2 = this.b;
                g5 g5Var2 = i5Var2.I;
                if (i5Var2.y != null && i5Var2.e == null && i5Var2.x == null && i5Var2.C != null && !i5Var2.j()) {
                    long n11 = i5Var2.y.n();
                    r6 r6Var2 = i5Var2.d;
                    if (r6Var2 != null) {
                        float f10 = n11;
                        float f11 = r6Var2.E;
                        float f12 = r6Var2.C;
                        if ((f10 < f11 * f12 || f10 > r6Var2.F * f12) && System.currentTimeMillis() - i5Var2.G > 500) {
                            i5Var2.G = System.currentTimeMillis();
                            j71 j71Var3 = i5Var2.y;
                            long j10 = (long) (i5Var2.d.E * r3.C);
                            j71Var3.L(j10, false);
                            n11 = j10;
                        }
                    }
                    i5Var2.C.setProgress(n11);
                    if (i5Var2.y.y()) {
                        AndroidUtilities.cancelRunOnUIThread(g5Var2);
                        AndroidUtilities.runOnUIThread(g5Var2, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                        break;
                    }
                }
                break;
            case 5:
                i5 i5Var3 = this.b;
                g5 g5Var3 = i5Var3.J;
                if (i5Var3.x != null && i5Var3.e == null && !i5Var3.j() && i5Var3.C != null) {
                    long n12 = i5Var3.x.n();
                    r6 r6Var3 = i5Var3.d;
                    if (r6Var3 != null) {
                        float f13 = n12;
                        float f14 = r6Var3.s0;
                        float f15 = r6Var3.q0;
                        if ((f13 < f14 * f15 || f13 > r6Var3.t0 * f15) && System.currentTimeMillis() - i5Var3.G > 500) {
                            i5Var3.G = System.currentTimeMillis();
                            j71 j71Var4 = i5Var3.x;
                            long j11 = (long) (i5Var3.d.s0 * r3.q0);
                            j71Var4.L(j11, false);
                            i5Var3.w(true);
                            n12 = j11;
                        }
                    }
                    i5Var3.C.setProgress(n12);
                    if (i5Var3.x.y()) {
                        AndroidUtilities.cancelRunOnUIThread(g5Var3);
                        AndroidUtilities.runOnUIThread(g5Var3, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                        break;
                    }
                }
                break;
            default:
                i5 i5Var4 = this.b;
                x61 x61Var = i5Var4.n;
                if (x61Var != null) {
                    xz xzVar = x61Var.b;
                    if (xzVar != null) {
                        xzVar.postRunnable(new uz(xzVar, 0));
                    }
                    x61Var.a = null;
                    i5Var4.removeView(i5Var4.n);
                    i5Var4.n = null;
                    break;
                }
                break;
        }
    }
}
