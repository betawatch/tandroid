package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class uo0 extends xo0 {
    public int G;
    public final /* synthetic */ rp0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo0(rp0 rp0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.H = rp0Var;
        this.G = 0;
    }

    @Override // org.telegram.ui.xo0
    public final void a() {
        rp0 rp0Var = this.H;
        if (rp0Var.getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(rp0Var.getParentActivity(), rp0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.G != actionBarButtonColor) {
            ImageView imageView = rp0Var.J;
            if (imageView != null) {
                this.G = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = rp0Var.K;
            if (imageView2 != null) {
                this.G = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        rp0Var.G0();
        rp0Var.B0();
    }
}
