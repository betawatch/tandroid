package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
