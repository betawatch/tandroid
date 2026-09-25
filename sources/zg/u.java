package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ic0;
import yh.t3;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ u(b0 b0Var, int i10) {
        this.a = i10;
        this.b = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a.invalidate();
                break;
            default:
                b0 b0Var = this.b;
                t3 t3Var = b0Var.c;
                if (t3Var.getParent() != null) {
                    if (b0Var.d) {
                        AndroidUtilities.removeFromParent(t3Var);
                    } else {
                        try {
                            b0Var.b.removeView(t3Var);
                        } catch (Exception unused) {
                        }
                    }
                    ic0 ic0Var = b0Var.p;
                    if (ic0Var != null) {
                        ic0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
