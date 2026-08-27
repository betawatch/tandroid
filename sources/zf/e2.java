package zf;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.f01;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n2 b;

    public /* synthetic */ e2(n2 n2Var, int i10) {
        this.a = i10;
        this.b = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n2 n2Var = this.b;
                l2 l2Var = n2Var.S;
                if (l2Var != null) {
                    if (l2Var.r != null) {
                        MediaController.getInstance().cancelVideoConvert(n2Var.S.r);
                        FileLoader.getInstance(n2Var.a).cancelFileUpload(n2Var.S.b, false);
                        n2Var.S.getClass();
                    }
                    n2Var.S.a();
                    n2Var.S = null;
                }
                n2Var.W.a();
                n2Var.W = null;
                break;
            default:
                n2 n2Var2 = this.b;
                f01 f01Var = n2Var2.O;
                if (f01Var != null) {
                    n2Var2.O = null;
                    n2Var2.removeView(f01Var);
                    break;
                }
                break;
        }
    }
}
