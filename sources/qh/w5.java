package qh;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w5 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ a6 b;

    public /* synthetic */ w5(a6 a6Var, int i10) {
        this.a = i10;
        this.b = a6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                z5 z5Var = (z5) obj;
                a6 a6Var = this.b;
                a6Var.E = null;
                a6Var.B = z5Var;
                a6Var.y = z5Var != null;
                a6Var.a();
                a6Var.invalidate();
                f8 f8Var = a6Var.b;
                if (f8Var != null) {
                    f8Var.run();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                z5 z5Var2 = this.b.B;
                if (z5Var2 != null || p2Var == null) {
                    z5Var2.c(p2Var);
                    break;
                }
        }
    }
}
