package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kc0;
import yh.t3;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
                    kc0 kc0Var = b0Var.p;
                    if (kc0Var != null) {
                        kc0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
