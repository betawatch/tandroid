package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class vl0 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wl0 b;

    public /* synthetic */ vl0(wl0 wl0Var, int i7) {
        this.a = i7;
        this.b = wl0Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7;
        hm0 hm0Var;
        dm0 dm0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                wl0 wl0Var = this.b;
                dm0 dm0Var2 = wl0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) dm0Var2.M.get(num);
                dm0Var2.K = starGift;
                jm0 jm0Var = dm0Var2.p0;
                if (starGift == null) {
                    zh.c3 c3Var = dm0Var2.J;
                    if (c3Var != null) {
                        c3Var.f();
                        dm0Var2.J = null;
                    }
                } else {
                    zh.c3 c3Var2 = dm0Var2.J;
                    if (c3Var2 == null || c3Var2.b != starGift.id) {
                        i7 = ((org.telegram.ui.ActionBar.f2) jm0Var).currentAccount;
                        zh.c3 c3Var3 = new zh.c3(i7, dm0Var2.K.id, new vl0(wl0Var, 2));
                        dm0Var2.J = c3Var3;
                        c3Var3.g(false);
                    }
                }
                dm0.a(dm0Var2);
                (jm0Var.I.getCurrentPosition() == 1 ? jm0Var.n : jm0Var.h).e();
                break;
            case 1:
                dm0 dm0Var3 = this.b.e;
                dm0Var3.h = ((Integer) obj).intValue();
                dm0Var3.r = null;
                dm0Var3.s = null;
                dm0Var3.I = null;
                dm0Var3.j(true);
                dm0Var3.i();
                dm0Var3.f(true);
                cm0 cm0Var = dm0Var3.D;
                if (cm0Var != null) {
                    cm0Var.invalidate();
                }
                jm0 jm0Var2 = dm0Var3.p0;
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
