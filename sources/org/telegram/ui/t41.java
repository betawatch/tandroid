package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class t41 implements org.telegram.ui.Components.no0 {
    public final /* synthetic */ org.telegram.ui.Components.oo0 a;
    public final /* synthetic */ w41 b;
    public final /* synthetic */ w41 c;
    public final /* synthetic */ w41 d;
    public final /* synthetic */ u41 e;

    public t41(u41 u41Var, org.telegram.ui.Components.oo0 oo0Var, w41 w41Var, w41 w41Var2, w41 w41Var3) {
        this.e = u41Var;
        this.a = oo0Var;
        this.b = w41Var;
        this.c = w41Var2;
        this.d = w41Var3;
    }

    @Override // org.telegram.ui.Components.no0
    public final void W(float f7, boolean z10) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        long j3 = f7 > 0.7f ? (long) ((4089446400L * ((f7 - 0.7f) / 0.3f)) + SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) : (long) ((104333312 * (f7 / 0.7f)) + 524288.0f);
        w41 w41Var = this.d;
        w41 w41Var2 = this.b;
        w41 w41Var3 = this.c;
        if (f7 >= 1.0f) {
            w41Var2.e(false, isAttachedToWindow);
            w41Var3.e(false, isAttachedToWindow);
            w41Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(w41Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            w41Var2.e(true, isAttachedToWindow);
            w41Var3.e(false, isAttachedToWindow);
            w41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(w41Var3, false, 0.8f, isAttachedToWindow);
        } else {
            w41Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j3, true, false)), false, true);
            w41Var2.e(false, isAttachedToWindow);
            w41Var3.e(true, isAttachedToWindow);
            w41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(w41Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.X().limitVideo = j3;
            saveToGallerySettingsActivity.Y();
        }
    }

    @Override // org.telegram.ui.Components.no0
    public final /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.no0
    public final /* synthetic */ int k0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.no0
    public final void y() {
    }
}
