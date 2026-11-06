package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
