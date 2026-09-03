package ph;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y5 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;

    public /* synthetic */ y5(c6 c6Var, int i10) {
        this.a = i10;
        this.b = c6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                b6 b6Var = (b6) obj;
                c6 c6Var = this.b;
                c6Var.E = null;
                c6Var.B = b6Var;
                c6Var.y = b6Var != null;
                c6Var.a();
                c6Var.invalidate();
                g8 g8Var = c6Var.b;
                if (g8Var != null) {
                    g8Var.run();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                b6 b6Var2 = this.b.B;
                if (b6Var2 != null || p2Var == null) {
                    b6Var2.c(p2Var);
                    break;
                }
        }
    }
}
