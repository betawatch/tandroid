// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class w0 extends LinearLayout {
    public final /* synthetic */ byte a = 1;
    public final RectF b;
    public final RectF c;
    public final RectF d;
    public final Paint e;
    public final /* synthetic */ ylb f;
    public final /* synthetic */ FrameLayout h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(z0 z0Var, Context context, ylb ylbVar) {
        super(context);
        this.h = z0Var;
        this.f = ylbVar;
        this.b = new RectF();
        this.c = new RectF();
        this.d = new RectF();
        this.e = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float e;
        float e2;
        float f;
        float f2;
        float f3;
        byte b = this.a;
        ylb ylbVar = this.f;
        FrameLayout frameLayout = this.h;
        RectF rectF = this.b;
        RectF rectF2 = this.c;
        RectF rectF3 = this.d;
        Paint paint = this.e;
        switch (b) {
            case 0:
                z0 z0Var = (z0) frameLayout;
                ln lnVar = z0Var.s;
                if (lnVar == null) {
                    e = 1.0f;
                } else {
                    e = lnVar.e(false, z0Var.h >= 0 ? 1.0f : 0.0f);
                }
                ln lnVar2 = z0Var.n;
                if (lnVar2 == null) {
                    e2 = 0.0f;
                } else {
                    int i = z0Var.h;
                    if (i < 0) {
                        i = z0Var.r;
                    }
                    e2 = lnVar2.e(false, i);
                }
                double d = e2;
                float f4 = e2;
                int floor = (int) Math.floor(d);
                int ceil = (int) Math.ceil(d);
                float f5 = f4 - floor;
                if (floor < 0 || floor >= getChildCount()) {
                    f = 0.0f;
                    f2 = 1.0f;
                } else {
                    View childAt = getChildAt(floor);
                    f2 = 1.0f;
                    f = 0.0f;
                    rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                }
                if (ceil >= 0 && ceil < getChildCount()) {
                    View childAt2 = getChildAt(ceil);
                    rectF2.set(childAt2.getLeft(), childAt2.getTop(), childAt2.getRight(), childAt2.getBottom());
                }
                gm.X1(rectF, rectF2, f5, rectF3);
                paint.setColor(cmb.p1(e * 0.1f, cmb.v0(cmb.Ei, ylbVar)));
                if (e > f) {
                    canvas.drawRoundRect(rectF3, gm.L(z0Var.e), gm.L(z0Var.e), paint);
                }
                int i2 = 0;
                while (i2 < getChildCount()) {
                    View childAt3 = getChildAt(i2);
                    if (childAt3 instanceof y0) {
                        f3 = f;
                        ((y0) childAt3).b(false, Math.max(f3, f2 - Math.abs(i2 - f4)) * e);
                    } else {
                        f3 = f;
                    }
                    i2++;
                    f = f3;
                }
                super.dispatchDraw(canvas);
                break;
            default:
                boc bocVar = (boc) frameLayout;
                float e3 = bocVar.f.e(false, bocVar.d);
                double d2 = e3;
                int floor2 = (int) Math.floor(d2);
                TextView[] textViewArr = bocVar.c;
                int j = Utilities.j(floor2, textViewArr.length, 0);
                int j2 = Utilities.j((int) Math.ceil(d2), textViewArr.length, 0);
                if (j >= 0 && j < textViewArr.length) {
                    TextView textView = textViewArr[j];
                    rectF.set(textView.getX(), textView.getY(), textView.getX() + textView.getWidth(), textView.getY() + textView.getHeight());
                }
                if (j2 >= 0 && j2 < textViewArr.length) {
                    TextView textView2 = textViewArr[j2];
                    rectF2.set(textView2.getX(), textView2.getY(), textView2.getX() + textView2.getWidth(), textView2.getY() + textView2.getHeight());
                }
                gm.X1(rectF, rectF2, e3 - j, rectF3);
                paint.setColor(cmb.p1(0.1f, cmb.v0(cmb.Ei, ylbVar)));
                canvas.drawRoundRect(rectF3, gm.L(14.0f), gm.L(14.0f), paint);
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        switch (this.a) {
            case 0:
                boolean z = getOrientation() == 0;
                int size = z ? View.MeasureSpec.getSize(i) : View.MeasureSpec.getSize(i2);
                int i5 = 0;
                int i6 = 0;
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    childAt.setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
                    if (z) {
                        i4 = i2;
                        i3 = 0;
                    } else {
                        i3 = i;
                        i4 = 0;
                    }
                    childAt.measure(i3, i4);
                    int measuredWidth = z ? childAt.getMeasuredWidth() : childAt.getMeasuredHeight();
                    i6 = Math.max(i6, measuredWidth);
                    i5 += measuredWidth;
                }
                boolean z2 = i5 <= size && ((float) i6) < ((float) size) / ((float) getChildCount());
                for (int i8 = 0; i8 < getChildCount(); i8++) {
                    View childAt2 = getChildAt(i8);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                    childAt2.setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
                    if (z2) {
                        if (z) {
                            layoutParams.width = 0;
                        } else {
                            layoutParams.height = 0;
                        }
                        layoutParams.weight = 1.0f;
                    } else {
                        if (z) {
                            layoutParams.width = -2;
                        } else {
                            layoutParams.height = -2;
                        }
                        layoutParams.weight = 0.0f;
                    }
                }
                super.onMeasure(i, i2);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(boc bocVar, Context context, ylb ylbVar) {
        super(context);
        this.h = bocVar;
        this.f = ylbVar;
        this.b = new RectF();
        this.c = new RectF();
        this.d = new RectF();
        this.e = new Paint(1);
    }
}
