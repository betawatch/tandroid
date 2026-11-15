package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ro0 implements org.telegram.ui.Components.n20 {
    public final /* synthetic */ PhotoViewer a;

    public ro0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public final void a(int i7) {
        PhotoViewer photoViewer = this.a;
        photoViewer.P4 = -1;
        org.telegram.messenger.ic icVar = photoViewer.j5;
        if (icVar != null) {
            icVar.a();
            photoViewer.j5 = null;
        }
        photoViewer.l5 = true;
        photoViewer.z2(i7);
        photoViewer.l5 = false;
    }
}
