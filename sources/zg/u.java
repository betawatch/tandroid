package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bc0;
import yh.v3;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c0 b;

    public /* synthetic */ u(c0 c0Var, int i10) {
        this.a = i10;
        this.b = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a.invalidate();
                break;
            default:
                c0 c0Var = this.b;
                v3 v3Var = c0Var.c;
                if (v3Var.getParent() != null) {
                    if (c0Var.d) {
                        AndroidUtilities.removeFromParent(v3Var);
                    } else {
                        try {
                            c0Var.b.removeView(v3Var);
                        } catch (Exception unused) {
                        }
                    }
                    bc0 bc0Var = c0Var.p;
                    if (bc0Var != null) {
                        bc0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
