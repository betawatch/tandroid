package tg;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.w7;
import org.telegram.ui.Components.nz0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i2 b;

    public /* synthetic */ y1(i2 i2Var, int i7) {
        this.a = i7;
        this.b = i2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i2 i2Var = this.b;
                g2 g2Var = i2Var.a0;
                if (g2Var != null) {
                    if (g2Var.r != null) {
                        MediaController.B().i(i2Var.a0.r);
                        w7.G(i2Var.a).b(i2Var.a0.b, false);
                        i2Var.a0.getClass();
                    }
                    i2Var.a0.a();
                    i2Var.a0 = null;
                }
                i2Var.e0.a();
                i2Var.e0 = null;
                break;
            default:
                i2 i2Var2 = this.b;
                nz0 nz0Var = i2Var2.T;
                if (nz0Var != null) {
                    i2Var2.T = null;
                    i2Var2.removeView(nz0Var);
                    break;
                }
                break;
        }
    }
}
