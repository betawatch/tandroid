package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class yo0 extends cp0 {
    public int G;
    public final /* synthetic */ wp0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo0(wp0 wp0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.H = wp0Var;
        this.G = 0;
    }

    @Override // org.telegram.ui.cp0
    public final void a() {
        wp0 wp0Var = this.H;
        if (wp0Var.getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(wp0Var.getParentActivity(), wp0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.G != actionBarButtonColor) {
            ImageView imageView = wp0Var.J;
            if (imageView != null) {
                this.G = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = wp0Var.K;
            if (imageView2 != null) {
                this.G = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        wp0Var.F0();
        wp0Var.A0();
    }
}
