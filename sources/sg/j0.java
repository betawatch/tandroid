package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.nt0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class j0 extends FrameLayout {
    public final /* synthetic */ nt0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(nt0 nt0Var, Context context) {
        super(context);
        this.a = nt0Var;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        nt0 nt0Var = this.a;
        Paint paint = nt0Var.q1;
        q1 q1Var = nt0Var.j1;
        paint.setAlpha((int) ((1.0f - nt0Var.s1) * q1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        q1Var.b(rectF);
        float translationY = q1Var.getTranslationY() + nt0Var.R0.getTranslationY() + q1Var.getTop() + r4.getTop();
        float f7 = rectF.left;
        v1 v1Var = nt0Var.k1;
        rectF.set(AndroidUtilities.lerp(f7, v1Var.getLeft(), nt0Var.s1), AndroidUtilities.lerp(rectF.top + translationY, v1Var.getTop() - v1Var.getTranslationY(), nt0Var.s1), AndroidUtilities.lerp(rectF.right, v1Var.getRight(), nt0Var.s1), AndroidUtilities.lerp(translationY + rectF.bottom, v1Var.getBottom() - v1Var.getTranslationY(), nt0Var.s1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, nt0Var.s1));
        Paint paint2 = nt0Var.r1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * nt0Var.s1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            nt0 nt0Var = this.a;
            if (nt0Var.t1) {
                nt0Var.y0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
