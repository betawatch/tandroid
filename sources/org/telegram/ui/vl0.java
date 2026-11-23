package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class vl0 implements org.telegram.messenger.w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wl0 b;

    public /* synthetic */ vl0(wl0 wl0Var, int i7) {
        this.a = i7;
        this.b = wl0Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        int i7;
        hm0 hm0Var;
        dm0 dm0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                wl0 wl0Var = this.b;
                dm0 dm0Var2 = wl0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) dm0Var2.N.get(num);
                dm0Var2.L = starGift;
                jm0 jm0Var = dm0Var2.q0;
                if (starGift == null) {
                    bi.a8 a8Var = dm0Var2.K;
                    if (a8Var != null) {
                        a8Var.i();
                        dm0Var2.K = null;
                    }
                } else {
                    bi.a8 a8Var2 = dm0Var2.K;
                    if (a8Var2 == null || a8Var2.b != starGift.id) {
                        i7 = ((org.telegram.ui.ActionBar.g2) jm0Var).currentAccount;
                        bi.a8 a8Var3 = new bi.a8(i7, dm0Var2.L.id, new vl0(wl0Var, 2));
                        a8Var3.w = true;
                        dm0Var2.K = a8Var3;
                        a8Var3.l(false);
                    }
                }
                dm0.a(dm0Var2);
                (jm0Var.J.getCurrentPosition() == 1 ? jm0Var.n : jm0Var.h).e();
                break;
            case 1:
                dm0 dm0Var3 = this.b.e;
                dm0Var3.h = ((Integer) obj).intValue();
                dm0Var3.r = null;
                dm0Var3.s = null;
                dm0Var3.J = null;
                dm0Var3.j(true);
                dm0Var3.i();
                dm0Var3.f(true);
                cm0 cm0Var = dm0Var3.E;
                if (cm0Var != null) {
                    cm0Var.invalidate();
                }
                jm0 jm0Var2 = dm0Var3.q0;
                dm0 dm0Var4 = jm0Var2.n;
                if (dm0Var4 != null && (hm0Var = dm0Var4.a) != null && (dm0Var = jm0Var2.h) != null) {
                    hm0Var.a(dm0Var.h);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
