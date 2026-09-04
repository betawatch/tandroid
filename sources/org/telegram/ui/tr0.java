package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class tr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;
    public final /* synthetic */ Bitmap c;

    public /* synthetic */ tr0(PhotoViewer photoViewer, Bitmap bitmap, int i10) {
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
                Drawable[] drawableArr = PhotoViewer.T8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new tr0(photoViewer, bitmap, 6));
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.T8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new tr0(photoViewer, bitmap, 5));
                break;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.T8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new tr0(photoViewer, bitmap, 4));
                break;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.T8;
                photoViewer.n0(bitmap);
                break;
            case 4:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.t5.setUndoCutState(true);
                photoViewer.a3(true, true);
                break;
            case 5:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.t5.setUndoCutState(true);
                photoViewer.a3(true, true);
                break;
            default:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.t5.setUndoCutState(true);
                photoViewer.a3(true, true);
                break;
        }
    }
}
