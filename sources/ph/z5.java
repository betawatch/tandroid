package ph;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z5 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ d6 b;

    public /* synthetic */ z5(d6 d6Var, int i10) {
        this.a = i10;
        this.b = d6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                c6 c6Var = (c6) obj;
                d6 d6Var = this.b;
                d6Var.E = null;
                d6Var.B = c6Var;
                d6Var.y = c6Var != null;
                d6Var.a();
                d6Var.invalidate();
                h8 h8Var = d6Var.b;
                if (h8Var != null) {
                    h8Var.run();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                c6 c6Var2 = this.b.B;
                if (c6Var2 != null || p2Var == null) {
                    c6Var2.c(p2Var);
                    break;
                }
        }
    }
}
