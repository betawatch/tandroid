// default package

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tn6 implements Runnable {
    public final /* synthetic */ MediaController a;

    public tn6(MediaController mediaController) {
        this.a = mediaController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaController mediaController = this.a;
        k47 k47Var = mediaController.v0;
        if (k47Var == null) {
            return;
        }
        bc4.G(k47Var.K1).b0(mediaController.v0.F0(), true, false);
    }
}
