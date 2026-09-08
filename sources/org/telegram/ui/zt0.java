package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
