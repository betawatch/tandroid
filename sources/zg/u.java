package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ac0;
import yh.u3;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                u3 u3Var = c0Var.c;
                if (u3Var.getParent() != null) {
                    if (c0Var.d) {
                        AndroidUtilities.removeFromParent(u3Var);
                    } else {
                        try {
                            c0Var.b.removeView(u3Var);
                        } catch (Exception unused) {
                        }
                    }
                    ac0 ac0Var = c0Var.p;
                    if (ac0Var != null) {
                        ac0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
