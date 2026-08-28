package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xs0 extends yf.l0 {
    public final /* synthetic */ PhotoViewer k2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs0(PhotoViewer photoViewer, Context context, Activity activity, int i9, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, MediaController.CropState cropState, gq0 gq0Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, activity, i9, bitmap, bitmap2, i10, arrayList, cropState, gq0Var, b6Var);
        this.k2 = photoViewer;
    }

    @Override // yf.l0
    public final int getPKeyboardHeight() {
        kh.b4 b4Var = this.k2.G1;
        if (b4Var != null) {
            return b4Var.l;
        }
        return 0;
    }
}
