package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.w61;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k5 b;

    public /* synthetic */ i5(k5 k5Var, int i10) {
        this.a = i10;
        this.b = k5Var;
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
                k5 k5Var = this.b;
                i5 i5Var = k5Var.H;
                i71 i71Var = k5Var.e;
                if (i71Var != null && k5Var.C != null) {
                    long n10 = i71Var.n();
                    if (k5Var.getDuration() > 1) {
                        float duration = n10 / k5Var.getDuration();
                        if (!k5Var.C.j1) {
                            t6 t6Var = k5Var.d;
                            if ((duration < t6Var.Z || duration > t6Var.a0) && System.currentTimeMillis() - k5Var.G > 500) {
                                k5Var.G = System.currentTimeMillis();
                                i71 i71Var2 = k5Var.e;
                                long duration2 = (long) (k5Var.d.Z * k5Var.getDuration());
                                i71Var2.L(duration2, false);
                                k5Var.w(true);
                                k5Var.y(true);
                                n10 = duration2;
                                k5Var.C.setProgress(k5Var.e.n());
                            }
                        }
                        k5Var.w(n10 < k5Var.F);
                        k5Var.y(n10 < k5Var.F);
                        k5Var.C.setProgress(k5Var.e.n());
                    } else {
                        k5Var.C.setProgress(k5Var.e.n());
                    }
                    if (k5Var.e.y()) {
                        AndroidUtilities.cancelRunOnUIThread(i5Var);
                        AndroidUtilities.runOnUIThread(i5Var, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                    }
                    k5Var.F = n10;
                    break;
                }
                break;
            case 4:
                k5 k5Var2 = this.b;
                i5 i5Var2 = k5Var2.I;
                if (k5Var2.y != null && k5Var2.e == null && k5Var2.x == null && k5Var2.C != null && !k5Var2.j()) {
                    long n11 = k5Var2.y.n();
                    t6 t6Var2 = k5Var2.d;
                    if (t6Var2 != null) {
                        float f10 = n11;
                        float f11 = t6Var2.E;
                        float f12 = t6Var2.C;
                        if ((f10 < f11 * f12 || f10 > t6Var2.F * f12) && System.currentTimeMillis() - k5Var2.G > 500) {
                            k5Var2.G = System.currentTimeMillis();
                            i71 i71Var3 = k5Var2.y;
                            long j10 = (long) (k5Var2.d.E * r3.C);
                            i71Var3.L(j10, false);
                            n11 = j10;
                        }
                    }
                    k5Var2.C.setProgress(n11);
                    if (k5Var2.y.y()) {
                        AndroidUtilities.cancelRunOnUIThread(i5Var2);
                        AndroidUtilities.runOnUIThread(i5Var2, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                        break;
                    }
                }
                break;
            case 5:
                k5 k5Var3 = this.b;
                i5 i5Var3 = k5Var3.J;
                if (k5Var3.x != null && k5Var3.e == null && !k5Var3.j() && k5Var3.C != null) {
                    long n12 = k5Var3.x.n();
                    t6 t6Var3 = k5Var3.d;
                    if (t6Var3 != null) {
                        float f13 = n12;
                        float f14 = t6Var3.s0;
                        float f15 = t6Var3.q0;
                        if ((f13 < f14 * f15 || f13 > t6Var3.t0 * f15) && System.currentTimeMillis() - k5Var3.G > 500) {
                            k5Var3.G = System.currentTimeMillis();
                            i71 i71Var4 = k5Var3.x;
                            long j11 = (long) (k5Var3.d.s0 * r3.q0);
                            i71Var4.L(j11, false);
                            k5Var3.w(true);
                            n12 = j11;
                        }
                    }
                    k5Var3.C.setProgress(n12);
                    if (k5Var3.x.y()) {
                        AndroidUtilities.cancelRunOnUIThread(i5Var3);
                        AndroidUtilities.runOnUIThread(i5Var3, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                        break;
                    }
                }
                break;
            default:
                k5 k5Var4 = this.b;
                w61 w61Var = k5Var4.n;
                if (w61Var != null) {
                    vz vzVar = w61Var.b;
                    if (vzVar != null) {
                        vzVar.postRunnable(new sz(vzVar, 0));
                    }
                    w61Var.a = null;
                    k5Var4.removeView(k5Var4.n);
                    k5Var4.n = null;
                    break;
                }
                break;
        }
    }
}
