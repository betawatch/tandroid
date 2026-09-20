package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.au0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class j0 extends FrameLayout {
    public final /* synthetic */ au0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(au0 au0Var, Context context) {
        super(context);
        this.a = au0Var;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        au0 au0Var = this.a;
        Paint paint = au0Var.B1;
        p1 p1Var = au0Var.u1;
        paint.setAlpha((int) ((1.0f - au0Var.D1) * p1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        p1Var.b(rectF);
        float translationY = p1Var.getTranslationY() + au0Var.c1.getTranslationY() + p1Var.getTop() + r4.getTop();
        float f7 = rectF.left;
        u1 u1Var = au0Var.v1;
        rectF.set(AndroidUtilities.lerp(f7, u1Var.getLeft(), au0Var.D1), AndroidUtilities.lerp(rectF.top + translationY, u1Var.getTop() - u1Var.getTranslationY(), au0Var.D1), AndroidUtilities.lerp(rectF.right, u1Var.getRight(), au0Var.D1), AndroidUtilities.lerp(translationY + rectF.bottom, u1Var.getBottom() - u1Var.getTranslationY(), au0Var.D1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, au0Var.D1));
        Paint paint2 = au0Var.C1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * au0Var.D1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            au0 au0Var = this.a;
            if (au0Var.E1) {
                au0Var.z0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
