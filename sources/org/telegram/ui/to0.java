package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
