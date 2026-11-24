// default package

import android.app.Activity;
import android.graphics.Canvas;
import org.telegram.ui.SaveToGallerySettingsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qr9 extends io {
    public boolean s;
    public final ln w;
    public final /* synthetic */ SaveToGallerySettingsActivity x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr9(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.x = saveToGallerySettingsActivity;
        this.w = new ln(this);
        getDrawable().K = true;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f = this.s ? 1.0f : 0.0f;
        ln lnVar = this.w;
        lnVar.e(false, f);
        int i = cmb.x6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.x;
        setTextColor(on2.f(lnVar.c, saveToGallerySettingsActivity.getThemedColor(i), saveToGallerySettingsActivity.getThemedColor(cmb.m6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z, boolean z2) {
        if (this.s != z) {
            this.s = z;
            this.w.e(z2, z ? 1.0f : 0.0f);
            invalidate();
        }
    }
}
