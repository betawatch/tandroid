package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.tt0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class k0 extends FrameLayout {
    public final /* synthetic */ tt0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(tt0 tt0Var, Context context) {
        super(context);
        this.a = tt0Var;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        tt0 tt0Var = this.a;
        Paint paint = tt0Var.B1;
        r1 r1Var = tt0Var.u1;
        paint.setAlpha((int) ((1.0f - tt0Var.D1) * r1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        r1Var.b(rectF);
        float translationY = r1Var.getTranslationY() + tt0Var.c1.getTranslationY() + r1Var.getTop() + r4.getTop();
        float f7 = rectF.left;
        w1 w1Var = tt0Var.v1;
        rectF.set(AndroidUtilities.lerp(f7, w1Var.getLeft(), tt0Var.D1), AndroidUtilities.lerp(rectF.top + translationY, w1Var.getTop() - w1Var.getTranslationY(), tt0Var.D1), AndroidUtilities.lerp(rectF.right, w1Var.getRight(), tt0Var.D1), AndroidUtilities.lerp(translationY + rectF.bottom, w1Var.getBottom() - w1Var.getTranslationY(), tt0Var.D1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, tt0Var.D1));
        Paint paint2 = tt0Var.C1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * tt0Var.D1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            tt0 tt0Var = this.a;
            if (tt0Var.E1) {
                tt0Var.A0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
