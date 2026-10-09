package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bd0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ u(a0 a0Var, int i10) {
        this.a = i10;
        this.b = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a.invalidate();
                break;
            default:
                a0 a0Var = this.b;
                xh.m mVar = a0Var.c;
                if (mVar.getParent() != null) {
                    if (a0Var.d) {
                        AndroidUtilities.removeFromParent(mVar);
                    } else {
                        try {
                            a0Var.b.removeView(mVar);
                        } catch (Exception unused) {
                        }
                    }
                    bd0 bd0Var = a0Var.p;
                    if (bd0Var != null) {
                        bd0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
