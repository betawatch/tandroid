package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class qi0 extends org.telegram.ui.Components.oo {
    public final /* synthetic */ ui0 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi0(ui0 ui0Var, Context context) {
        super(context, null, false, null);
        this.v0 = ui0Var;
    }

    @Override // org.telegram.ui.Components.oo, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ui0 ui0Var = this.v0;
        ui0Var.W.setImageCoords(ui0Var.b0.getAvatarImageView().getX(), ui0Var.b0.getAvatarImageView().getY(), ui0Var.b0.getAvatarImageView().getWidth(), ui0Var.b0.getAvatarImageView().getHeight());
        if (ui0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, ui0Var.W.getCenterX(), ui0Var.W.getCenterY());
            ui0Var.W.draw(canvas);
            canvas.restore();
        }
        if (ui0Var.X) {
            int centerX = (int) (ui0Var.W.getCenterX() - (org.telegram.ui.ActionBar.h6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (ui0Var.W.getCenterY() - (org.telegram.ui.ActionBar.h6.U0.getIntrinsicHeight() / 2));
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
