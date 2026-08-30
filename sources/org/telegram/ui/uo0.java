package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uo0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ vo0 b;

    public /* synthetic */ uo0(vo0 vo0Var, int i10) {
        this.a = i10;
        this.b = vo0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        fp0 fp0Var;
        bp0 bp0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                vo0 vo0Var = this.b;
                bp0 bp0Var2 = vo0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) bp0Var2.E.get(num);
                bp0Var2.C = starGift;
                gp0 gp0Var = bp0Var2.g0;
                if (starGift == null) {
                    kh.b5 b5Var = bp0Var2.B;
                    if (b5Var != null) {
                        b5Var.f();
                        bp0Var2.B = null;
                    }
                } else {
                    kh.b5 b5Var2 = bp0Var2.B;
                    if (b5Var2 == null || b5Var2.b != starGift.id) {
                        i10 = ((org.telegram.ui.ActionBar.p2) gp0Var).currentAccount;
                        kh.b5 b5Var3 = new kh.b5(bp0Var2.C.id, i10, new uo0(vo0Var, 2));
                        bp0Var2.B = b5Var3;
                        b5Var3.g(false);
                    }
                }
                bp0Var2.e();
                (gp0Var.y.getCurrentPosition() == 1 ? gp0Var.h : gp0Var.f).e();
                break;
            case 1:
                bp0 bp0Var3 = this.b.e;
                bp0Var3.n = ((Integer) obj).intValue();
                bp0Var3.s = null;
                bp0Var3.v = null;
                bp0Var3.y = null;
                bp0Var3.i(true);
                bp0Var3.h();
                bp0Var3.f();
                ap0 ap0Var = bp0Var3.x;
                if (ap0Var != null) {
                    ap0Var.invalidate();
                }
                gp0 gp0Var2 = bp0Var3.g0;
                bp0 bp0Var4 = gp0Var2.h;
                if (bp0Var4 != null && (fp0Var = bp0Var4.a) != null && (bp0Var = gp0Var2.f) != null) {
                    fp0Var.a(bp0Var.n);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
