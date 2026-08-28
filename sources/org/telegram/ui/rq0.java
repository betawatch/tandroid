package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;
    public final /* synthetic */ Bitmap c;

    public /* synthetic */ rq0(PhotoViewer photoViewer, Bitmap bitmap, int i9) {
        this.a = i9;
        this.b = photoViewer;
        this.c = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        Bitmap bitmap = this.c;
        PhotoViewer photoViewer = this.b;
        switch (i9) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.m0(bitmap);
                AndroidUtilities.runOnUIThread(new rq0(photoViewer, bitmap, 6));
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer.m0(bitmap);
                AndroidUtilities.runOnUIThread(new rq0(photoViewer, bitmap, 5));
                break;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.P8;
                photoViewer.m0(bitmap);
                AndroidUtilities.runOnUIThread(new rq0(photoViewer, bitmap, 4));
                break;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.P8;
                photoViewer.m0(bitmap);
                break;
            case 4:
                photoViewer.y4.setImageBitmap(bitmap);
                photoViewer.p5.setUndoCutState(true);
                photoViewer.a3(true, true);
                break;
            case 5:
                photoViewer.y4.setImageBitmap(bitmap);
                photoViewer.p5.setUndoCutState(true);
                photoViewer.a3(true, true);
                break;
            default:
                photoViewer.y4.setImageBitmap(bitmap);
                photoViewer.p5.setUndoCutState(true);
                photoViewer.a3(true, true);
                break;
        }
    }
}
