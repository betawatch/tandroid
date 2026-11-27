// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class v67 extends f82 {
    public final /* synthetic */ z67 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v67(z67 z67Var, Context context) {
        super(context, null, false, null);
        this.B0 = z67Var;
    }

    @Override // f82, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        z67 z67Var = this.B0;
        z67Var.X.i0(z67Var.c0.getAvatarImageView().getX(), z67Var.c0.getAvatarImageView().getY(), z67Var.c0.getAvatarImageView().getWidth(), z67Var.c0.getAvatarImageView().getHeight());
        if (z67Var.Z) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, z67Var.X.r(), z67Var.X.s());
            z67Var.X.h(canvas, null);
            canvas.restore();
        }
        if (z67Var.Y) {
            int r = (int) (z67Var.X.r() - (aob.T0.getIntrinsicWidth() / 2));
            int s = (int) (z67Var.X.s() - (aob.T0.getIntrinsicHeight() / 2));
            Drawable drawable = aob.T0;
            drawable.setBounds(r, s, drawable.getIntrinsicWidth() + r, aob.T0.getIntrinsicHeight() + s);
            aob.T0.draw(canvas);
        }
    }

    @Override // f82, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B0.X.I();
    }

    @Override // f82, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B0.X.K();
    }
}
