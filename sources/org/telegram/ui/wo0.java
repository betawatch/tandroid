package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wo0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ xo0 b;

    public /* synthetic */ wo0(xo0 xo0Var, int i10) {
        this.a = i10;
        this.b = xo0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        hp0 hp0Var;
        dp0 dp0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                xo0 xo0Var = this.b;
                dp0 dp0Var2 = xo0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) dp0Var2.E.get(num);
                dp0Var2.C = starGift;
                ip0 ip0Var = dp0Var2.g0;
                if (starGift == null) {
                    lh.b5 b5Var = dp0Var2.B;
                    if (b5Var != null) {
                        b5Var.f();
                        dp0Var2.B = null;
                    }
                } else {
                    lh.b5 b5Var2 = dp0Var2.B;
                    if (b5Var2 == null || b5Var2.b != starGift.id) {
                        i10 = ((org.telegram.ui.ActionBar.p2) ip0Var).currentAccount;
                        lh.b5 b5Var3 = new lh.b5(dp0Var2.C.id, i10, new wo0(xo0Var, 2));
                        dp0Var2.B = b5Var3;
                        b5Var3.g(false);
                    }
                }
                dp0Var2.e();
                (ip0Var.y.getCurrentPosition() == 1 ? ip0Var.h : ip0Var.f).e();
                break;
            case 1:
                dp0 dp0Var3 = this.b.e;
                dp0Var3.n = ((Integer) obj).intValue();
                dp0Var3.s = null;
                dp0Var3.v = null;
                dp0Var3.y = null;
                dp0Var3.i(true);
                dp0Var3.h();
                dp0Var3.f();
                cp0 cp0Var = dp0Var3.x;
                if (cp0Var != null) {
                    cp0Var.invalidate();
                }
                ip0 ip0Var2 = dp0Var3.g0;
                dp0 dp0Var4 = ip0Var2.h;
                if (dp0Var4 != null && (hp0Var = dp0Var4.a) != null && (dp0Var = ip0Var2.f) != null) {
                    hp0Var.a(dp0Var.n);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
