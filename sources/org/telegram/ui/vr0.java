package org.telegram.ui;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ vr0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.G0(true, false);
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.f3(1, false);
                break;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.f3(-1, false);
                break;
            default:
                PhotoViewer.Q(photoViewer);
                break;
        }
    }
}
