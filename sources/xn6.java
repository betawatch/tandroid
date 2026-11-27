// default package

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class xn6 implements Runnable {
    public final /* synthetic */ MediaController a;

    public xn6(MediaController mediaController) {
        this.a = mediaController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaController mediaController = this.a;
        r47 r47Var = mediaController.v0;
        if (r47Var == null) {
            return;
        }
        xb4.G(r47Var.K1).b0(mediaController.v0.F0(), true, false);
    }
}
