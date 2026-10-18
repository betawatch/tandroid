package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class si0 extends org.telegram.ui.Components.oo {
    public final /* synthetic */ wi0 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si0(wi0 wi0Var, Context context) {
        super(context, null, false, null);
        this.v0 = wi0Var;
    }

    @Override // org.telegram.ui.Components.oo, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        wi0 wi0Var = this.v0;
        wi0Var.W.setImageCoords(wi0Var.b0.getAvatarImageView().getX(), wi0Var.b0.getAvatarImageView().getY(), wi0Var.b0.getAvatarImageView().getWidth(), wi0Var.b0.getAvatarImageView().getHeight());
        if (wi0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, wi0Var.W.getCenterX(), wi0Var.W.getCenterY());
            wi0Var.W.draw(canvas);
            canvas.restore();
        }
        if (wi0Var.X) {
            int centerX = (int) (wi0Var.W.getCenterX() - (org.telegram.ui.ActionBar.h6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (wi0Var.W.getCenterY() - (org.telegram.ui.ActionBar.h6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.h6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.h6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.h6.U0.draw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.oo, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v0.W.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.oo, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v0.W.onDetachedFromWindow();
    }
}
