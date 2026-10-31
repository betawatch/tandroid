package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m3 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ s7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(s7 s7Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = s7Var;
                super(context);
                break;
            default:
                this.b = s7Var;
                setWillNotDraw(false);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                if (this.b.V1) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.onDraw(canvas);
                s7 s7Var = this.b;
                Paint paint = s7Var.a1;
                jg.t1 t1Var = s7Var.U0;
                paint.setAlpha((int) ((1.0f - s7Var.c1) * t1Var.getAlpha() * 20.0f));
                RectF rectF = org.telegram.messenger.i0.P;
                t1Var.b(rectF);
                float translationY = t1Var.getTranslationY() + s7Var.C0.getTranslationY() + t1Var.getTop() + r4.getTop();
                float f7 = rectF.left;
                jg.a2 a2Var = s7Var.V0;
                rectF.set(org.telegram.messenger.i0.T1(f7, a2Var.getLeft(), s7Var.c1), org.telegram.messenger.i0.T1(rectF.top + translationY, a2Var.getTop() - a2Var.getTranslationY(), s7Var.c1), org.telegram.messenger.i0.T1(rectF.right, a2Var.getRight(), s7Var.c1), org.telegram.messenger.i0.T1(translationY + rectF.bottom, a2Var.getBottom() - a2Var.getTranslationY(), s7Var.c1));
                float L = org.telegram.messenger.i0.L(org.telegram.messenger.i0.W1(s7Var.c1, 32, 16));
                Paint paint2 = s7Var.b1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * s7Var.c1));
                canvas.drawRoundRect(rectF, L, L, paint2);
                paint2.setAlpha(alpha);
                canvas.drawRoundRect(rectF, L, L, paint);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0) {
                    s7 s7Var = this.b;
                    if (s7Var.d1) {
                        s7Var.M0(false);
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            default:
                return false;
        }
    }
}
