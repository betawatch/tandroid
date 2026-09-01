package qh;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x5 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6 b;

    public /* synthetic */ x5(b6 b6Var, int i10) {
        this.a = i10;
        this.b = b6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                a6 a6Var = (a6) obj;
                b6 b6Var = this.b;
                b6Var.E = null;
                b6Var.B = a6Var;
                b6Var.y = a6Var != null;
                b6Var.a();
                b6Var.invalidate();
                g8 g8Var = b6Var.b;
                if (g8Var != null) {
                    g8Var.run();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                a6 a6Var2 = this.b.B;
                if (a6Var2 != null || p2Var == null) {
                    a6Var2.c(p2Var);
                    break;
                }
        }
    }
}
