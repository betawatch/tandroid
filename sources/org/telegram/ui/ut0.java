package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ut0 extends qg.w0 {
    public final /* synthetic */ PhotoViewer K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut0(PhotoViewer photoViewer, Context context, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, MediaController.CropState cropState) {
        super(context, i10, bitmap, bitmap2, i11, cropState);
        this.K = photoViewer;
    }
}
