package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class tr0 implements org.telegram.ui.Components.j30 {
    public final /* synthetic */ PhotoViewer a;

    public tr0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.a;
        photoViewer.L4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f5 = null;
        }
        photoViewer.h5 = true;
        photoViewer.B2(i10);
        photoViewer.h5 = false;
    }
}
