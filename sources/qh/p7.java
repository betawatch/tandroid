package qh;

import org.telegram.ui.Components.ic;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x7 b;

    public /* synthetic */ p7(x7 x7Var, int i10) {
        this.a = i10;
        this.b = x7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d8 d8Var = this.b.T;
                ic.h(d8Var.container);
                super/*org.telegram.ui.ActionBar.h3*/.dismiss();
                break;
            case 1:
                x7 x7Var = this.b;
                x7Var.v.setLoading(false);
                d8 d8Var2 = x7Var.T;
                d8Var2.f1();
                d8Var2.b.D(0);
                break;
            case 2:
                this.b.R = false;
                break;
            case 3:
                d8 d8Var3 = this.b.T;
                d8Var3.J = 6;
                d8Var3.b.D(1);
                break;
            case 4:
                x7 x7Var2 = this.b;
                x7Var2.n.m(2);
                x7Var2.f.forceLayout();
                x7Var2.j();
                break;
            default:
                x7 x7Var3 = this.b;
                d8 d8Var4 = x7Var3.T;
                if (x7Var3.a != 0) {
                    d8Var4.onBackPressed();
                    break;
                } else {
                    d8Var4.dismiss();
                    break;
                }
        }
    }
}
