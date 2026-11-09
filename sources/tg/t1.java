package tg;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.w7;
import org.telegram.ui.Components.ez0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                ez0 ez0Var = c2Var2.S;
                if (ez0Var != null) {
                    c2Var2.S = null;
                    c2Var2.removeView(ez0Var);
                    break;
                }
                break;
        }
    }
}
