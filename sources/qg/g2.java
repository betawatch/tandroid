package qg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.w01;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class g2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p2 b;

    public /* synthetic */ g2(p2 p2Var, int i10) {
        this.a = i10;
        this.b = p2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p2 p2Var = this.b;
                n2 n2Var = p2Var.W;
                if (n2Var != null) {
                    if (n2Var.r != null) {
                        MediaController.getInstance().cancelVideoConvert(p2Var.W.r);
                        FileLoader.getInstance(p2Var.a).cancelFileUpload(p2Var.W.b, false);
                        p2Var.W.getClass();
                    }
                    p2Var.W.a();
                    p2Var.W = null;
                }
                p2Var.d0.a();
                p2Var.d0 = null;
                break;
            default:
                p2 p2Var2 = this.b;
                w01 w01Var = p2Var2.S;
                if (w01Var != null) {
                    p2Var2.S = null;
                    p2Var2.removeView(w01Var);
                    break;
                }
                break;
        }
    }
}
