package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.it0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class h0 extends FrameLayout {
    public final /* synthetic */ it0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(it0 it0Var, Context context) {
        super(context);
        this.a = it0Var;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        it0 it0Var = this.a;
        Paint paint = it0Var.B1;
        o1 o1Var = it0Var.u1;
        paint.setAlpha((int) ((1.0f - it0Var.D1) * o1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        float translationY = o1Var.getTranslationY() + it0Var.c1.getTranslationY() + o1Var.getTop() + r4.getTop();
        float f7 = rectF.left;
        t1 t1Var = it0Var.v1;
        rectF.set(AndroidUtilities.lerp(f7, t1Var.getLeft(), it0Var.D1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), it0Var.D1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), it0Var.D1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), it0Var.D1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, it0Var.D1));
        Paint paint2 = it0Var.C1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * it0Var.D1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            it0 it0Var = this.a;
            if (it0Var.E1) {
                it0Var.A0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
