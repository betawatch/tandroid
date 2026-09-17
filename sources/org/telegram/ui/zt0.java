package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class zt0 extends rg.o0 {
    public final /* synthetic */ PhotoViewer o2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, ir0 ir0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, ir0Var, f6Var);
        this.o2 = photoViewer;
    }

    @Override // rg.o0
    public final int getPKeyboardHeight() {
        di.j4 j4Var = this.o2.K1;
        if (j4Var != null) {
            return j4Var.l;
        }
        return 0;
    }
}
