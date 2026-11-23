package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class to0 implements Runnable {
    public final /* synthetic */ PhotoViewer a;

    public to0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PhotoViewer photoViewer = this.a;
        org.telegram.messenger.gj gjVar = photoViewer.T4;
        if (gjVar == null) {
            return;
        }
        org.telegram.messenger.w7.G(gjVar.K1).b0(photoViewer.T4.F0(), true, false);
    }
}
