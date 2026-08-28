package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sr0 implements org.telegram.ui.Components.e30 {
    public final /* synthetic */ PhotoViewer a;

    public sr0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public final void a(int i9) {
        PhotoViewer photoViewer = this.a;
        photoViewer.L4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f5 = null;
        }
        photoViewer.h5 = true;
        photoViewer.B2(i9);
        photoViewer.h5 = false;
    }
}
