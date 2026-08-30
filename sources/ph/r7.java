package ph;

import org.telegram.ui.Components.ic;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z7 b;

    public /* synthetic */ r7(z7 z7Var, int i10) {
        this.a = i10;
        this.b = z7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f8 f8Var = this.b.T;
                ic.h(f8Var.container);
                super/*org.telegram.ui.ActionBar.g3*/.dismiss();
                break;
            case 1:
                z7 z7Var = this.b;
                z7Var.v.setLoading(false);
                f8 f8Var2 = z7Var.T;
                f8Var2.f1();
                f8Var2.b.D(0);
                break;
            case 2:
                this.b.R = false;
                break;
            case 3:
                f8 f8Var3 = this.b.T;
                f8Var3.J = 6;
                f8Var3.b.D(1);
                break;
            case 4:
                z7 z7Var2 = this.b;
                z7Var2.n.m(2);
                z7Var2.f.forceLayout();
                z7Var2.j();
                break;
            default:
                z7 z7Var3 = this.b;
                f8 f8Var4 = z7Var3.T;
                if (z7Var3.a != 0) {
                    f8Var4.onBackPressed();
                    break;
                } else {
                    f8Var4.dismiss();
                    break;
                }
        }
    }
}
