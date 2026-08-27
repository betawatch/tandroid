package org.telegram.ui;

import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class yj0 extends org.telegram.ui.Cells.l8 {
    public ImageView M;

    @Override // org.telegram.ui.Cells.l8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = LocaleController.isRTL ? AndroidUtilities.dp(17.0f) : (i12 - i10) - AndroidUtilities.dp(41.0f);
        int x8 = org.telegram.messenger.rl.x(24.0f, i13 - i11, 2);
        this.M.layout(dp, x8, AndroidUtilities.dp(24.0f) + dp, AndroidUtilities.dp(24.0f) + x8);
    }

    @Override // org.telegram.ui.Cells.l8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.M.measure(i10, i11);
    }
}
