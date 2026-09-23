package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class xo0 extends ap0 {
    public int G;
    public final /* synthetic */ up0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo0(up0 up0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.H = up0Var;
        this.G = 0;
    }

    @Override // org.telegram.ui.ap0
    public final void a() {
        up0 up0Var = this.H;
        if (up0Var.getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(up0Var.getParentActivity(), up0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.G != actionBarButtonColor) {
            ImageView imageView = up0Var.J;
            if (imageView != null) {
                this.G = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = up0Var.K;
            if (imageView2 != null) {
                this.G = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        up0Var.G0();
        up0Var.A0();
    }
}
