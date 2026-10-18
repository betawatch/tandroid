package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        ip0 ip0Var;
        ep0 ep0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                xo0 xo0Var = this.b;
                ep0 ep0Var2 = xo0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) ep0Var2.M.get(num);
                ep0Var2.K = starGift;
                kp0 kp0Var = ep0Var2.p0;
                if (starGift == null) {
                    yh.t3 t3Var = ep0Var2.J;
                    if (t3Var != null) {
                        t3Var.f();
                        ep0Var2.J = null;
                    }
                } else {
                    yh.t3 t3Var2 = ep0Var2.J;
                    if (t3Var2 == null || t3Var2.b != starGift.id) {
                        i10 = ((org.telegram.ui.ActionBar.n2) kp0Var).currentAccount;
                        yh.t3 t3Var3 = new yh.t3(ep0Var2.K.id, i10, new wo0(xo0Var, 2));
                        ep0Var2.J = t3Var3;
                        t3Var3.g(false);
                    }
                }
                ep0.a(ep0Var2);
                (kp0Var.I.getCurrentPosition() == 1 ? kp0Var.n : kp0Var.h).e();
                break;
            case 1:
                ep0 ep0Var3 = this.b.e;
                ep0Var3.h = ((Integer) obj).intValue();
                ep0Var3.r = null;
                ep0Var3.s = null;
                ep0Var3.I = null;
                ep0Var3.j(true);
                ep0Var3.i();
                ep0Var3.f(true);
                dp0 dp0Var = ep0Var3.y;
                if (dp0Var != null) {
                    dp0Var.invalidate();
                }
                kp0 kp0Var2 = ep0Var3.p0;
                ep0 ep0Var4 = kp0Var2.n;
                if (ep0Var4 != null && (ip0Var = ep0Var4.a) != null && (ep0Var = kp0Var2.h) != null) {
                    ip0Var.a(ep0Var.h);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
