package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class rl extends fi.v3 {
    public final /* synthetic */ un L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(un unVar, Activity activity) {
        super(activity, 3);
        this.L0 = unVar;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        setTranslationY(((-getTop()) - AndroidUtilities.dp(120.0f)) + this.L0.O1);
    }
}
