package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class zr0 implements org.telegram.ui.Components.w30 {
    public final /* synthetic */ PhotoViewer a;

    public zr0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.a;
        photoViewer.M4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.g5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.g5 = null;
        }
        photoViewer.i5 = true;
        photoViewer.B2(i10);
        photoViewer.i5 = false;
    }
}
