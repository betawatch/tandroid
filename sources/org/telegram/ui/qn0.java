package org.telegram.ui;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ qn0(PhotoViewer photoViewer, int i3) {
        this.a = i3;
        this.b = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i3) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.V8;
                photoViewer.H0(true, false);
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.V8;
                photoViewer.i3(1, false);
                break;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.V8;
                photoViewer.i3(-1, false);
                break;
            default:
                PhotoViewer.S(photoViewer);
                break;
        }
    }
}
