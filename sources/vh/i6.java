package vh;

import org.telegram.ui.Components.wb;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class i6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r6 b;

    public /* synthetic */ i6(r6 r6Var, int i10) {
        this.a = i10;
        this.b = r6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w6 w6Var = this.b.W;
                wb.h(w6Var.c);
                super/*org.telegram.ui.ActionBar.z2*/.dismiss();
                break;
            case 1:
                r6 r6Var = this.b;
                r6Var.w.setLoading(false);
                w6 w6Var2 = r6Var.W;
                w6Var2.M0();
                w6Var2.i1.E(0);
                break;
            case 2:
                this.b.U = false;
                break;
            case 3:
                w6 w6Var3 = this.b.W;
                w6Var3.D1 = 6;
                w6Var3.i1.E(1);
                break;
            case 4:
                r6 r6Var2 = this.b;
                r6Var2.n.g(2);
                r6Var2.f.forceLayout();
                r6Var2.k();
                break;
            default:
                r6 r6Var3 = this.b;
                w6 w6Var4 = r6Var3.W;
                if (r6Var3.a != 0) {
                    w6Var4.onBackPressed();
                    break;
                } else {
                    w6Var4.dismiss();
                    break;
                }
        }
    }
}
