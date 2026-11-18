package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
