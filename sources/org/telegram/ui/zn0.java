package org.telegram.ui;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ zn0(PhotoViewer photoViewer, int i7) {
        this.a = i7;
        this.b = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i7) {
            case 0:
                photoViewer.m7 = null;
                break;
            case 1:
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.x3();
                break;
            case 2:
                photoViewer.D1.e(photoViewer.I2, photoViewer.J2, photoViewer.K2, photoViewer.O2, photoViewer.Q2, photoViewer.N2, photoViewer.o2(true), photoViewer.o2(true), photoViewer.L2, photoViewer.M2, 0.0f, 0.0f, photoViewer.P2);
                photoViewer.b3(0);
                break;
            case 3:
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                photoViewer.z0(true, false);
                break;
            case 4:
                Drawable[] drawableArr3 = PhotoViewer.Y8;
                photoViewer.c3(1, false);
                break;
            default:
                PhotoViewer.K(photoViewer);
                break;
        }
    }
}
