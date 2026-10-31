package vh;

import org.telegram.messenger.q20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w4 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a5 b;

    public /* synthetic */ w4(a5 a5Var, int i10) {
        this.a = i10;
        this.b = a5Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                z4 z4Var = (z4) obj;
                a5 a5Var = this.b;
                a5Var.H = null;
                a5Var.E = z4Var;
                a5Var.D = z4Var != null;
                a5Var.a();
                a5Var.invalidate();
                y6 y6Var = a5Var.b;
                if (y6Var != null) {
                    y6Var.run();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj;
                z4 z4Var2 = this.b.E;
                if (z4Var2 != null || k2Var == null) {
                    z4Var2.c(k2Var);
                    break;
                }
        }
    }
}
