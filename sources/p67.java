// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p67 extends z82 {
    public final /* synthetic */ t67 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p67(t67 t67Var, Context context) {
        super(context, null, false, null);
        this.B0 = t67Var;
    }

    @Override // z82, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        t67 t67Var = this.B0;
        t67Var.X.i0(t67Var.c0.getAvatarImageView().getX(), t67Var.c0.getAvatarImageView().getY(), t67Var.c0.getAvatarImageView().getWidth(), t67Var.c0.getAvatarImageView().getHeight());
        if (t67Var.Z) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, t67Var.X.r(), t67Var.X.s());
            t67Var.X.h(canvas, null);
            canvas.restore();
        }
        if (t67Var.Y) {
            int r = (int) (t67Var.X.r() - (cmb.T0.getIntrinsicWidth() / 2));
            int s = (int) (t67Var.X.s() - (cmb.T0.getIntrinsicHeight() / 2));
            Drawable drawable = cmb.T0;
            drawable.setBounds(r, s, drawable.getIntrinsicWidth() + r, cmb.T0.getIntrinsicHeight() + s);
            cmb.T0.draw(canvas);
        }
    }

    @Override // z82, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B0.X.I();
    }

    @Override // z82, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B0.X.K();
    }
}
