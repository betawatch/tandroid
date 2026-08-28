package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ws0 extends yf.v0 {
    public final /* synthetic */ PhotoViewer G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws0(PhotoViewer photoViewer, Context context, int i9, Bitmap bitmap, Bitmap bitmap2, int i10, MediaController.CropState cropState) {
        super(context, i9, bitmap, bitmap2, i10, cropState);
        this.G = photoViewer;
    }
}
