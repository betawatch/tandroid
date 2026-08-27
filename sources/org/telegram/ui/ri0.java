package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ri0 extends org.telegram.ui.Components.rn {
    public final /* synthetic */ vi0 r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri0(vi0 vi0Var, Context context) {
        super(context, null, false, null);
        this.r0 = vi0Var;
    }

    @Override // org.telegram.ui.Components.rn, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        vi0 vi0Var = this.r0;
        vi0Var.S.setImageCoords(vi0Var.X.getAvatarImageView().getX(), vi0Var.X.getAvatarImageView().getY(), vi0Var.X.getAvatarImageView().getWidth(), vi0Var.X.getAvatarImageView().getHeight());
        if (vi0Var.U) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, vi0Var.S.getCenterX(), vi0Var.S.getCenterY());
            vi0Var.S.draw(canvas);
            canvas.restore();
        }
        if (vi0Var.T) {
            int centerX = (int) (vi0Var.S.getCenterX() - (org.telegram.ui.ActionBar.g6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (vi0Var.S.getCenterY() - (org.telegram.ui.ActionBar.g6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.g6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.g6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.g6.U0.draw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.rn, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r0.S.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.rn, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r0.S.onDetachedFromWindow();
    }
}
