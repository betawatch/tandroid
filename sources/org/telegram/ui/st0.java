package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class st0 extends qg.n0 {
    public final /* synthetic */ PhotoViewer o2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, ar0 ar0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, ar0Var, d6Var);
        this.o2 = photoViewer;
    }

    @Override // qg.n0
    public final int getPKeyboardHeight() {
        ci.i4 i4Var = this.o2.K1;
        if (i4Var != null) {
            return i4Var.l;
        }
        return 0;
    }
}
