package vh;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e8 b;

    public /* synthetic */ l(e8 e8Var, int i10) {
        this.a = i10;
        this.b = e8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n();
                break;
            case 1:
                e8 e8Var = this.b;
                e8Var.J0 = false;
                e8Var.K0 = TLObject.FLAG_31;
                e8Var.invalidate();
                e8Var.R0.setVisibility(0);
                e8Var.S0.setVisibility(0);
                break;
            default:
                o8 o8Var = this.b.R1;
                d8 d8Var = o8Var.X0;
                if (d8Var != null) {
                    d8Var.O = false;
                    d8Var.c();
                    d8 d8Var2 = o8Var.X0;
                    d8Var2.m(0L);
                    z8 z8Var = d8Var2.F;
                    if (z8Var != null) {
                        z8Var.setProgress(0L);
                        break;
                    }
                }
                break;
        }
    }
}
