package sg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.g21;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p2 b;

    public /* synthetic */ f2(p2 p2Var, int i10) {
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
                g21 g21Var = p2Var2.S;
                if (g21Var != null) {
                    p2Var2.S = null;
                    p2Var2.removeView(g21Var);
                    break;
                }
                break;
        }
    }
}
