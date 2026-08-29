package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;
    public final /* synthetic */ Bitmap c;

    public /* synthetic */ rq0(PhotoViewer photoViewer, Bitmap bitmap, int i10) {
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
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new rq0(photoViewer, bitmap, 6));
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new rq0(photoViewer, bitmap, 5));
                break;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.P8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new rq0(photoViewer, bitmap, 4));
                break;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.P8;
                photoViewer.n0(bitmap);
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
