package ph;

import org.telegram.ui.Components.ic;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y7 b;

    public /* synthetic */ q7(y7 y7Var, int i10) {
        this.a = i10;
        this.b = y7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e8 e8Var = this.b.T;
                ic.h(e8Var.container);
                super/*org.telegram.ui.ActionBar.g3*/.dismiss();
                break;
            case 1:
                y7 y7Var = this.b;
                y7Var.v.setLoading(false);
                e8 e8Var2 = y7Var.T;
                e8Var2.f1();
                e8Var2.b.D(0);
                break;
            case 2:
                this.b.R = false;
                break;
            case 3:
                e8 e8Var3 = this.b.T;
                e8Var3.J = 6;
                e8Var3.b.D(1);
                break;
            case 4:
                y7 y7Var2 = this.b;
                y7Var2.n.m(2);
                y7Var2.f.forceLayout();
                y7Var2.j();
                break;
            default:
                y7 y7Var3 = this.b;
                e8 e8Var4 = y7Var3.T;
                if (y7Var3.a != 0) {
                    e8Var4.onBackPressed();
                    break;
                } else {
                    e8Var4.dismiss();
                    break;
                }
        }
    }
}
