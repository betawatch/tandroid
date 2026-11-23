package org.telegram.ui;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                photoViewer.n7 = null;
                break;
            case 1:
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer.y3();
                break;
            case 2:
                photoViewer.E1.e(photoViewer.J2, photoViewer.K2, photoViewer.L2, photoViewer.P2, photoViewer.R2, photoViewer.O2, photoViewer.p2(true), photoViewer.p2(true), photoViewer.M2, photoViewer.N2, 0.0f, 0.0f, photoViewer.Q2);
                photoViewer.c3(0);
                break;
            case 3:
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                photoViewer.z0(true, false);
                break;
            case 4:
                Drawable[] drawableArr3 = PhotoViewer.Z8;
                photoViewer.d3(1, false);
                break;
            default:
                PhotoViewer.L(photoViewer);
                break;
        }
    }
}
