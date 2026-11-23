package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class to0 implements org.telegram.ui.Components.v20 {
    public final /* synthetic */ PhotoViewer a;

    public to0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public final void a(int i7) {
        PhotoViewer photoViewer = this.a;
        photoViewer.P4 = -1;
        org.telegram.messenger.hc hcVar = photoViewer.j5;
        if (hcVar != null) {
            hcVar.a();
            photoViewer.j5 = null;
        }
        photoViewer.l5 = true;
        photoViewer.A2(i7);
        photoViewer.l5 = false;
    }
}
