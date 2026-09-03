package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class f4 extends FrameLayout {
    public final /* synthetic */ e9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(e9 e9Var, Context context) {
        super(context);
        this.a = e9Var;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        e9 e9Var = this.a;
        Paint paint = e9Var.o1;
        eg.i2 i2Var = e9Var.i1;
        paint.setAlpha((int) ((1.0f - e9Var.q1) * i2Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        i2Var.b(rectF);
        float translationY = i2Var.getTranslationY() + e9Var.Q0.getTranslationY() + i2Var.getTop() + r4.getTop();
        float f10 = rectF.left;
        eg.o2 o2Var = e9Var.j1;
        rectF.set(AndroidUtilities.lerp(f10, o2Var.getLeft(), e9Var.q1), AndroidUtilities.lerp(rectF.top + translationY, o2Var.getTop() - o2Var.getTranslationY(), e9Var.q1), AndroidUtilities.lerp(rectF.right, o2Var.getRight(), e9Var.q1), AndroidUtilities.lerp(translationY + rectF.bottom, o2Var.getBottom() - o2Var.getTranslationY(), e9Var.q1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, e9Var.q1));
        Paint paint2 = e9Var.p1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * e9Var.q1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            e9 e9Var = this.a;
            if (e9Var.r1) {
                e9Var.P0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
