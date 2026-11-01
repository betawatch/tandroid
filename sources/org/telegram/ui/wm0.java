package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class wm0 extends ym0 {
    public int G;
    public final /* synthetic */ rn0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm0(rn0 rn0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.H = rn0Var;
        this.G = 0;
    }

    @Override // org.telegram.ui.ym0
    public final void a() {
        rn0 rn0Var = this.H;
        if (rn0Var.getParentActivity() != null) {
            org.telegram.messenger.i0.o3(rn0Var.getParentActivity(), rn0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.G != actionBarButtonColor) {
            ImageView imageView = rn0Var.J;
            if (imageView != null) {
                this.G = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = rn0Var.K;
            if (imageView2 != null) {
                this.G = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        rn0Var.K0();
        rn0Var.F0();
    }
}
