package rg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.y11;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o2 b;

    public /* synthetic */ f2(o2 o2Var, int i10) {
        this.a = i10;
        this.b = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o2 o2Var = this.b;
                m2 m2Var = o2Var.W;
                if (m2Var != null) {
                    if (m2Var.r != null) {
                        MediaController.getInstance().cancelVideoConvert(o2Var.W.r);
                        FileLoader.getInstance(o2Var.a).cancelFileUpload(o2Var.W.b, false);
                        o2Var.W.getClass();
                    }
                    o2Var.W.a();
                    o2Var.W = null;
                }
                o2Var.d0.a();
                o2Var.d0 = null;
                break;
            default:
                o2 o2Var2 = this.b;
                y11 y11Var = o2Var2.S;
                if (y11Var != null) {
                    o2Var2.S = null;
                    o2Var2.removeView(y11Var);
                    break;
                }
                break;
        }
    }
}
