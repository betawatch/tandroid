package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class wi0 extends org.telegram.ui.Components.zn {
    public final /* synthetic */ aj0 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi0(aj0 aj0Var, Context context) {
        super(context, null, false, null);
        this.s0 = aj0Var;
    }

    @Override // org.telegram.ui.Components.zn, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        aj0 aj0Var = this.s0;
        aj0Var.T.setImageCoords(aj0Var.Y.getAvatarImageView().getX(), aj0Var.Y.getAvatarImageView().getY(), aj0Var.Y.getAvatarImageView().getWidth(), aj0Var.Y.getAvatarImageView().getHeight());
        if (aj0Var.V) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, aj0Var.T.getCenterX(), aj0Var.T.getCenterY());
            aj0Var.T.draw(canvas);
            canvas.restore();
        }
        if (aj0Var.U) {
            int centerX = (int) (aj0Var.T.getCenterX() - (org.telegram.ui.ActionBar.j6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (aj0Var.T.getCenterY() - (org.telegram.ui.ActionBar.j6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.j6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.j6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.j6.U0.draw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.zn, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s0.T.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.zn, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.s0.T.onDetachedFromWindow();
    }
}
