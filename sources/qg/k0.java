package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.cu0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class k0 extends FrameLayout {
    public final /* synthetic */ cu0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(cu0 cu0Var, Context context) {
        super(context);
        this.a = cu0Var;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        cu0 cu0Var = this.a;
        Paint paint = cu0Var.B1;
        r1 r1Var = cu0Var.u1;
        paint.setAlpha((int) ((1.0f - cu0Var.D1) * r1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        r1Var.b(rectF);
        float translationY = r1Var.getTranslationY() + cu0Var.c1.getTranslationY() + r1Var.getTop() + r4.getTop();
        float f7 = rectF.left;
        w1 w1Var = cu0Var.v1;
        rectF.set(AndroidUtilities.lerp(f7, w1Var.getLeft(), cu0Var.D1), AndroidUtilities.lerp(rectF.top + translationY, w1Var.getTop() - w1Var.getTranslationY(), cu0Var.D1), AndroidUtilities.lerp(rectF.right, w1Var.getRight(), cu0Var.D1), AndroidUtilities.lerp(translationY + rectF.bottom, w1Var.getBottom() - w1Var.getTranslationY(), cu0Var.D1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, cu0Var.D1));
        Paint paint2 = cu0Var.C1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * cu0Var.D1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            cu0 cu0Var = this.a;
            if (cu0Var.E1) {
                cu0Var.z0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
