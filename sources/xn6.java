// default package

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
