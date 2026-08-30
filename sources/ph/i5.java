package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.w61;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l5 b;

    public /* synthetic */ i5(l5 l5Var, int i10) {
        this.a = i10;
        this.b = l5Var;
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
                l5 l5Var = this.b;
                i5 i5Var = l5Var.H;
                i71 i71Var = l5Var.e;
                if (i71Var != null && l5Var.C != null) {
                    long n10 = i71Var.n();
                    if (l5Var.getDuration() > 1) {
                        float duration = n10 / l5Var.getDuration();
                        if (!l5Var.C.j1) {
                            u6 u6Var = l5Var.d;
                            if ((duration < u6Var.Z || duration > u6Var.a0) && System.currentTimeMillis() - l5Var.G > 500) {
                                l5Var.G = System.currentTimeMillis();
                                i71 i71Var2 = l5Var.e;
                                long duration2 = (long) (l5Var.d.Z * l5Var.getDuration());
                                i71Var2.L(duration2, false);
                                l5Var.w(true);
                                l5Var.y(true);
                                n10 = duration2;
                                l5Var.C.setProgress(l5Var.e.n());
                            }
                        }
                        l5Var.w(n10 < l5Var.F);
                        l5Var.y(n10 < l5Var.F);
                        l5Var.C.setProgress(l5Var.e.n());
                    } else {
                        l5Var.C.setProgress(l5Var.e.n());
                    }
                    if (l5Var.e.y()) {
                        AndroidUtilities.cancelRunOnUIThread(i5Var);
                        AndroidUtilities.runOnUIThread(i5Var, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                    }
                    l5Var.F = n10;
                    break;
                }
                break;
            case 4:
                l5 l5Var2 = this.b;
                i5 i5Var2 = l5Var2.I;
                if (l5Var2.y != null && l5Var2.e == null && l5Var2.x == null && l5Var2.C != null && !l5Var2.j()) {
                    long n11 = l5Var2.y.n();
                    u6 u6Var2 = l5Var2.d;
                    if (u6Var2 != null) {
                        float f10 = n11;
                        float f11 = u6Var2.E;
                        float f12 = u6Var2.C;
                        if ((f10 < f11 * f12 || f10 > u6Var2.F * f12) && System.currentTimeMillis() - l5Var2.G > 500) {
                            l5Var2.G = System.currentTimeMillis();
                            i71 i71Var3 = l5Var2.y;
                            long j10 = (long) (l5Var2.d.E * r3.C);
                            i71Var3.L(j10, false);
                            n11 = j10;
                        }
                    }
                    l5Var2.C.setProgress(n11);
                    if (l5Var2.y.y()) {
                        AndroidUtilities.cancelRunOnUIThread(i5Var2);
                        AndroidUtilities.runOnUIThread(i5Var2, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                        break;
                    }
                }
                break;
            case 5:
                l5 l5Var3 = this.b;
                i5 i5Var3 = l5Var3.J;
                if (l5Var3.x != null && l5Var3.e == null && !l5Var3.j() && l5Var3.C != null) {
                    long n12 = l5Var3.x.n();
                    u6 u6Var3 = l5Var3.d;
                    if (u6Var3 != null) {
                        float f13 = n12;
                        float f14 = u6Var3.s0;
                        float f15 = u6Var3.q0;
                        if ((f13 < f14 * f15 || f13 > u6Var3.t0 * f15) && System.currentTimeMillis() - l5Var3.G > 500) {
                            l5Var3.G = System.currentTimeMillis();
                            i71 i71Var4 = l5Var3.x;
                            long j11 = (long) (l5Var3.d.s0 * r3.q0);
                            i71Var4.L(j11, false);
                            l5Var3.w(true);
                            n12 = j11;
                        }
                    }
                    l5Var3.C.setProgress(n12);
                    if (l5Var3.x.y()) {
                        AndroidUtilities.cancelRunOnUIThread(i5Var3);
                        AndroidUtilities.runOnUIThread(i5Var3, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                        break;
                    }
                }
                break;
            default:
                l5 l5Var4 = this.b;
                w61 w61Var = l5Var4.n;
                if (w61Var != null) {
                    vz vzVar = w61Var.b;
                    if (vzVar != null) {
                        vzVar.postRunnable(new sz(vzVar, 0));
                    }
                    w61Var.a = null;
                    l5Var4.removeView(l5Var4.n);
                    l5Var4.n = null;
                    break;
                }
                break;
        }
    }
}
