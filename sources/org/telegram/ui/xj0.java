package org.telegram.ui;

import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xj0 extends org.telegram.ui.Cells.p8 {
    public ImageView M;

    @Override // org.telegram.ui.Cells.p8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        int dp = LocaleController.isRTL ? AndroidUtilities.dp(17.0f) : (i11 - i9) - AndroidUtilities.dp(41.0f);
        int y10 = org.telegram.messenger.ll.y(24.0f, i12 - i10, 2);
        this.M.layout(dp, y10, AndroidUtilities.dp(24.0f) + dp, AndroidUtilities.dp(24.0f) + y10);
    }

    @Override // org.telegram.ui.Cells.p8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        this.M.measure(i9, i10);
    }
}
