package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ql0 extends sl0 {
    public int H;
    public final /* synthetic */ lm0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql0(lm0 lm0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.I = lm0Var;
        this.H = 0;
    }

    @Override // org.telegram.ui.sl0
    public final void a() {
        lm0 lm0Var = this.I;
        if (lm0Var.getParentActivity() != null) {
            org.telegram.messenger.g0.o3(lm0Var.getParentActivity(), lm0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.H != actionBarButtonColor) {
            ImageView imageView = lm0Var.K;
            if (imageView != null) {
                this.H = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = lm0Var.L;
            if (imageView2 != null) {
                this.H = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        lm0Var.K0();
        lm0Var.F0();
    }
}
