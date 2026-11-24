// default package

import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class wp1 extends bl0 {
    public final /* synthetic */ byte s;
    public final /* synthetic */ mu1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wp1(mu1 mu1Var, wjb wjbVar, int i, byte b) {
        super(i, wjbVar);
        this.s = b;
        this.w = mu1Var;
    }

    @Override // bl0, al0
    public final int t1() {
        int i;
        int i2;
        byte b = this.s;
        mu1 mu1Var = this.w;
        switch (b) {
            case 0:
                i = ((d) mu1Var).currentAccount;
                if (!nod.d(i, mu1Var.Ba)) {
                    return bm2.o(mu1Var.getThemedColor(bkb.Ie), kk7.d4);
                }
                ku1 ku1Var = mu1Var.Ba;
                if (ku1Var == null || ku1Var.a()) {
                    a();
                    return this.d;
                }
                a();
                return bm2.o(this.d, kk7.s3);
            case 1:
                return mu1Var.x.t1();
            default:
                i2 = ((d) mu1Var).currentAccount;
                if (!nod.d(i2, mu1Var.Ba)) {
                    return bm2.o(mu1Var.getThemedColor(bkb.c6), kk7.d4);
                }
                ku1 ku1Var2 = mu1Var.Ba;
                if (ku1Var2 == null || ku1Var2.a()) {
                    a();
                    return this.d;
                }
                a();
                return bm2.o(this.d, kk7.s3);
        }
    }
}
