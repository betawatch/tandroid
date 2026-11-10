package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;
    public final /* synthetic */ Bitmap c;

    public /* synthetic */ sn0(PhotoViewer photoViewer, Bitmap bitmap, int i7) {
        this.a = i7;
        this.b = photoViewer;
        this.c = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Bitmap bitmap = this.c;
        PhotoViewer photoViewer = this.b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.g0(bitmap);
                org.telegram.messenger.g0.h3(new sn0(photoViewer, bitmap, 6));
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                photoViewer.g0(bitmap);
                org.telegram.messenger.g0.h3(new sn0(photoViewer, bitmap, 5));
                break;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.Y8;
                photoViewer.g0(bitmap);
                org.telegram.messenger.g0.h3(new sn0(photoViewer, bitmap, 4));
                break;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.Y8;
                photoViewer.g0(bitmap);
                break;
            case 4:
                photoViewer.B4.v0(bitmap);
                photoViewer.s5.setUndoCutState(true);
                photoViewer.X2(true, true);
                break;
            case 5:
                photoViewer.B4.v0(bitmap);
                photoViewer.s5.setUndoCutState(true);
                photoViewer.X2(true, true);
                break;
            default:
                photoViewer.B4.v0(bitmap);
                photoViewer.s5.setUndoCutState(true);
                photoViewer.X2(true, true);
                break;
        }
    }
}
