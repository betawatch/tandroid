package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class v31 implements org.telegram.ui.Components.jo0 {
    public final /* synthetic */ org.telegram.ui.Components.ko0 a;
    public final /* synthetic */ y31 b;
    public final /* synthetic */ y31 c;
    public final /* synthetic */ y31 d;
    public final /* synthetic */ w31 e;

    public v31(w31 w31Var, org.telegram.ui.Components.ko0 ko0Var, y31 y31Var, y31 y31Var2, y31 y31Var3) {
        this.e = w31Var;
        this.a = ko0Var;
        this.b = y31Var;
        this.c = y31Var2;
        this.d = y31Var3;
    }

    @Override // org.telegram.ui.Components.jo0
    public final void Y(float f10, boolean z4) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        long j10 = f10 > 0.7f ? (long) ((4089446400L * ((f10 - 0.7f) / 0.3f)) + SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) : (long) ((104333312 * (f10 / 0.7f)) + 524288.0f);
        y31 y31Var = this.d;
        y31 y31Var2 = this.b;
        y31 y31Var3 = this.c;
        if (f10 >= 1.0f) {
            y31Var2.e(false, isAttachedToWindow);
            y31Var3.e(false, isAttachedToWindow);
            y31Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(y31Var3, false, 0.8f, isAttachedToWindow);
        } else if (f10 == 0.0f) {
            y31Var2.e(true, isAttachedToWindow);
            y31Var3.e(false, isAttachedToWindow);
            y31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(y31Var3, false, 0.8f, isAttachedToWindow);
        } else {
            y31Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j10, true, false)), false, true);
            y31Var2.e(false, isAttachedToWindow);
            y31Var3.e(true, isAttachedToWindow);
            y31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(y31Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z4) {
            saveToGallerySettingsActivity.X().limitVideo = j10;
            saveToGallerySettingsActivity.Y();
        }
    }

    @Override // org.telegram.ui.Components.jo0
    public final /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.jo0
    public final /* synthetic */ int j0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.jo0
    public final void B() {
    }
}
