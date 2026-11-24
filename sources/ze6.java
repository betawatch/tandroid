// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ze6 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ af6 b;

    public /* synthetic */ ze6(af6 af6Var, byte b) {
        this.a = b;
        this.b = af6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        af6 af6Var = this.b;
        switch (b) {
            case 0:
                if (gl.A1()) {
                    af6Var.h.requestFocus();
                    break;
                }
                break;
            default:
                if (af6Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) af6Var.getParent()).removeView(af6Var);
                }
                af6Var.c.setVisibility(0);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                af6 af6Var = this.b;
                af6Var.c.setVisibility(8);
                int measuredWidth = (int) (af6Var.b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (af6Var.b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(bkb.w0(null, bkb.c6, false));
                af6Var.b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / kk7.f2));
                af6Var.d.setBackground(new BitmapDrawable(af6Var.getContext().getResources(), createBitmap));
                af6Var.d.setAlpha(0.0f);
                af6Var.d.setVisibility(0);
                af6Var.b.addView(af6Var);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
