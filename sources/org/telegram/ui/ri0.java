package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ri0 extends org.telegram.ui.Components.oo {
    public final /* synthetic */ vi0 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri0(vi0 vi0Var, Context context) {
        super(context, null, false, null);
        this.v0 = vi0Var;
    }

    @Override // org.telegram.ui.Components.oo, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        vi0 vi0Var = this.v0;
        vi0Var.W.setImageCoords(vi0Var.b0.getAvatarImageView().getX(), vi0Var.b0.getAvatarImageView().getY(), vi0Var.b0.getAvatarImageView().getWidth(), vi0Var.b0.getAvatarImageView().getHeight());
        if (vi0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, vi0Var.W.getCenterX(), vi0Var.W.getCenterY());
            vi0Var.W.draw(canvas);
            canvas.restore();
        }
        if (vi0Var.X) {
            int centerX = (int) (vi0Var.W.getCenterX() - (org.telegram.ui.ActionBar.h6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (vi0Var.W.getCenterY() - (org.telegram.ui.ActionBar.h6.U0.getIntrinsicHeight() / 2));
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
