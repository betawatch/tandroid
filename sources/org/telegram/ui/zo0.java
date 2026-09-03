package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zo0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap0 b;

    public /* synthetic */ zo0(ap0 ap0Var, int i10) {
        this.a = i10;
        this.b = ap0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        lp0 lp0Var;
        hp0 hp0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                ap0 ap0Var = this.b;
                hp0 hp0Var2 = ap0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) hp0Var2.J.get(num);
                hp0Var2.H = starGift;
                np0 np0Var = hp0Var2.m0;
                if (starGift == null) {
                    lh.b5 b5Var = hp0Var2.G;
                    if (b5Var != null) {
                        b5Var.f();
                        hp0Var2.G = null;
                    }
                } else {
                    lh.b5 b5Var2 = hp0Var2.G;
                    if (b5Var2 == null || b5Var2.b != starGift.id) {
                        i10 = ((org.telegram.ui.ActionBar.p2) np0Var).currentAccount;
                        lh.b5 b5Var3 = new lh.b5(hp0Var2.H.id, i10, new zo0(ap0Var, 2));
                        hp0Var2.G = b5Var3;
                        b5Var3.g(false);
                    }
                }
                hp0.a(hp0Var2);
                (np0Var.F.getCurrentPosition() == 1 ? np0Var.n : np0Var.h).e();
                break;
            case 1:
                hp0 hp0Var3 = this.b.e;
                hp0Var3.h = ((Integer) obj).intValue();
                hp0Var3.r = null;
                hp0Var3.s = null;
                hp0Var3.F = null;
                hp0Var3.j(true);
                hp0Var3.i();
                hp0Var3.f(true);
                gp0 gp0Var = hp0Var3.y;
                if (gp0Var != null) {
                    gp0Var.invalidate();
                }
                np0 np0Var2 = hp0Var3.m0;
                hp0 hp0Var4 = np0Var2.n;
                if (hp0Var4 != null && (lp0Var = hp0Var4.a) != null && (hp0Var = np0Var2.h) != null) {
                    lp0Var.a(hp0Var.h);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
