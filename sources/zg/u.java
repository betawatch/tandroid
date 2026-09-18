package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bc0;
import yh.w3;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                w3 w3Var = c0Var.c;
                if (w3Var.getParent() != null) {
                    if (c0Var.d) {
                        AndroidUtilities.removeFromParent(w3Var);
                    } else {
                        try {
                            c0Var.b.removeView(w3Var);
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
