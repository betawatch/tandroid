package tg;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.w7;
import org.telegram.ui.Components.oz0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class v1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;

    public /* synthetic */ v1(f2 f2Var, int i7) {
        this.a = i7;
        this.b = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f2 f2Var = this.b;
                d2 d2Var = f2Var.a0;
                if (d2Var != null) {
                    if (d2Var.r != null) {
                        MediaController.B().i(f2Var.a0.r);
                        w7.G(f2Var.a).b(f2Var.a0.b, false);
                        f2Var.a0.getClass();
                    }
                    f2Var.a0.a();
                    f2Var.a0 = null;
                }
                f2Var.e0.a();
                f2Var.e0 = null;
                break;
            default:
                f2 f2Var2 = this.b;
                oz0 oz0Var = f2Var2.T;
                if (oz0Var != null) {
                    f2Var2.T = null;
                    f2Var2.removeView(oz0Var);
                    break;
                }
                break;
        }
    }
}
