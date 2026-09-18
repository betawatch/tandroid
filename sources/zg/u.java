package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kc0;
import yh.u3;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
                u3 u3Var = b0Var.c;
                if (u3Var.getParent() != null) {
                    if (b0Var.d) {
                        AndroidUtilities.removeFromParent(u3Var);
                    } else {
                        try {
                            b0Var.b.removeView(u3Var);
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
