package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class vo0 extends zo0 {
    public int G;
    public final /* synthetic */ tp0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo0(tp0 tp0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.H = tp0Var;
        this.G = 0;
    }

    @Override // org.telegram.ui.zo0
    public final void a() {
        tp0 tp0Var = this.H;
        if (tp0Var.getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(tp0Var.getParentActivity(), tp0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.G != actionBarButtonColor) {
            ImageView imageView = tp0Var.J;
            if (imageView != null) {
                this.G = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = tp0Var.K;
            if (imageView2 != null) {
                this.G = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        tp0Var.G0();
        tp0Var.A0();
    }
}
