package org.telegram.ui;

import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class uj0 extends org.telegram.ui.Cells.m8 {
    public ImageView M;

    @Override // org.telegram.ui.Cells.m8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = LocaleController.isRTL ? AndroidUtilities.dp(17.0f) : (i12 - i10) - AndroidUtilities.dp(41.0f);
        int x4 = b.x(24.0f, i13 - i11, 2);
        this.M.layout(dp, x4, AndroidUtilities.dp(24.0f) + dp, AndroidUtilities.dp(24.0f) + x4);
    }

    @Override // org.telegram.ui.Cells.m8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.M.measure(i10, i11);
    }
}
