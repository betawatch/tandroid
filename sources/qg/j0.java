package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.st0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class j0 extends FrameLayout {
    public final /* synthetic */ st0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(st0 st0Var, Context context) {
        super(context);
        this.a = st0Var;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        st0 st0Var = this.a;
        Paint paint = st0Var.B1;
        p1 p1Var = st0Var.u1;
        paint.setAlpha((int) ((1.0f - st0Var.D1) * p1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        p1Var.b(rectF);
        float translationY = p1Var.getTranslationY() + st0Var.c1.getTranslationY() + p1Var.getTop() + r4.getTop();
        float f7 = rectF.left;
        u1 u1Var = st0Var.v1;
        rectF.set(AndroidUtilities.lerp(f7, u1Var.getLeft(), st0Var.D1), AndroidUtilities.lerp(rectF.top + translationY, u1Var.getTop() - u1Var.getTranslationY(), st0Var.D1), AndroidUtilities.lerp(rectF.right, u1Var.getRight(), st0Var.D1), AndroidUtilities.lerp(translationY + rectF.bottom, u1Var.getBottom() - u1Var.getTranslationY(), st0Var.D1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, st0Var.D1));
        Paint paint2 = st0Var.C1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * st0Var.D1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            st0 st0Var = this.a;
            if (st0Var.E1) {
                st0Var.A0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
