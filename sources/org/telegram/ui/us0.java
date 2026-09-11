package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class us0 implements org.telegram.ui.Components.u30 {
    public final /* synthetic */ PhotoViewer a;

    public us0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.j5 = null;
        }
        photoViewer.l5 = true;
        photoViewer.B2(i10);
        photoViewer.l5 = false;
    }
}
