package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ul0 implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vl0 b;

    public /* synthetic */ ul0(vl0 vl0Var, int i7) {
        this.a = i7;
        this.b = vl0Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        int i7;
        gm0 gm0Var;
        cm0 cm0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                vl0 vl0Var = this.b;
                cm0 cm0Var2 = vl0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) cm0Var2.N.get(num);
                cm0Var2.L = starGift;
                im0 im0Var = cm0Var2.q0;
                if (starGift == null) {
                    bi.o5 o5Var = cm0Var2.K;
                    if (o5Var != null) {
                        o5Var.f();
                        cm0Var2.K = null;
                    }
                } else {
                    bi.o5 o5Var2 = cm0Var2.K;
                    if (o5Var2 == null || o5Var2.b != starGift.id) {
                        i7 = ((org.telegram.ui.ActionBar.e2) im0Var).currentAccount;
                        bi.o5 o5Var3 = new bi.o5(i7, cm0Var2.L.id, new ul0(vl0Var, 2));
                        cm0Var2.K = o5Var3;
                        o5Var3.g(false);
                    }
                }
                cm0.a(cm0Var2);
                (im0Var.J.getCurrentPosition() == 1 ? im0Var.n : im0Var.h).e();
                break;
            case 1:
                cm0 cm0Var3 = this.b.e;
                cm0Var3.h = ((Integer) obj).intValue();
                cm0Var3.r = null;
                cm0Var3.s = null;
                cm0Var3.J = null;
                cm0Var3.j(true);
                cm0Var3.i();
                cm0Var3.f(true);
                bm0 bm0Var = cm0Var3.E;
                if (bm0Var != null) {
                    bm0Var.invalidate();
                }
                im0 im0Var2 = cm0Var3.q0;
                cm0 cm0Var4 = im0Var2.n;
                if (cm0Var4 != null && (gm0Var = cm0Var4.a) != null && (cm0Var = im0Var2.h) != null) {
                    gm0Var.a(cm0Var.h);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
