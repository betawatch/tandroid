// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class ow7 extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wab b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow7(wab wabVar, Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 1:
                this.b = wabVar;
                super(context);
                break;
            default:
                this.b = wabVar;
                setWillNotDraw(false);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                if (this.b.a2) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.onDraw(canvas);
                wab wabVar = this.b;
                Paint paint = wabVar.b1;
                nv7 nv7Var = wabVar.V0;
                paint.setAlpha((int) ((1.0f - wabVar.d1) * nv7Var.getAlpha() * 20.0f));
                RectF rectF = hl.P;
                nv7Var.b(rectF);
                float translationY = nv7Var.getTranslationY() + wabVar.D0.getTranslationY() + nv7Var.getTop() + r3.getTop();
                float f = rectF.left;
                zv7 zv7Var = wabVar.W0;
                rectF.set(hl.R1(f, zv7Var.getLeft(), wabVar.d1), hl.R1(rectF.top + translationY, zv7Var.getTop() - zv7Var.getTranslationY(), wabVar.d1), hl.R1(rectF.right, zv7Var.getRight(), wabVar.d1), hl.R1(translationY + rectF.bottom, zv7Var.getBottom() - zv7Var.getTranslationY(), wabVar.d1));
                float L = hl.L(hl.U1(wabVar.d1, 32, 16));
                Paint paint2 = wabVar.c1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * wabVar.d1));
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
                    wab wabVar = this.b;
                    if (wabVar.e1) {
                        wabVar.O0(false);
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            default:
                return false;
        }
    }
}
