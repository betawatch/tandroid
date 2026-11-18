package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                    bi.u7 u7Var = fm0Var2.K;
                    if (u7Var != null) {
                        u7Var.i();
                        fm0Var2.K = null;
                    }
                } else {
                    bi.u7 u7Var2 = fm0Var2.K;
                    if (u7Var2 == null || u7Var2.b != starGift.id) {
                        i7 = ((org.telegram.ui.ActionBar.h2) lm0Var).currentAccount;
                        bi.u7 u7Var3 = new bi.u7(i7, fm0Var2.L.id, new xl0(yl0Var, 2));
                        u7Var3.w = true;
                        fm0Var2.K = u7Var3;
                        u7Var3.l(false);
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
