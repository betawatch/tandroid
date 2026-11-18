package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class to0 implements Runnable {
    public final /* synthetic */ PhotoViewer a;

    public to0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PhotoViewer photoViewer = this.a;
        org.telegram.messenger.fj fjVar = photoViewer.T4;
        if (fjVar == null) {
            return;
        }
        org.telegram.messenger.w7.G(fjVar.K1).b0(photoViewer.T4.F0(), true, false);
    }
}
