package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
        gp0 gp0Var;
        cp0 cp0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                vo0 vo0Var = this.b;
                cp0 cp0Var2 = vo0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) cp0Var2.M.get(num);
                cp0Var2.K = starGift;
                ip0 ip0Var = cp0Var2.p0;
                if (starGift == null) {
                    yh.s3 s3Var = cp0Var2.J;
                    if (s3Var != null) {
                        s3Var.f();
                        cp0Var2.J = null;
                    }
                } else {
                    yh.s3 s3Var2 = cp0Var2.J;
                    if (s3Var2 == null || s3Var2.b != starGift.id) {
                        i10 = ((org.telegram.ui.ActionBar.n2) ip0Var).currentAccount;
                        yh.s3 s3Var3 = new yh.s3(cp0Var2.K.id, i10, new uo0(vo0Var, 2));
                        cp0Var2.J = s3Var3;
                        s3Var3.g(false);
                    }
                }
                cp0.a(cp0Var2);
                (ip0Var.I.getCurrentPosition() == 1 ? ip0Var.n : ip0Var.h).e();
                break;
            case 1:
                cp0 cp0Var3 = this.b.e;
                cp0Var3.h = ((Integer) obj).intValue();
                cp0Var3.r = null;
                cp0Var3.s = null;
                cp0Var3.I = null;
                cp0Var3.j(true);
                cp0Var3.i();
                cp0Var3.f(true);
                bp0 bp0Var = cp0Var3.y;
                if (bp0Var != null) {
                    bp0Var.invalidate();
                }
                ip0 ip0Var2 = cp0Var3.p0;
                cp0 cp0Var4 = ip0Var2.n;
                if (cp0Var4 != null && (gp0Var = cp0Var4.a) != null && (cp0Var = ip0Var2.h) != null) {
                    gp0Var.a(cp0Var.h);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
