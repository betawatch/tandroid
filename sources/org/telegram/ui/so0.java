package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class so0 implements Runnable {
    public final /* synthetic */ PhotoViewer a;

    public so0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PhotoViewer photoViewer = this.a;
        org.telegram.messenger.ij ijVar = photoViewer.S4;
        if (ijVar == null) {
            return;
        }
        org.telegram.messenger.w7.G(ijVar.I1).b0(photoViewer.S4.F0(), true, false);
    }
}
