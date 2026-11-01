package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;
    public final /* synthetic */ Bitmap c;

    public /* synthetic */ zo0(PhotoViewer photoViewer, Bitmap bitmap, int i10) {
        this.a = i10;
        this.b = photoViewer;
        this.c = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Bitmap bitmap = this.c;
        PhotoViewer photoViewer = this.b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.o0(bitmap);
                org.telegram.messenger.i0.g3(new zo0(photoViewer, bitmap, 6));
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.o0(bitmap);
                org.telegram.messenger.i0.g3(new zo0(photoViewer, bitmap, 5));
                break;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.o0(bitmap);
                org.telegram.messenger.i0.g3(new zo0(photoViewer, bitmap, 4));
                break;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer.o0(bitmap);
                break;
            case 4:
                photoViewer.C4.v0(bitmap);
                photoViewer.t5.setUndoCutState(true);
                photoViewer.d3(true, true);
                break;
            case 5:
                photoViewer.C4.v0(bitmap);
                photoViewer.t5.setUndoCutState(true);
                photoViewer.d3(true, true);
                break;
            default:
                photoViewer.C4.v0(bitmap);
                photoViewer.t5.setUndoCutState(true);
                photoViewer.d3(true, true);
                break;
        }
    }
}
