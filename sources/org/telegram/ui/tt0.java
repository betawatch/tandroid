package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class tt0 extends qg.p0 {
    public final /* synthetic */ PhotoViewer o2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, cr0 cr0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, cr0Var, d6Var);
        this.o2 = photoViewer;
    }

    @Override // qg.p0
    public final int getPKeyboardHeight() {
        ci.i4 i4Var = this.o2.K1;
        if (i4Var != null) {
            return i4Var.l;
        }
        return 0;
    }
}
