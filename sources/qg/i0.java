package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.vt0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class i0 extends FrameLayout {
    public final /* synthetic */ vt0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(vt0 vt0Var, Context context) {
        super(context);
        this.a = vt0Var;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        vt0 vt0Var = this.a;
        Paint paint = vt0Var.B1;
        o1 o1Var = vt0Var.u1;
        paint.setAlpha((int) ((1.0f - vt0Var.D1) * o1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        float translationY = o1Var.getTranslationY() + vt0Var.c1.getTranslationY() + o1Var.getTop() + r4.getTop();
        float f7 = rectF.left;
        t1 t1Var = vt0Var.v1;
        rectF.set(AndroidUtilities.lerp(f7, t1Var.getLeft(), vt0Var.D1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), vt0Var.D1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), vt0Var.D1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), vt0Var.D1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, vt0Var.D1));
        Paint paint2 = vt0Var.C1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * vt0Var.D1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            vt0 vt0Var = this.a;
            if (vt0Var.E1) {
                vt0Var.A0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
