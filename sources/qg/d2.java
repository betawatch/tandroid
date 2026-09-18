package qg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.m11;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m2 b;

    public /* synthetic */ d2(m2 m2Var, int i10) {
        this.a = i10;
        this.b = m2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m2 m2Var = this.b;
                k2 k2Var = m2Var.W;
                if (k2Var != null) {
                    if (k2Var.r != null) {
                        MediaController.getInstance().cancelVideoConvert(m2Var.W.r);
                        FileLoader.getInstance(m2Var.a).cancelFileUpload(m2Var.W.b, false);
                        m2Var.W.getClass();
                    }
                    m2Var.W.a();
                    m2Var.W = null;
                }
                m2Var.d0.a();
                m2Var.d0 = null;
                break;
            default:
                m2 m2Var2 = this.b;
                m11 m11Var = m2Var2.S;
                if (m11Var != null) {
                    m2Var2.S = null;
                    m2Var2.removeView(m11Var);
                    break;
                }
                break;
        }
    }
}
