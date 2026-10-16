package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.gu0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class j0 extends FrameLayout {
    public final /* synthetic */ gu0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(gu0 gu0Var, Context context) {
        super(context);
        this.a = gu0Var;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        gu0 gu0Var = this.a;
        Paint paint = gu0Var.B1;
        q1 q1Var = gu0Var.u1;
        paint.setAlpha((int) ((1.0f - gu0Var.D1) * q1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        q1Var.b(rectF);
        float translationY = q1Var.getTranslationY() + gu0Var.c1.getTranslationY() + q1Var.getTop() + r4.getTop();
        float f7 = rectF.left;
        v1 v1Var = gu0Var.v1;
        rectF.set(AndroidUtilities.lerp(f7, v1Var.getLeft(), gu0Var.D1), AndroidUtilities.lerp(rectF.top + translationY, v1Var.getTop() - v1Var.getTranslationY(), gu0Var.D1), AndroidUtilities.lerp(rectF.right, v1Var.getRight(), gu0Var.D1), AndroidUtilities.lerp(translationY + rectF.bottom, v1Var.getBottom() - v1Var.getTranslationY(), gu0Var.D1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, gu0Var.D1));
        Paint paint2 = gu0Var.C1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * gu0Var.D1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            gu0 gu0Var = this.a;
            if (gu0Var.E1) {
                gu0Var.A0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
