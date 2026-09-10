package pg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class i0 extends FrameLayout {
    public final /* synthetic */ zt0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(zt0 zt0Var, Context context) {
        super(context);
        this.a = zt0Var;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        zt0 zt0Var = this.a;
        Paint paint = zt0Var.B1;
        o1 o1Var = zt0Var.u1;
        paint.setAlpha((int) ((1.0f - zt0Var.D1) * o1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        float translationY = o1Var.getTranslationY() + zt0Var.c1.getTranslationY() + o1Var.getTop() + r4.getTop();
        float f7 = rectF.left;
        t1 t1Var = zt0Var.v1;
        rectF.set(AndroidUtilities.lerp(f7, t1Var.getLeft(), zt0Var.D1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), zt0Var.D1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), zt0Var.D1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), zt0Var.D1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, zt0Var.D1));
        Paint paint2 = zt0Var.C1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * zt0Var.D1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            zt0 zt0Var = this.a;
            if (zt0Var.E1) {
                zt0Var.z0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
