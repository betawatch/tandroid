package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class rn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;
    public final /* synthetic */ Bitmap c;

    public /* synthetic */ rn0(PhotoViewer photoViewer, Bitmap bitmap, int i7) {
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
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer.g0(bitmap);
                org.telegram.messenger.g0.h3(new rn0(photoViewer, bitmap, 6));
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                photoViewer.g0(bitmap);
                org.telegram.messenger.g0.h3(new rn0(photoViewer, bitmap, 5));
                break;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.Z8;
                photoViewer.g0(bitmap);
                org.telegram.messenger.g0.h3(new rn0(photoViewer, bitmap, 4));
                break;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.Z8;
                photoViewer.g0(bitmap);
                break;
            case 4:
                photoViewer.C4.v0(bitmap);
                photoViewer.t5.setUndoCutState(true);
                photoViewer.Y2(true, true);
                break;
            case 5:
                photoViewer.C4.v0(bitmap);
                photoViewer.t5.setUndoCutState(true);
                photoViewer.Y2(true, true);
                break;
            default:
                photoViewer.C4.v0(bitmap);
                photoViewer.t5.setUndoCutState(true);
                photoViewer.Y2(true, true);
                break;
        }
    }
}
