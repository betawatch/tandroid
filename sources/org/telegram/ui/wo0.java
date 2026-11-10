package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class wo0 implements org.telegram.ui.Components.k20 {
    public final /* synthetic */ PhotoViewer a;

    public wo0(PhotoViewer photoViewer) {
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
