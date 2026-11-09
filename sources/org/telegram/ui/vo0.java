package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class vo0 implements org.telegram.ui.Components.l20 {
    public final /* synthetic */ PhotoViewer a;

    public vo0(PhotoViewer photoViewer) {
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
