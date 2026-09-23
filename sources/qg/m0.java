package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.tt0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class m0 extends FrameLayout {
    public float a;
    public float b;
    public final /* synthetic */ tt0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(tt0 tt0Var, Context context) {
        super(context);
        this.c = tt0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = tt0Var.H1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ViewGroup barView;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        tt0 tt0Var = this.c;
        pg.r1 r1Var = tt0Var.K1;
        Paint paint = tt0Var.I1;
        Paint paint2 = tt0Var.H1;
        Paint paint3 = tt0Var.J1;
        barView = tt0Var.getBarView();
        Rect rect = AndroidUtilities.rectTmp2;
        int left = barView.getLeft();
        l0 l0Var = tt0Var.G1;
        rect.set(AndroidUtilities.lerp(left, l0Var.getLeft(), tt0Var.N1), AndroidUtilities.lerp(barView.getTop(), l0Var.getTop(), tt0Var.N1), AndroidUtilities.lerp(barView.getRight(), l0Var.getRight(), tt0Var.N1), AndroidUtilities.lerp(barView.getBottom(), l0Var.getBottom(), tt0Var.N1));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), tt0Var.N1);
        if (tt0Var.c2 != null) {
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            tt0Var.c2.q(lerp);
            tt0Var.c2.setBounds(rect);
            tt0Var.c2.draw(canvas2);
        } else {
            canvas2.drawRoundRect(rectF, lerp, lerp, tt0Var.O1);
        }
        if (barView.getChildCount() < 1 || tt0Var.N1 == 1.0f) {
            return;
        }
        canvas2.save();
        canvas2.translate(barView.getLeft(), barView.getTop());
        View childAt = barView.getChildAt(0);
        if (barView instanceof r1) {
            childAt = ((r1) barView).getColorClickableView();
        }
        if (childAt.getAlpha() != 0.0f) {
            canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
            paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - tt0Var.N1) * 255.0f));
            int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
            int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
            float x10 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
            float y3 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
            int i10 = r1Var.a;
            int i11 = tt0Var.h1;
            View view = childAt;
            if (i11 != -1) {
                ViewGroup viewGroup = i11 == 0 ? tt0Var.t1 : i11 == 2 ? tt0Var.u1 : null;
                View childAt2 = (viewGroup == null ? barView : viewGroup).getChildAt(0);
                if (viewGroup instanceof r1) {
                    childAt2 = ((r1) viewGroup).getColorClickableView();
                }
                x10 = AndroidUtilities.lerp(x10, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), tt0Var.i1);
                y3 = AndroidUtilities.lerp(y3, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), tt0Var.i1);
            }
            if (l0Var != null && l0Var.getChildCount() > 0) {
                View childAt3 = l0Var.getChildAt(0);
                x10 = AndroidUtilities.lerp(x10, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (l0Var.getX() - barView.getLeft()), tt0Var.N1);
                y3 = AndroidUtilities.lerp(y3, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (l0Var.getY() - barView.getTop()), tt0Var.N1);
                i10 = i0.a.d(tt0Var.N1, r1Var.a, tt0Var.V1.b(0));
            }
            float f7 = x10;
            float f10 = y3;
            if (f7 != this.a || f10 != this.b) {
                this.a = f7;
                this.b = f10;
                paint2.setShader(new SweepGradient(f7, f10, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
            }
            float min = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
            if (l0Var != null && l0Var.getChildCount() > 0) {
                View childAt4 = l0Var.getChildAt(0);
                min = AndroidUtilities.lerp(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), tt0Var.N1);
            }
            float f11 = min;
            rectF.set(f7 - f11, f10 - f11, f7 + f11, f10 + f11);
            canvas2 = canvas;
            canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
            paint.setColor(i10);
            paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
            paint3.setColor(i10);
            paint3.setAlpha((int) (view.getAlpha() * 255.0f));
            float dp = f11 - AndroidUtilities.dp(3.0f);
            if (l0Var != null && l0Var.getSelectedColorIndex() != 0) {
                dp = AndroidUtilities.lerp(f11 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f11, tt0Var.N1);
            }
            l1.x1(f7, f10, dp, paint.getColor(), canvas2);
            if (l0Var != null && l0Var.getSelectedColorIndex() == 0) {
                paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * tt0Var.N1));
                canvas2.drawCircle(f7, f10, com.google.android.gms.internal.vision.e2.b(1.0f, tt0Var.N1, paint3.getStrokeWidth() + AndroidUtilities.dp(3.0f), f11), paint3);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        k0 k0Var = this.c.d1;
        if (k0Var != null) {
            k0Var.invalidate();
        }
    }
}
