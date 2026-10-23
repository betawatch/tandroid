package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xo0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ yo0 b;

    public /* synthetic */ xo0(yo0 yo0Var, int i10) {
        this.a = i10;
        this.b = yo0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        jp0 jp0Var;
        fp0 fp0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                yo0 yo0Var = this.b;
                fp0 fp0Var2 = yo0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) fp0Var2.M.get(num);
                fp0Var2.K = starGift;
                lp0 lp0Var = fp0Var2.p0;
                if (starGift == null) {
                    yh.s3 s3Var = fp0Var2.J;
                    if (s3Var != null) {
                        s3Var.f();
                        fp0Var2.J = null;
                    }
                } else {
                    yh.s3 s3Var2 = fp0Var2.J;
                    if (s3Var2 == null || s3Var2.b != starGift.id) {
                        i10 = ((org.telegram.ui.ActionBar.o2) lp0Var).currentAccount;
                        yh.s3 s3Var3 = new yh.s3(fp0Var2.K.id, i10, new xo0(yo0Var, 2));
                        fp0Var2.J = s3Var3;
                        s3Var3.g(false);
                    }
                }
                fp0.a(fp0Var2);
                (lp0Var.I.getCurrentPosition() == 1 ? lp0Var.n : lp0Var.h).e();
                break;
            case 1:
                fp0 fp0Var3 = this.b.e;
                fp0Var3.h = ((Integer) obj).intValue();
                fp0Var3.r = null;
                fp0Var3.s = null;
                fp0Var3.I = null;
                fp0Var3.j(true);
                fp0Var3.i();
                fp0Var3.f(true);
                ep0 ep0Var = fp0Var3.y;
                if (ep0Var != null) {
                    ep0Var.invalidate();
                }
                lp0 lp0Var2 = fp0Var3.p0;
                fp0 fp0Var4 = lp0Var2.n;
                if (fp0Var4 != null && (jp0Var = fp0Var4.a) != null && (fp0Var = lp0Var2.h) != null) {
                    jp0Var.a(fp0Var.h);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
