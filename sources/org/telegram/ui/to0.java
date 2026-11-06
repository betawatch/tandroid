package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class to0 implements org.telegram.ui.Components.k20 {
    public final /* synthetic */ PhotoViewer a;

    public to0(PhotoViewer photoViewer) {
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
