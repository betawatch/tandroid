package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ws0 extends bg.g1 {
    public final /* synthetic */ PhotoViewer k2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, gq0 gq0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, gq0Var, c6Var);
        this.k2 = photoViewer;
    }

    @Override // bg.g1
    public final int getPKeyboardHeight() {
        nh.w3 w3Var = this.k2.G1;
        if (w3Var != null) {
            return w3Var.l;
        }
        return 0;
    }
}
