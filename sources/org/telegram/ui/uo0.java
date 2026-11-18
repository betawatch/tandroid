package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class uo0 implements org.telegram.ui.Components.v20 {
    public final /* synthetic */ PhotoViewer a;

    public uo0(PhotoViewer photoViewer) {
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
        photoViewer.z2(i7);
        photoViewer.l5 = false;
    }
}
