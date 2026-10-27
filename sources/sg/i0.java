package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.pt0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class i0 extends FrameLayout {
    public final /* synthetic */ pt0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(pt0 pt0Var, Context context) {
        super(context);
        this.a = pt0Var;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        pt0 pt0Var = this.a;
        Paint paint = pt0Var.q1;
        p1 p1Var = pt0Var.j1;
        paint.setAlpha((int) ((1.0f - pt0Var.s1) * p1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        p1Var.b(rectF);
        float translationY = p1Var.getTranslationY() + pt0Var.R0.getTranslationY() + p1Var.getTop() + r4.getTop();
        float f7 = rectF.left;
        u1 u1Var = pt0Var.k1;
        rectF.set(AndroidUtilities.lerp(f7, u1Var.getLeft(), pt0Var.s1), AndroidUtilities.lerp(rectF.top + translationY, u1Var.getTop() - u1Var.getTranslationY(), pt0Var.s1), AndroidUtilities.lerp(rectF.right, u1Var.getRight(), pt0Var.s1), AndroidUtilities.lerp(translationY + rectF.bottom, u1Var.getBottom() - u1Var.getTranslationY(), pt0Var.s1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, pt0Var.s1));
        Paint paint2 = pt0Var.r1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * pt0Var.s1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            pt0 pt0Var = this.a;
            if (pt0Var.t1) {
                pt0Var.y0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
