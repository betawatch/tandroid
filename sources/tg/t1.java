package tg;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.w7;
import org.telegram.ui.Components.mz0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e2 b;

    public /* synthetic */ t1(e2 e2Var, int i7) {
        this.a = i7;
        this.b = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e2 e2Var = this.b;
                c2 c2Var = e2Var.a0;
                if (c2Var != null) {
                    if (c2Var.r != null) {
                        MediaController.B().i(e2Var.a0.r);
                        w7.G(e2Var.a).b(e2Var.a0.b, false);
                        e2Var.a0.getClass();
                    }
                    e2Var.a0.a();
                    e2Var.a0 = null;
                }
                e2Var.e0.a();
                e2Var.e0 = null;
                break;
            default:
                e2 e2Var2 = this.b;
                mz0 mz0Var = e2Var2.T;
                if (mz0Var != null) {
                    e2Var2.T = null;
                    e2Var2.removeView(mz0Var);
                    break;
                }
                break;
        }
    }
}
