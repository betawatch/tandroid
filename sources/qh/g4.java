package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class g4 extends FrameLayout {
    public final /* synthetic */ f9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(f9 f9Var, Context context) {
        super(context);
        this.a = f9Var;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        f9 f9Var = this.a;
        Paint paint = f9Var.o1;
        eg.i2 i2Var = f9Var.i1;
        paint.setAlpha((int) ((1.0f - f9Var.q1) * i2Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        i2Var.b(rectF);
        float translationY = i2Var.getTranslationY() + f9Var.Q0.getTranslationY() + i2Var.getTop() + r4.getTop();
        float f10 = rectF.left;
        eg.o2 o2Var = f9Var.j1;
        rectF.set(AndroidUtilities.lerp(f10, o2Var.getLeft(), f9Var.q1), AndroidUtilities.lerp(rectF.top + translationY, o2Var.getTop() - o2Var.getTranslationY(), f9Var.q1), AndroidUtilities.lerp(rectF.right, o2Var.getRight(), f9Var.q1), AndroidUtilities.lerp(translationY + rectF.bottom, o2Var.getBottom() - o2Var.getTranslationY(), f9Var.q1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, f9Var.q1));
        Paint paint2 = f9Var.p1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * f9Var.q1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            f9 f9Var = this.a;
            if (f9Var.r1) {
                f9Var.P0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
