package yf;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.d01;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m2 b;

    public /* synthetic */ d2(m2 m2Var, int i9) {
        this.a = i9;
        this.b = m2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m2 m2Var = this.b;
                k2 k2Var = m2Var.S;
                if (k2Var != null) {
                    if (k2Var.r != null) {
                        MediaController.getInstance().cancelVideoConvert(m2Var.S.r);
                        FileLoader.getInstance(m2Var.a).cancelFileUpload(m2Var.S.b, false);
                        m2Var.S.getClass();
                    }
                    m2Var.S.a();
                    m2Var.S = null;
                }
                m2Var.W.a();
                m2Var.W = null;
                break;
            default:
                m2 m2Var2 = this.b;
                d01 d01Var = m2Var2.O;
                if (d01Var != null) {
                    m2Var2.O = null;
                    m2Var2.removeView(d01Var);
                    break;
                }
                break;
        }
    }
}
