package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qp0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ rp0 b;

    public /* synthetic */ qp0(rp0 rp0Var, int i10) {
        this.a = i10;
        this.b = rp0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        cq0 cq0Var;
        yp0 yp0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                rp0 rp0Var = this.b;
                yp0 yp0Var2 = rp0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) yp0Var2.M.get(num);
                yp0Var2.K = starGift;
                eq0 eq0Var = yp0Var2.p0;
                if (starGift == null) {
                    yh.t3 t3Var = yp0Var2.J;
                    if (t3Var != null) {
                        t3Var.f();
                        yp0Var2.J = null;
                    }
                } else {
                    yh.t3 t3Var2 = yp0Var2.J;
                    if (t3Var2 == null || t3Var2.b != starGift.id) {
                        i10 = ((org.telegram.ui.ActionBar.m2) eq0Var).currentAccount;
                        yh.t3 t3Var3 = new yh.t3(yp0Var2.K.id, i10, new qp0(rp0Var, 2));
                        yp0Var2.J = t3Var3;
                        t3Var3.g(false);
                    }
                }
                yp0.a(yp0Var2);
                (eq0Var.I.getCurrentPosition() == 1 ? eq0Var.n : eq0Var.h).e();
                break;
            case 1:
                yp0 yp0Var3 = this.b.e;
                yp0Var3.h = ((Integer) obj).intValue();
                yp0Var3.r = null;
                yp0Var3.s = null;
                yp0Var3.I = null;
                yp0Var3.j(true);
                yp0Var3.i();
                yp0Var3.f(true);
                xp0 xp0Var = yp0Var3.y;
                if (xp0Var != null) {
                    xp0Var.invalidate();
                }
                eq0 eq0Var2 = yp0Var3.p0;
                yp0 yp0Var4 = eq0Var2.n;
                if (yp0Var4 != null && (cq0Var = yp0Var4.a) != null && (yp0Var = eq0Var2.h) != null) {
                    cq0Var.a(yp0Var.h);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
