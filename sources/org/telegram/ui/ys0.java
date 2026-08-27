package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ys0 extends zf.l0 {
    public final /* synthetic */ PhotoViewer k2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, hq0 hq0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, hq0Var, c6Var);
        this.k2 = photoViewer;
    }

    @Override // zf.l0
    public final int getPKeyboardHeight() {
        lh.a4 a4Var = this.k2.G1;
        if (a4Var != null) {
            return a4Var.l;
        }
        return 0;
    }
}
