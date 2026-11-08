package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
