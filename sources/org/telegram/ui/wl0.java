package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wl0 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xl0 b;

    public /* synthetic */ wl0(xl0 xl0Var, int i7) {
        this.a = i7;
        this.b = xl0Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7;
        im0 im0Var;
        em0 em0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                xl0 xl0Var = this.b;
                em0 em0Var2 = xl0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) em0Var2.M.get(num);
                em0Var2.K = starGift;
                km0 km0Var = em0Var2.p0;
                if (starGift == null) {
                    zh.c3 c3Var = em0Var2.J;
                    if (c3Var != null) {
                        c3Var.f();
                        em0Var2.J = null;
                    }
                } else {
                    zh.c3 c3Var2 = em0Var2.J;
                    if (c3Var2 == null || c3Var2.b != starGift.id) {
                        i7 = ((org.telegram.ui.ActionBar.f2) km0Var).currentAccount;
                        zh.c3 c3Var3 = new zh.c3(i7, em0Var2.K.id, new wl0(xl0Var, 2));
                        em0Var2.J = c3Var3;
                        c3Var3.g(false);
                    }
                }
                em0.a(em0Var2);
                (km0Var.I.getCurrentPosition() == 1 ? km0Var.n : km0Var.h).e();
                break;
            case 1:
                em0 em0Var3 = this.b.e;
                em0Var3.h = ((Integer) obj).intValue();
                em0Var3.r = null;
                em0Var3.s = null;
                em0Var3.I = null;
                em0Var3.j(true);
                em0Var3.i();
                em0Var3.f(true);
                dm0 dm0Var = em0Var3.D;
                if (dm0Var != null) {
                    dm0Var.invalidate();
                }
                km0 km0Var2 = em0Var3.p0;
                em0 em0Var4 = km0Var2.n;
                if (em0Var4 != null && (im0Var = em0Var4.a) != null && (em0Var = km0Var2.h) != null) {
                    im0Var.a(em0Var.h);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
