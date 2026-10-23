package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.jt0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class i0 extends FrameLayout {
    public final /* synthetic */ jt0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(jt0 jt0Var, Context context) {
        super(context);
        this.a = jt0Var;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        jt0 jt0Var = this.a;
        Paint paint = jt0Var.B1;
        p1 p1Var = jt0Var.u1;
        paint.setAlpha((int) ((1.0f - jt0Var.D1) * p1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        p1Var.b(rectF);
        float translationY = p1Var.getTranslationY() + jt0Var.c1.getTranslationY() + p1Var.getTop() + r4.getTop();
        float f7 = rectF.left;
        u1 u1Var = jt0Var.v1;
        rectF.set(AndroidUtilities.lerp(f7, u1Var.getLeft(), jt0Var.D1), AndroidUtilities.lerp(rectF.top + translationY, u1Var.getTop() - u1Var.getTranslationY(), jt0Var.D1), AndroidUtilities.lerp(rectF.right, u1Var.getRight(), jt0Var.D1), AndroidUtilities.lerp(translationY + rectF.bottom, u1Var.getBottom() - u1Var.getTranslationY(), jt0Var.D1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, jt0Var.D1));
        Paint paint2 = jt0Var.C1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * jt0Var.D1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            jt0 jt0Var = this.a;
            if (jt0Var.E1) {
                jt0Var.z0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
