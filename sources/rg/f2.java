package rg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.w01;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
                w01 w01Var = o2Var2.S;
                if (w01Var != null) {
                    o2Var2.S = null;
                    o2Var2.removeView(w01Var);
                    break;
                }
                break;
        }
    }
}
