// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class v58 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ d68 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v58(d68 d68Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = d68Var;
        this.c = activity2;
        this.a = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        d68 d68Var = this.d;
        Paint paint = d68Var.u1;
        int i = d68Var.v1 - d68Var.t0;
        int L = gm.L(30.0f) + getMeasuredHeight() + d68Var.t0;
        float L2 = gm.L(12.0f);
        int i2 = d68Var.t0;
        float min = ((float) (i + i2)) < L2 ? 1.0f - Math.min(1.0f, ((L2 - i) - i2) / L2) : 1.0f;
        int i3 = gm.m;
        int i4 = i + i3;
        d68Var.s0.setBounds(0, i4, getMeasuredWidth(), L - i3);
        d68Var.s0.draw(canvas);
        if (min != 1.0f) {
            paint.setColor(cmb.v0(cmb.g5, d68Var.J0));
            float f = d68Var.u0;
            float f2 = d68Var.t0 + i4;
            float measuredWidth = getMeasuredWidth() - d68Var.u0;
            float L3 = gm.L(24.0f) + d68Var.t0 + i4;
            RectF rectF = this.a;
            rectF.set(f, f2, measuredWidth, L3);
            float f3 = L2 * min;
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        int v0 = cmb.v0(cmb.g5, d68Var.J0);
        paint.setColor(Color.argb((int) (d68Var.o1.getAlpha() * 255.0f), (int) (Color.red(v0) * 0.8f), (int) (Color.green(v0) * 0.8f), (int) (Color.blue(v0) * 0.8f)));
        canvas.drawRect(d68Var.u0, 0.0f, getMeasuredWidth() - d68Var.u0, gm.m, paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            d68 d68Var = this.d;
            if (d68Var.v1 != 0 && motionEvent.getY() < d68Var.v1 && d68Var.o1.getAlpha() == 0.0f) {
                d68Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        d68 d68Var = this.d;
        d68Var.t1 = true;
        super.onLayout(z, i, i2, i3, i4);
        d68Var.t1 = false;
        d68Var.E0(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        this.b = true;
        d68 d68Var = this.d;
        w58 w58Var = d68Var.m1;
        int i3 = d68Var.u0;
        setPadding(i3, gm.m, i3, 0);
        this.b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i);
        ((FrameLayout.LayoutParams) d68Var.p1.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        this.b = true;
        int L = gm.L(80.0f);
        lj4 lj4Var = d68Var.l1;
        int i4 = ((d68) lj4Var.a).y1;
        for (int i5 = 0; i5 < i4; i5++) {
            ViewGroup k = lj4Var.k(this.c, i5);
            k.measure(i, 0);
            L += k.getMeasuredHeight();
        }
        int i6 = L < paddingTop ? paddingTop - L : paddingTop / 5;
        if (w58Var.getPaddingTop() != i6) {
            w58Var.getPaddingTop();
            w58Var.setPadding(0, i6, 0, 0);
        }
        this.b = false;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.d.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.b) {
            return;
        }
        super.requestLayout();
    }
}
