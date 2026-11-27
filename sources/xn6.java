// default package

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
