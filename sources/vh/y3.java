package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y3 extends FrameLayout {
    public float a;
    public float b;
    public final /* synthetic */ ig.s0 c;
    public final /* synthetic */ s7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(s7 s7Var, Context context, ig.s0 s0Var) {
        super(context);
        this.d = s7Var;
        this.c = s0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = s7Var.g1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ViewGroup barView;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        s7 s7Var = this.d;
        ig.q1 q1Var = s7Var.j1;
        Paint paint = s7Var.h1;
        Paint paint2 = s7Var.g1;
        Paint paint3 = s7Var.i1;
        barView = s7Var.getBarView();
        RectF rectF = org.telegram.messenger.i0.P;
        int left = barView.getLeft();
        n3 n3Var = s7Var.f1;
        rectF.set(org.telegram.messenger.i0.W1(s7Var.m1, left, n3Var.getLeft()), org.telegram.messenger.i0.W1(s7Var.m1, barView.getTop(), n3Var.getTop()), org.telegram.messenger.i0.W1(s7Var.m1, barView.getRight(), n3Var.getRight()), org.telegram.messenger.i0.W1(s7Var.m1, barView.getBottom(), n3Var.getBottom()));
        float W1 = org.telegram.messenger.i0.W1(s7Var.m1, org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(24.0f));
        canvas2.drawRoundRect(rectF, W1, W1, s7Var.n1);
        if (barView.getChildCount() < 1 || s7Var.m1 == 1.0f) {
            return;
        }
        canvas2.save();
        canvas2.translate(barView.getLeft(), barView.getTop());
        View childAt = barView.getChildAt(0);
        if (barView instanceof jg.t1) {
            childAt = ((jg.t1) barView).getColorClickableView();
        }
        if (childAt.getAlpha() != 0.0f) {
            canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
            paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - s7Var.m1) * 255.0f));
            int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
            int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
            float x10 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
            float y3 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
            int i10 = q1Var.a;
            int i11 = s7Var.I0;
            View view = childAt;
            if (i11 != -1) {
                ViewGroup viewGroup = i11 == 0 ? s7Var.T0 : i11 == 2 ? s7Var.U0 : null;
                View childAt2 = (viewGroup == null ? barView : viewGroup).getChildAt(0);
                if (viewGroup instanceof jg.t1) {
                    childAt2 = ((jg.t1) viewGroup).getColorClickableView();
                }
                x10 = org.telegram.messenger.i0.T1(x10, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), s7Var.J0);
                y3 = org.telegram.messenger.i0.T1(y3, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), s7Var.J0);
            }
            if (n3Var != null && n3Var.getChildCount() > 0) {
                View childAt3 = n3Var.getChildAt(0);
                x10 = org.telegram.messenger.i0.T1(x10, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (n3Var.getX() - barView.getLeft()), s7Var.m1);
                y3 = org.telegram.messenger.i0.T1(y3, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (n3Var.getY() - barView.getTop()), s7Var.m1);
                i10 = i0.b.f(s7Var.m1, q1Var.a, this.c.b(0));
            }
            float f7 = x10;
            float f10 = y3;
            if (f7 != this.a || f10 != this.b) {
                this.a = f7;
                this.b = f10;
                paint2.setShader(new SweepGradient(f7, f10, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
            }
            float min = (Math.min(width, height) / 2.0f) - org.telegram.messenger.i0.L(0.5f);
            if (n3Var != null && n3Var.getChildCount() > 0) {
                View childAt4 = n3Var.getChildAt(0);
                min = org.telegram.messenger.i0.T1(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - org.telegram.messenger.i0.L(2.0f), s7Var.m1);
            }
            float f11 = min;
            rectF.set(f7 - f11, f10 - f11, f7 + f11, f10 + f11);
            canvas2 = canvas;
            canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
            paint.setColor(i10);
            paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
            paint3.setColor(i10);
            paint3.setAlpha((int) (view.getAlpha() * 255.0f));
            float L = f11 - org.telegram.messenger.i0.L(3.0f);
            if (n3Var != null && n3Var.getSelectedColorIndex() != 0) {
                L = org.telegram.messenger.i0.T1(f11 - org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(2.0f) + f11, s7Var.m1);
            }
            jg.n1.A1(f7, f10, L, paint.getColor(), canvas2);
            if (n3Var != null && n3Var.getSelectedColorIndex() == 0) {
                paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * s7Var.m1));
                canvas2.drawCircle(f7, f10, sc.e.z(1.0f, s7Var.m1, paint3.getStrokeWidth() + org.telegram.messenger.i0.L(3.0f), f11), paint3);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        m3 m3Var = this.d.D0;
        if (m3Var != null) {
            m3Var.invalidate();
        }
    }
}
