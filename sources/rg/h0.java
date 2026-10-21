package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.gt0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class h0 extends FrameLayout {
    public final /* synthetic */ gt0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(gt0 gt0Var, Context context) {
        super(context);
        this.a = gt0Var;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        gt0 gt0Var = this.a;
        Paint paint = gt0Var.B1;
        o1 o1Var = gt0Var.u1;
        paint.setAlpha((int) ((1.0f - gt0Var.D1) * o1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        float translationY = o1Var.getTranslationY() + gt0Var.c1.getTranslationY() + o1Var.getTop() + r4.getTop();
        float f7 = rectF.left;
        t1 t1Var = gt0Var.v1;
        rectF.set(AndroidUtilities.lerp(f7, t1Var.getLeft(), gt0Var.D1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), gt0Var.D1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), gt0Var.D1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), gt0Var.D1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, gt0Var.D1));
        Paint paint2 = gt0Var.C1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * gt0Var.D1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            gt0 gt0Var = this.a;
            if (gt0Var.E1) {
                gt0Var.A0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
