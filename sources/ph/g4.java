package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class g4 extends FrameLayout {
    public final /* synthetic */ h9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(h9 h9Var, Context context) {
        super(context);
        this.a = h9Var;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        h9 h9Var = this.a;
        Paint paint = h9Var.o1;
        dg.k2 k2Var = h9Var.i1;
        paint.setAlpha((int) ((1.0f - h9Var.q1) * k2Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        k2Var.b(rectF);
        float translationY = k2Var.getTranslationY() + h9Var.Q0.getTranslationY() + k2Var.getTop() + r4.getTop();
        float f10 = rectF.left;
        dg.q2 q2Var = h9Var.j1;
        rectF.set(AndroidUtilities.lerp(f10, q2Var.getLeft(), h9Var.q1), AndroidUtilities.lerp(rectF.top + translationY, q2Var.getTop() - q2Var.getTranslationY(), h9Var.q1), AndroidUtilities.lerp(rectF.right, q2Var.getRight(), h9Var.q1), AndroidUtilities.lerp(translationY + rectF.bottom, q2Var.getBottom() - q2Var.getTranslationY(), h9Var.q1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, h9Var.q1));
        Paint paint2 = h9Var.p1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * h9Var.q1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            h9 h9Var = this.a;
            if (h9Var.r1) {
                h9Var.P0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
