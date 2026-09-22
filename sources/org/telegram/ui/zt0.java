package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class zt0 extends qg.z0 {
    public final /* synthetic */ PhotoViewer K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt0(PhotoViewer photoViewer, Context context, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, MediaController.CropState cropState) {
        super(context, i10, bitmap, bitmap2, i11, cropState);
        this.K = photoViewer;
    }
}
