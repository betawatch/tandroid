package org.telegram.ui;

import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class yj0 extends org.telegram.ui.Cells.q8 {
    public ImageView R;

    @Override // org.telegram.ui.Cells.q8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = LocaleController.isRTL ? AndroidUtilities.dp(17.0f) : (i12 - i10) - AndroidUtilities.dp(41.0f);
        int A = org.telegram.messenger.lk.A(24.0f, i13 - i11, 2);
        this.R.layout(dp, A, AndroidUtilities.dp(24.0f) + dp, AndroidUtilities.dp(24.0f) + A);
    }

    @Override // org.telegram.ui.Cells.q8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.R.measure(i10, i11);
    }
}
