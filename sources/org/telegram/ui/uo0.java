package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
