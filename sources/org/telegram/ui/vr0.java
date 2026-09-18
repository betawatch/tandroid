package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;
    public final /* synthetic */ Bitmap c;

    public /* synthetic */ vr0(PhotoViewer photoViewer, Bitmap bitmap, int i10) {
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
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new vr0(photoViewer, bitmap, 6));
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new vr0(photoViewer, bitmap, 5));
                break;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new vr0(photoViewer, bitmap, 4));
                break;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer.n0(bitmap);
                break;
            case 4:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.t5.setUndoCutState(true);
                photoViewer.Z2(true, true);
                break;
            case 5:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.t5.setUndoCutState(true);
                photoViewer.Z2(true, true);
                break;
            default:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.t5.setUndoCutState(true);
                photoViewer.Z2(true, true);
                break;
        }
    }
}
