package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class yi0 extends org.telegram.ui.Components.yn {
    public final /* synthetic */ cj0 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi0(cj0 cj0Var, Context context) {
        super(context, null, false, null);
        this.s0 = cj0Var;
    }

    @Override // org.telegram.ui.Components.yn, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        cj0 cj0Var = this.s0;
        cj0Var.T.setImageCoords(cj0Var.Y.getAvatarImageView().getX(), cj0Var.Y.getAvatarImageView().getY(), cj0Var.Y.getAvatarImageView().getWidth(), cj0Var.Y.getAvatarImageView().getHeight());
        if (cj0Var.V) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, cj0Var.T.getCenterX(), cj0Var.T.getCenterY());
            cj0Var.T.draw(canvas);
            canvas.restore();
        }
        if (cj0Var.U) {
            int centerX = (int) (cj0Var.T.getCenterX() - (org.telegram.ui.ActionBar.j6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (cj0Var.T.getCenterY() - (org.telegram.ui.ActionBar.j6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.j6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.j6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.j6.U0.draw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.yn, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s0.T.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.yn, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.s0.T.onDetachedFromWindow();
    }
}
