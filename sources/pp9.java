// default package

import android.app.Activity;
import android.graphics.Canvas;
import org.telegram.ui.SaveToGallerySettingsActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class pp9 extends hn {
    public boolean s;
    public final lm w;
    public final /* synthetic */ SaveToGallerySettingsActivity x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp9(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.x = saveToGallerySettingsActivity;
        this.w = new lm(this);
        getDrawable().K = true;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f = this.s ? 1.0f : 0.0f;
        lm lmVar = this.w;
        lmVar.e(false, f);
        int i = bkb.x6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.x;
        setTextColor(bm2.f(lmVar.c, saveToGallerySettingsActivity.getThemedColor(i), saveToGallerySettingsActivity.getThemedColor(bkb.m6)));
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
