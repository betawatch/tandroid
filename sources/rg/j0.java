package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.hu0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class j0 extends FrameLayout {
    public final /* synthetic */ hu0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(hu0 hu0Var, Context context) {
        super(context);
        this.a = hu0Var;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        hu0 hu0Var = this.a;
        Paint paint = hu0Var.B1;
        q1 q1Var = hu0Var.u1;
        paint.setAlpha((int) ((1.0f - hu0Var.D1) * q1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        q1Var.b(rectF);
        float translationY = q1Var.getTranslationY() + hu0Var.c1.getTranslationY() + q1Var.getTop() + r4.getTop();
        float f7 = rectF.left;
        v1 v1Var = hu0Var.v1;
        rectF.set(AndroidUtilities.lerp(f7, v1Var.getLeft(), hu0Var.D1), AndroidUtilities.lerp(rectF.top + translationY, v1Var.getTop() - v1Var.getTranslationY(), hu0Var.D1), AndroidUtilities.lerp(rectF.right, v1Var.getRight(), hu0Var.D1), AndroidUtilities.lerp(translationY + rectF.bottom, v1Var.getBottom() - v1Var.getTranslationY(), hu0Var.D1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, hu0Var.D1));
        Paint paint2 = hu0Var.C1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * hu0Var.D1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            hu0 hu0Var = this.a;
            if (hu0Var.E1) {
                hu0Var.A0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
