package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class x41 implements org.telegram.ui.Components.fp0 {
    public final /* synthetic */ org.telegram.ui.Components.gp0 a;
    public final /* synthetic */ a51 b;
    public final /* synthetic */ a51 c;
    public final /* synthetic */ a51 d;
    public final /* synthetic */ y41 e;

    public x41(y41 y41Var, org.telegram.ui.Components.gp0 gp0Var, a51 a51Var, a51 a51Var2, a51 a51Var3) {
        this.e = y41Var;
        this.a = gp0Var;
        this.b = a51Var;
        this.c = a51Var2;
        this.d = a51Var3;
    }

    @Override // org.telegram.ui.Components.fp0
    public final void X(float f7, boolean z10) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        long j10 = f7 > 0.7f ? (long) ((4089446400L * ((f7 - 0.7f) / 0.3f)) + SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) : (long) ((104333312 * (f7 / 0.7f)) + 524288.0f);
        a51 a51Var = this.d;
        a51 a51Var2 = this.b;
        a51 a51Var3 = this.c;
        if (f7 >= 1.0f) {
            a51Var2.e(false, isAttachedToWindow);
            a51Var3.e(false, isAttachedToWindow);
            a51Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(a51Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            a51Var2.e(true, isAttachedToWindow);
            a51Var3.e(false, isAttachedToWindow);
            a51Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(a51Var3, false, 0.8f, isAttachedToWindow);
        } else {
            a51Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j10, true, false)), false, true);
            a51Var2.e(false, isAttachedToWindow);
            a51Var3.e(true, isAttachedToWindow);
            a51Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(a51Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.X().limitVideo = j10;
            saveToGallerySettingsActivity.Y();
        }
    }

    @Override // org.telegram.ui.Components.fp0
    public final /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.fp0
    public final /* synthetic */ int k0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.fp0
    public final void z() {
    }
}
