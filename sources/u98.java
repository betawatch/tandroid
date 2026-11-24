// default package

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class u98 implements sd5 {
    public final /* synthetic */ PhotoViewer a;

    public u98(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public final void a(int i) {
        PhotoViewer photoViewer = this.a;
        photoViewer.O4 = -1;
        jn5 jn5Var = photoViewer.i5;
        if (jn5Var != null) {
            jn5Var.a();
            photoViewer.i5 = null;
        }
        photoViewer.k5 = true;
        photoViewer.K1(i);
        photoViewer.k5 = false;
    }
}
