package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ys0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class h0 extends FrameLayout {
    public final /* synthetic */ ys0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ys0 ys0Var, Context context) {
        super(context);
        this.a = ys0Var;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ys0 ys0Var = this.a;
        Paint paint = ys0Var.x1;
        o1 o1Var = ys0Var.q1;
        paint.setAlpha((int) ((1.0f - ys0Var.z1) * o1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        float translationY = o1Var.getTranslationY() + ys0Var.Y0.getTranslationY() + o1Var.getTop() + r4.getTop();
        float f10 = rectF.left;
        t1 t1Var = ys0Var.r1;
        rectF.set(AndroidUtilities.lerp(f10, t1Var.getLeft(), ys0Var.z1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), ys0Var.z1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), ys0Var.z1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), ys0Var.z1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, ys0Var.z1));
        Paint paint2 = ys0Var.y1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * ys0Var.z1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            ys0 ys0Var = this.a;
            if (ys0Var.A1) {
                ys0Var.z0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
