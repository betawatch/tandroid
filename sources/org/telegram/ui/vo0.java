package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vo0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ wo0 b;

    public /* synthetic */ vo0(wo0 wo0Var, int i10) {
        this.a = i10;
        this.b = wo0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        hp0 hp0Var;
        dp0 dp0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                wo0 wo0Var = this.b;
                dp0 dp0Var2 = wo0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) dp0Var2.M.get(num);
                dp0Var2.K = starGift;
                jp0 jp0Var = dp0Var2.p0;
                if (starGift == null) {
                    yh.t3 t3Var = dp0Var2.J;
                    if (t3Var != null) {
                        t3Var.f();
                        dp0Var2.J = null;
                    }
                } else {
                    yh.t3 t3Var2 = dp0Var2.J;
                    if (t3Var2 == null || t3Var2.b != starGift.id) {
                        i10 = ((org.telegram.ui.ActionBar.n2) jp0Var).currentAccount;
                        yh.t3 t3Var3 = new yh.t3(dp0Var2.K.id, i10, new vo0(wo0Var, 2));
                        dp0Var2.J = t3Var3;
                        t3Var3.g(false);
                    }
                }
                dp0.a(dp0Var2);
                (jp0Var.I.getCurrentPosition() == 1 ? jp0Var.n : jp0Var.h).e();
                break;
            case 1:
                dp0 dp0Var3 = this.b.e;
                dp0Var3.h = ((Integer) obj).intValue();
                dp0Var3.r = null;
                dp0Var3.s = null;
                dp0Var3.I = null;
                dp0Var3.j(true);
                dp0Var3.i();
                dp0Var3.f(true);
                cp0 cp0Var = dp0Var3.y;
                if (cp0Var != null) {
                    cp0Var.invalidate();
                }
                jp0 jp0Var2 = dp0Var3.p0;
                dp0 dp0Var4 = jp0Var2.n;
                if (dp0Var4 != null && (hp0Var = dp0Var4.a) != null && (dp0Var = jp0Var2.h) != null) {
                    hp0Var.a(dp0Var.h);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
