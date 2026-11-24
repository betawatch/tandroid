// default package

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class t98 implements Runnable {
    public final /* synthetic */ PhotoViewer a;

    public t98(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PhotoViewer photoViewer = this.a;
        k47 k47Var = photoViewer.S4;
        if (k47Var == null) {
            return;
        }
        bc4.G(k47Var.K1).b0(photoViewer.S4.F0(), true, false);
    }
}
