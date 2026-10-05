package qg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.w11;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n2 b;

    public /* synthetic */ d2(n2 n2Var, int i10) {
        this.a = i10;
        this.b = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n2 n2Var = this.b;
                l2 l2Var = n2Var.W;
                if (l2Var != null) {
                    if (l2Var.r != null) {
                        MediaController.getInstance().cancelVideoConvert(n2Var.W.r);
                        FileLoader.getInstance(n2Var.a).cancelFileUpload(n2Var.W.b, false);
                        n2Var.W.getClass();
                    }
                    n2Var.W.a();
                    n2Var.W = null;
                }
                n2Var.d0.a();
                n2Var.d0 = null;
                break;
            default:
                n2 n2Var2 = this.b;
                w11 w11Var = n2Var2.S;
                if (w11Var != null) {
                    n2Var2.S = null;
                    n2Var2.removeView(w11Var);
                    break;
                }
                break;
        }
    }
}
