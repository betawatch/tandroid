package org.telegram.ui;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ yq0(PhotoViewer photoViewer, int i9) {
        this.a = i9;
        this.b = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i9) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.F0(true, false);
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer.f3(1, false);
                break;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.P8;
                photoViewer.f3(-1, false);
                break;
            default:
                PhotoViewer.R(photoViewer);
                break;
        }
    }
}
