package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class xi0 extends org.telegram.ui.Components.ao {
    public final /* synthetic */ bj0 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi0(bj0 bj0Var, Context context) {
        super(context, null, false, null);
        this.s0 = bj0Var;
    }

    @Override // org.telegram.ui.Components.ao, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        bj0 bj0Var = this.s0;
        bj0Var.T.setImageCoords(bj0Var.Y.getAvatarImageView().getX(), bj0Var.Y.getAvatarImageView().getY(), bj0Var.Y.getAvatarImageView().getWidth(), bj0Var.Y.getAvatarImageView().getHeight());
        if (bj0Var.V) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, bj0Var.T.getCenterX(), bj0Var.T.getCenterY());
            bj0Var.T.draw(canvas);
            canvas.restore();
        }
        if (bj0Var.U) {
            int centerX = (int) (bj0Var.T.getCenterX() - (org.telegram.ui.ActionBar.k6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (bj0Var.T.getCenterY() - (org.telegram.ui.ActionBar.k6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.k6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.k6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.k6.U0.draw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.ao, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s0.T.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.ao, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.s0.T.onDetachedFromWindow();
    }
}
