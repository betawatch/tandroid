package qh;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class d3 extends View implements b2 {
    public final org.telegram.ui.Components.j6 a;

    public d3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(true, true, true, false);
        this.a = j6Var;
        j6Var.k(0.35f, 300L, pr.h);
        j6Var.r(-1);
        j6Var.t(AndroidUtilities.dp(14.0f));
        j6Var.p(AndroidUtilities.dp(1.4f), AndroidUtilities.dp(0.4f), 1275068416);
        j6Var.b = 1;
        j6Var.setCallback(this);
        j6Var.G = AndroidUtilities.displaySize.x;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Components.j6 j6Var = this.a;
        j6Var.setBounds(0, 0, width, height);
        j6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.a.G = getMeasuredWidth();
    }

    @Override // qh.b2
    public void setInvert(float f10) {
        this.a.r(i0.a.d(f10, -1, -16777216));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
