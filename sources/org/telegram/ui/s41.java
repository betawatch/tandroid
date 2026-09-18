package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class s41 extends org.telegram.ui.Components.n6 {
    public boolean s;
    public final org.telegram.ui.Components.c6 v;
    public final /* synthetic */ SaveToGallerySettingsActivity w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s41(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.w = saveToGallerySettingsActivity;
        this.v = new org.telegram.ui.Components.c6(this);
        getDrawable().D = true;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7 = this.s ? 1.0f : 0.0f;
        org.telegram.ui.Components.c6 c6Var = this.v;
        c6Var.d(f7, false);
        int i10 = org.telegram.ui.ActionBar.j6.y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.w;
        setTextColor(i0.a.d(c6Var.c, saveToGallerySettingsActivity.getThemedColor(i10), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        if (this.s != z10) {
            this.s = z10;
            this.v.d(z10 ? 1.0f : 0.0f, z11);
            invalidate();
        }
    }
}
