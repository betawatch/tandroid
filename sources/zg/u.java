package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ic0;
import yh.t3;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
