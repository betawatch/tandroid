package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class xl0 implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yl0 b;

    public /* synthetic */ xl0(yl0 yl0Var, int i7) {
        this.a = i7;
        this.b = yl0Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7;
        jm0 jm0Var;
        fm0 fm0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                yl0 yl0Var = this.b;
                fm0 fm0Var2 = yl0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) fm0Var2.N.get(num);
                fm0Var2.L = starGift;
                lm0 lm0Var = fm0Var2.q0;
                if (starGift == null) {
                    bi.v7 v7Var = fm0Var2.K;
                    if (v7Var != null) {
                        v7Var.i();
                        fm0Var2.K = null;
                    }
                } else {
                    bi.v7 v7Var2 = fm0Var2.K;
                    if (v7Var2 == null || v7Var2.b != starGift.id) {
                        i7 = ((org.telegram.ui.ActionBar.h2) lm0Var).currentAccount;
                        bi.v7 v7Var3 = new bi.v7(i7, fm0Var2.L.id, new xl0(yl0Var, 2));
                        v7Var3.w = true;
                        fm0Var2.K = v7Var3;
                        v7Var3.l(false);
                    }
                }
                fm0.a(fm0Var2);
                (lm0Var.J.getCurrentPosition() == 1 ? lm0Var.n : lm0Var.h).e();
                break;
            case 1:
                fm0 fm0Var3 = this.b.e;
                fm0Var3.h = ((Integer) obj).intValue();
                fm0Var3.r = null;
                fm0Var3.s = null;
                fm0Var3.J = null;
                fm0Var3.j(true);
                fm0Var3.i();
                fm0Var3.f(true);
                em0 em0Var = fm0Var3.E;
                if (em0Var != null) {
                    em0Var.invalidate();
                }
                lm0 lm0Var2 = fm0Var3.q0;
                fm0 fm0Var4 = lm0Var2.n;
                if (fm0Var4 != null && (jm0Var = fm0Var4.a) != null && (fm0Var = lm0Var2.h) != null) {
                    jm0Var.a(fm0Var.h);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
