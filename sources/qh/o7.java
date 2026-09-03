package qh;

import org.telegram.ui.Components.ic;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w7 b;

    public /* synthetic */ o7(w7 w7Var, int i10) {
        this.a = i10;
        this.b = w7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c8 c8Var = this.b.T;
                ic.h(c8Var.container);
                super/*org.telegram.ui.ActionBar.h3*/.dismiss();
                break;
            case 1:
                w7 w7Var = this.b;
                w7Var.v.setLoading(false);
                c8 c8Var2 = w7Var.T;
                c8Var2.f1();
                c8Var2.b.D(0);
                break;
            case 2:
                this.b.R = false;
                break;
            case 3:
                c8 c8Var3 = this.b.T;
                c8Var3.J = 6;
                c8Var3.b.D(1);
                break;
            case 4:
                w7 w7Var2 = this.b;
                w7Var2.n.m(2);
                w7Var2.f.forceLayout();
                w7Var2.j();
                break;
            default:
                w7 w7Var3 = this.b;
                c8 c8Var4 = w7Var3.T;
                if (w7Var3.a != 0) {
                    c8Var4.onBackPressed();
                    break;
                } else {
                    c8Var4.dismiss();
                    break;
                }
        }
    }
}
