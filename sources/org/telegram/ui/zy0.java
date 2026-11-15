package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class zy0 extends org.telegram.ui.Components.h6 {
    public boolean s;
    public final org.telegram.ui.Components.u5 w;
    public final /* synthetic */ SaveToGallerySettingsActivity x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.x = saveToGallerySettingsActivity;
        this.w = new org.telegram.ui.Components.u5(this);
        getDrawable().K = true;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10 = this.s ? 1.0f : 0.0f;
        org.telegram.ui.Components.u5 u5Var = this.w;
        u5Var.e(false, f10);
        int i7 = org.telegram.ui.ActionBar.j6.y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.x;
        setTextColor(i0.a.f(u5Var.c, saveToGallerySettingsActivity.getThemedColor(i7), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        if (this.s != z10) {
            this.s = z10;
            this.w.e(z11, z10 ? 1.0f : 0.0f);
            invalidate();
        }
    }
}
