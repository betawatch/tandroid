package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.bu0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class i0 extends FrameLayout {
    public final /* synthetic */ bu0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(bu0 bu0Var, Context context) {
        super(context);
        this.a = bu0Var;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        bu0 bu0Var = this.a;
        Paint paint = bu0Var.B1;
        o1 o1Var = bu0Var.u1;
        paint.setAlpha((int) ((1.0f - bu0Var.D1) * o1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        float translationY = o1Var.getTranslationY() + bu0Var.c1.getTranslationY() + o1Var.getTop() + r4.getTop();
        float f7 = rectF.left;
        t1 t1Var = bu0Var.v1;
        rectF.set(AndroidUtilities.lerp(f7, t1Var.getLeft(), bu0Var.D1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), bu0Var.D1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), bu0Var.D1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), bu0Var.D1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, bu0Var.D1));
        Paint paint2 = bu0Var.C1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * bu0Var.D1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            bu0 bu0Var = this.a;
            if (bu0Var.E1) {
                bu0Var.A0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
