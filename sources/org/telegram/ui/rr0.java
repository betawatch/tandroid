package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class rr0 implements org.telegram.ui.Components.s30 {
    public final /* synthetic */ PhotoViewer a;

    public rr0(PhotoViewer photoViewer) {
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
