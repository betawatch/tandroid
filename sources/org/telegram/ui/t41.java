package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class t41 extends org.telegram.ui.Components.o6 {
    public boolean s;
    public final org.telegram.ui.Components.d6 v;
    public final /* synthetic */ SaveToGallerySettingsActivity w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t41(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.w = saveToGallerySettingsActivity;
        this.v = new org.telegram.ui.Components.d6(this);
        getDrawable().D = true;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7 = this.s ? 1.0f : 0.0f;
        org.telegram.ui.Components.d6 d6Var = this.v;
        d6Var.d(f7, false);
        int i10 = org.telegram.ui.ActionBar.j6.y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.w;
        setTextColor(i0.a.d(d6Var.c, saveToGallerySettingsActivity.getThemedColor(i10), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.n6)));
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
