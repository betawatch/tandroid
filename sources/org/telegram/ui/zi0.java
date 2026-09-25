package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class zi0 extends org.telegram.ui.Components.fo {
    public final /* synthetic */ dj0 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi0(dj0 dj0Var, Context context) {
        super(context, null, false, null);
        this.v0 = dj0Var;
    }

    @Override // org.telegram.ui.Components.fo, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        dj0 dj0Var = this.v0;
        dj0Var.W.setImageCoords(dj0Var.b0.getAvatarImageView().getX(), dj0Var.b0.getAvatarImageView().getY(), dj0Var.b0.getAvatarImageView().getWidth(), dj0Var.b0.getAvatarImageView().getHeight());
        if (dj0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, dj0Var.W.getCenterX(), dj0Var.W.getCenterY());
            dj0Var.W.draw(canvas);
            canvas.restore();
        }
        if (dj0Var.X) {
            int centerX = (int) (dj0Var.W.getCenterX() - (org.telegram.ui.ActionBar.h6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (dj0Var.W.getCenterY() - (org.telegram.ui.ActionBar.h6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.h6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.h6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.h6.U0.draw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.fo, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v0.W.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.fo, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v0.W.onDetachedFromWindow();
    }
}
