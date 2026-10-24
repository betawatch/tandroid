package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ui0 extends org.telegram.ui.Components.oo {
    public final /* synthetic */ yi0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui0(yi0 yi0Var, Context context) {
        super(context, null, false, null);
        this.z0 = yi0Var;
    }

    @Override // org.telegram.ui.Components.oo, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        yi0 yi0Var = this.z0;
        yi0Var.W.setImageCoords(yi0Var.b0.getAvatarImageView().getX(), yi0Var.b0.getAvatarImageView().getY(), yi0Var.b0.getAvatarImageView().getWidth(), yi0Var.b0.getAvatarImageView().getHeight());
        if (yi0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, yi0Var.W.getCenterX(), yi0Var.W.getCenterY());
            yi0Var.W.draw(canvas);
            canvas.restore();
        }
        if (yi0Var.X) {
            int centerX = (int) (yi0Var.W.getCenterX() - (org.telegram.ui.ActionBar.k6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (yi0Var.W.getCenterY() - (org.telegram.ui.ActionBar.k6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.k6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.k6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.k6.U0.draw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.oo, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.z0.W.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.oo, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.z0.W.onDetachedFromWindow();
    }
}
