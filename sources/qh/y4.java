package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class y4 extends FrameLayout {
    public float a;
    public float b;
    public final /* synthetic */ dg.e1 c;
    public final /* synthetic */ f9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(f9 f9Var, Context context, dg.e1 e1Var) {
        super(context);
        this.d = f9Var;
        this.c = e1Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = f9Var.u1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ViewGroup barView;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        f9 f9Var = this.d;
        dg.e2 e2Var = f9Var.x1;
        Paint paint = f9Var.v1;
        Paint paint2 = f9Var.u1;
        Paint paint3 = f9Var.w1;
        barView = f9Var.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        int left = barView.getLeft();
        h4 h4Var = f9Var.t1;
        rectF.set(AndroidUtilities.lerp(left, h4Var.getLeft(), f9Var.A1), AndroidUtilities.lerp(barView.getTop(), h4Var.getTop(), f9Var.A1), AndroidUtilities.lerp(barView.getRight(), h4Var.getRight(), f9Var.A1), AndroidUtilities.lerp(barView.getBottom(), h4Var.getBottom(), f9Var.A1));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), f9Var.A1);
        canvas2.drawRoundRect(rectF, lerp, lerp, f9Var.B1);
        if (barView.getChildCount() < 1 || f9Var.A1 == 1.0f) {
            return;
        }
        canvas2.save();
        canvas2.translate(barView.getLeft(), barView.getTop());
        View childAt = barView.getChildAt(0);
        if (barView instanceof eg.i2) {
            childAt = ((eg.i2) barView).getColorClickableView();
        }
        if (childAt.getAlpha() != 0.0f) {
            canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
            paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - f9Var.A1) * 255.0f));
            int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
            int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
            float x10 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
            float y10 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
            int i10 = e2Var.a;
            int i11 = f9Var.W0;
            View view = childAt;
            if (i11 != -1) {
                ViewGroup viewGroup = i11 == 0 ? f9Var.h1 : i11 == 2 ? f9Var.i1 : null;
                View childAt2 = (viewGroup == null ? barView : viewGroup).getChildAt(0);
                if (viewGroup instanceof eg.i2) {
                    childAt2 = ((eg.i2) viewGroup).getColorClickableView();
                }
                x10 = AndroidUtilities.lerp(x10, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), f9Var.X0);
                y10 = AndroidUtilities.lerp(y10, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), f9Var.X0);
            }
            if (h4Var != null && h4Var.getChildCount() > 0) {
                View childAt3 = h4Var.getChildAt(0);
                x10 = AndroidUtilities.lerp(x10, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (h4Var.getX() - barView.getLeft()), f9Var.A1);
                y10 = AndroidUtilities.lerp(y10, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (h4Var.getY() - barView.getTop()), f9Var.A1);
                i10 = i0.a.d(f9Var.A1, e2Var.a, this.c.b(0));
            }
            float f10 = x10;
            float f11 = y10;
            if (f10 != this.a || f11 != this.b) {
                this.a = f10;
                this.b = f11;
                paint2.setShader(new SweepGradient(f10, f11, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
            }
            float min = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
            if (h4Var != null && h4Var.getChildCount() > 0) {
                View childAt4 = h4Var.getChildAt(0);
                min = AndroidUtilities.lerp(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), f9Var.A1);
            }
            float f12 = min;
            rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
            canvas2 = canvas;
            canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
            paint.setColor(i10);
            paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
            paint3.setColor(i10);
            paint3.setAlpha((int) (view.getAlpha() * 255.0f));
            float dp = f12 - AndroidUtilities.dp(3.0f);
            if (h4Var != null && h4Var.getSelectedColorIndex() != 0) {
                dp = AndroidUtilities.lerp(f12 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f12, f9Var.A1);
            }
            eg.c2.x1(f10, f11, dp, paint.getColor(), canvas2);
            if (h4Var != null && h4Var.getSelectedColorIndex() == 0) {
                paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * f9Var.A1));
                canvas2.drawCircle(f10, f11, yh.c(1.0f, f9Var.A1, paint3.getStrokeWidth() + AndroidUtilities.dp(3.0f), f12), paint3);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        g4 g4Var = this.d.R0;
        if (g4Var != null) {
            g4Var.invalidate();
        }
    }
}
