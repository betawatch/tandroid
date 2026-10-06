package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lc0;
import yh.u3;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
