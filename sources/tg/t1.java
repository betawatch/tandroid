package tg;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.w7;
import org.telegram.ui.Components.dz0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2 b;

    public /* synthetic */ t1(c2 c2Var, int i7) {
        this.a = i7;
        this.b = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c2 c2Var = this.b;
                a2 a2Var = c2Var.W;
                if (a2Var != null) {
                    if (a2Var.r != null) {
                        MediaController.B().i(c2Var.W.r);
                        w7.G(c2Var.a).b(c2Var.W.b, false);
                        c2Var.W.getClass();
                    }
                    c2Var.W.a();
                    c2Var.W = null;
                }
                c2Var.d0.a();
                c2Var.d0 = null;
                break;
            default:
                c2 c2Var2 = this.b;
                dz0 dz0Var = c2Var2.S;
                if (dz0Var != null) {
                    c2Var2.S = null;
                    c2Var2.removeView(dz0Var);
                    break;
                }
                break;
        }
    }
}
