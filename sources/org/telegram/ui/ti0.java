package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ti0 extends org.telegram.ui.Components.po {
    public final /* synthetic */ xi0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti0(xi0 xi0Var, Context context) {
        super(context, null, false, null);
        this.z0 = xi0Var;
    }

    @Override // org.telegram.ui.Components.po, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        xi0 xi0Var = this.z0;
        xi0Var.W.setImageCoords(xi0Var.b0.getAvatarImageView().getX(), xi0Var.b0.getAvatarImageView().getY(), xi0Var.b0.getAvatarImageView().getWidth(), xi0Var.b0.getAvatarImageView().getHeight());
        if (xi0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, xi0Var.W.getCenterX(), xi0Var.W.getCenterY());
            xi0Var.W.draw(canvas);
            canvas.restore();
        }
        if (xi0Var.X) {
            int centerX = (int) (xi0Var.W.getCenterX() - (org.telegram.ui.ActionBar.y6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (xi0Var.W.getCenterY() - (org.telegram.ui.ActionBar.y6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.y6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.y6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.y6.U0.draw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.po, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.z0.W.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.po, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.z0.W.onDetachedFromWindow();
    }
}
