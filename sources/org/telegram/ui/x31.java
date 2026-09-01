package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class x31 implements org.telegram.ui.Components.ko0 {
    public final /* synthetic */ org.telegram.ui.Components.lo0 a;
    public final /* synthetic */ a41 b;
    public final /* synthetic */ a41 c;
    public final /* synthetic */ a41 d;
    public final /* synthetic */ y31 e;

    public x31(y31 y31Var, org.telegram.ui.Components.lo0 lo0Var, a41 a41Var, a41 a41Var2, a41 a41Var3) {
        this.e = y31Var;
        this.a = lo0Var;
        this.b = a41Var;
        this.c = a41Var2;
        this.d = a41Var3;
    }

    @Override // org.telegram.ui.Components.ko0
    public final void X(float f10, boolean z4) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        long j10 = f10 > 0.7f ? (long) ((4089446400L * ((f10 - 0.7f) / 0.3f)) + SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) : (long) ((104333312 * (f10 / 0.7f)) + 524288.0f);
        a41 a41Var = this.d;
        a41 a41Var2 = this.b;
        a41 a41Var3 = this.c;
        if (f10 >= 1.0f) {
            a41Var2.e(false, isAttachedToWindow);
            a41Var3.e(false, isAttachedToWindow);
            a41Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(a41Var3, false, 0.8f, isAttachedToWindow);
        } else if (f10 == 0.0f) {
            a41Var2.e(true, isAttachedToWindow);
            a41Var3.e(false, isAttachedToWindow);
            a41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(a41Var3, false, 0.8f, isAttachedToWindow);
        } else {
            a41Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j10, true, false)), false, true);
            a41Var2.e(false, isAttachedToWindow);
            a41Var3.e(true, isAttachedToWindow);
            a41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(a41Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z4) {
            saveToGallerySettingsActivity.X().limitVideo = j10;
            saveToGallerySettingsActivity.Y();
        }
    }

    @Override // org.telegram.ui.Components.ko0
    public final /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.ko0
    public final /* synthetic */ int m0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ko0
    public final void A() {
    }
}
