package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lc0;
import yh.u3;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;

    public /* synthetic */ s(z zVar, int i10) {
        this.a = i10;
        this.b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a.invalidate();
                break;
            default:
                z zVar = this.b;
                u3 u3Var = zVar.c;
                if (u3Var.getParent() != null) {
                    if (zVar.d) {
                        AndroidUtilities.removeFromParent(u3Var);
                    } else {
                        try {
                            zVar.b.removeView(u3Var);
                        } catch (Exception unused) {
                        }
                    }
                    lc0 lc0Var = zVar.p;
                    if (lc0Var != null) {
                        lc0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
