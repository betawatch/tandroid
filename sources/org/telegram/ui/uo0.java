package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class uo0 implements org.telegram.ui.Components.y20 {
    public final /* synthetic */ PhotoViewer a;

    public uo0(PhotoViewer photoViewer) {
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
