package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class rt0 extends qg.x0 {
    public final /* synthetic */ PhotoViewer K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt0(PhotoViewer photoViewer, Context context, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, MediaController.CropState cropState) {
        super(context, i10, bitmap, bitmap2, i11, cropState);
        this.K = photoViewer;
    }
}
