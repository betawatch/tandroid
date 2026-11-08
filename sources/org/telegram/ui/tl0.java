package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tl0 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ul0 b;

    public /* synthetic */ tl0(ul0 ul0Var, int i7) {
        this.a = i7;
        this.b = ul0Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7;
        fm0 fm0Var;
        bm0 bm0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                ul0 ul0Var = this.b;
                bm0 bm0Var2 = ul0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) bm0Var2.M.get(num);
                bm0Var2.K = starGift;
                hm0 hm0Var = bm0Var2.p0;
                if (starGift == null) {
                    zh.b3 b3Var = bm0Var2.J;
                    if (b3Var != null) {
                        b3Var.f();
                        bm0Var2.J = null;
                    }
                } else {
                    zh.b3 b3Var2 = bm0Var2.J;
                    if (b3Var2 == null || b3Var2.b != starGift.id) {
                        i7 = ((org.telegram.ui.ActionBar.f2) hm0Var).currentAccount;
                        zh.b3 b3Var3 = new zh.b3(i7, bm0Var2.K.id, new tl0(ul0Var, 2));
                        bm0Var2.J = b3Var3;
                        b3Var3.g(false);
                    }
                }
                bm0.a(bm0Var2);
                (hm0Var.I.getCurrentPosition() == 1 ? hm0Var.n : hm0Var.h).e();
                break;
            case 1:
                bm0 bm0Var3 = this.b.e;
                bm0Var3.h = ((Integer) obj).intValue();
                bm0Var3.r = null;
                bm0Var3.s = null;
                bm0Var3.I = null;
                bm0Var3.j(true);
                bm0Var3.i();
                bm0Var3.f(true);
                am0 am0Var = bm0Var3.D;
                if (am0Var != null) {
                    am0Var.invalidate();
                }
                hm0 hm0Var2 = bm0Var3.p0;
                bm0 bm0Var4 = hm0Var2.n;
                if (bm0Var4 != null && (fm0Var = bm0Var4.a) != null && (bm0Var = hm0Var2.h) != null) {
                    fm0Var.a(bm0Var.h);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
