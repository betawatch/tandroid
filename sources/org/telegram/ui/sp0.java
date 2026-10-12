package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class sp0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ tp0 b;

    public /* synthetic */ sp0(tp0 tp0Var, int i10) {
        this.a = i10;
        this.b = tp0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        eq0 eq0Var;
        aq0 aq0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                tp0 tp0Var = this.b;
                aq0 aq0Var2 = tp0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) aq0Var2.M.get(num);
                aq0Var2.K = starGift;
                gq0 gq0Var = aq0Var2.p0;
                if (starGift == null) {
                    yh.t3 t3Var = aq0Var2.J;
                    if (t3Var != null) {
                        t3Var.f();
                        aq0Var2.J = null;
                    }
                } else {
                    yh.t3 t3Var2 = aq0Var2.J;
                    if (t3Var2 == null || t3Var2.b != starGift.id) {
                        i10 = ((org.telegram.ui.ActionBar.m2) gq0Var).currentAccount;
                        yh.t3 t3Var3 = new yh.t3(aq0Var2.K.id, i10, new sp0(tp0Var, 2));
                        aq0Var2.J = t3Var3;
                        t3Var3.g(false);
                    }
                }
                aq0.a(aq0Var2);
                (gq0Var.I.getCurrentPosition() == 1 ? gq0Var.n : gq0Var.h).e();
                break;
            case 1:
                aq0 aq0Var3 = this.b.e;
                aq0Var3.h = ((Integer) obj).intValue();
                aq0Var3.r = null;
                aq0Var3.s = null;
                aq0Var3.I = null;
                aq0Var3.j(true);
                aq0Var3.i();
                aq0Var3.f(true);
                zp0 zp0Var = aq0Var3.y;
                if (zp0Var != null) {
                    zp0Var.invalidate();
                }
                gq0 gq0Var2 = aq0Var3.p0;
                aq0 aq0Var4 = gq0Var2.n;
                if (aq0Var4 != null && (eq0Var = aq0Var4.a) != null && (aq0Var = gq0Var2.h) != null) {
                    eq0Var.a(aq0Var.h);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
