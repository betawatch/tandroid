package ug;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.w7;
import org.telegram.ui.Components.cz0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2 b;

    public /* synthetic */ t1(c2 c2Var, int i3) {
        this.a = i3;
        this.b = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c2 c2Var = this.b;
                a2 a2Var = c2Var.a0;
                if (a2Var != null) {
                    if (a2Var.r != null) {
                        MediaController.B().i(c2Var.a0.r);
                        w7.G(c2Var.a).b(c2Var.a0.b, false);
                        c2Var.a0.getClass();
                    }
                    c2Var.a0.a();
                    c2Var.a0 = null;
                }
                c2Var.e0.a();
                c2Var.e0 = null;
                break;
            default:
                c2 c2Var2 = this.b;
                cz0 cz0Var = c2Var2.T;
                if (cz0Var != null) {
                    c2Var2.T = null;
                    c2Var2.removeView(cz0Var);
                    break;
                }
                break;
        }
    }
}
