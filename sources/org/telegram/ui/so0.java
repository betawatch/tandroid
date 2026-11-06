package org.telegram.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class so0 implements org.telegram.ui.Components.k20 {
    public final /* synthetic */ PhotoViewer a;

    public so0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public final void a(int i7) {
        PhotoViewer photoViewer = this.a;
        photoViewer.O4 = -1;
        org.telegram.messenger.jc jcVar = photoViewer.i5;
        if (jcVar != null) {
            jcVar.a();
            photoViewer.i5 = null;
        }
        photoViewer.k5 = true;
        photoViewer.y2(i7);
        photoViewer.k5 = false;
    }
}
