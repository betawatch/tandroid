package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;
    public final /* synthetic */ Bitmap c;

    public /* synthetic */ yq0(PhotoViewer photoViewer, Bitmap bitmap, int i10) {
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
                Drawable[] drawableArr = PhotoViewer.Q8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new yq0(photoViewer, bitmap, 6));
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.Q8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new yq0(photoViewer, bitmap, 5));
                break;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.Q8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new yq0(photoViewer, bitmap, 4));
                break;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.Q8;
                photoViewer.n0(bitmap);
                break;
            case 4:
                photoViewer.z4.setImageBitmap(bitmap);
                photoViewer.q5.setUndoCutState(true);
                photoViewer.a3(true, true);
                break;
            case 5:
                photoViewer.z4.setImageBitmap(bitmap);
                photoViewer.q5.setUndoCutState(true);
                photoViewer.a3(true, true);
                break;
            default:
                photoViewer.z4.setImageBitmap(bitmap);
                photoViewer.q5.setUndoCutState(true);
                photoViewer.a3(true, true);
                break;
        }
    }
}
