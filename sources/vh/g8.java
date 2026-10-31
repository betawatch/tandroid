package vh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.oh;
import org.telegram.ui.Components.x60;
import org.telegram.ui.do0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g8 extends FrameLayout {
    public float a;
    public float b;
    public final Paint c;
    public LinearGradient d;
    public final /* synthetic */ o8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(o8 o8Var, Activity activity) {
        super(activity);
        this.e = o8Var;
        this.c = new Paint(1);
    }

    public static void a(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
    }

    public final void b(float f7) {
        float f10 = this.a;
        this.b = f7;
        super.setTranslationY(f10 + f7);
    }

    public final void c() {
        if (this.e.J == 0) {
            setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean drawChild = super.drawChild(canvas, view, j10);
        o8 o8Var = this.e;
        if (view == o8Var.h0) {
            float f7 = o8Var.V ? org.telegram.messenger.i0.m : 0.0f;
            LinearGradient linearGradient = this.d;
            Paint paint = this.c;
            if (linearGradient == null) {
                LinearGradient linearGradient2 = new LinearGradient(0.0f, f7, 0.0f, f7 + org.telegram.messenger.i0.L(72.0f), new int[]{TLObject.FLAG_30, 0}, new float[]{f7 / (org.telegram.messenger.i0.L(72.0f) + f7), 1.0f}, Shader.TileMode.CLAMP);
                this.d = linearGradient2;
                paint.setShader(linearGradient2);
            }
            paint.setAlpha(zs.e4);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, getWidth(), org.telegram.messenger.i0.L(84.0f) + f7);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), paint);
        }
        return drawChild;
    }

    @Override // android.view.View
    public final void invalidate() {
        ValueAnimator valueAnimator = this.e.E;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        o8 o8Var = this.e;
        int i14 = o8Var.V ? o8Var.Z : 0;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        o8Var.h0.layout(0, 0, o8Var.S, o8Var.T);
        o8Var.h0.setPivotX(o8Var.S * 0.5f);
        FrameLayout frameLayout = o8Var.i0;
        frameLayout.layout(0, i14, o8Var.S, frameLayout.getMeasuredHeight() + i14);
        FrameLayout frameLayout2 = o8Var.k0;
        frameLayout2.layout(0, o8Var.T - frameLayout2.getMeasuredHeight(), o8Var.S, o8Var.T);
        FrameLayout frameLayout3 = o8Var.m0;
        int i15 = o8Var.T;
        frameLayout3.layout(0, i15, o8Var.S, frameLayout3.getMeasuredHeight() + i15);
        o8Var.l0.layout(0, 0, o8Var.S, o8Var.T);
        do0 do0Var = o8Var.t0;
        if (do0Var != null) {
            do0Var.layout(0, 0, measuredWidth, measuredHeight);
        }
        o8Var.s.c.layout(0, 0, measuredWidth, measuredHeight);
        oh ohVar = o8Var.c1.M;
        if (ohVar != null) {
            ohVar.layout(0, 0, o8Var.S, o8Var.T);
            o8Var.c1.y();
        }
        oe0 oe0Var = o8Var.B1;
        if (oe0Var != null) {
            oe0Var.layout(0, 0, oe0Var.getMeasuredWidth(), o8Var.B1.getMeasuredHeight());
        }
        s7 s7Var = o8Var.v1;
        if (s7Var != null) {
            s7Var.layout(0, 0, s7Var.getMeasuredWidth(), o8Var.v1.getMeasuredHeight());
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt instanceof x60) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            }
        }
        setPivotX(measuredWidth / 2.0f);
        setPivotY((-measuredHeight) * 0.2f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        o8 o8Var = this.e;
        a(o8Var.h0, o8Var.S, o8Var.T);
        o8Var.i();
        a(o8Var.i0, o8Var.S, org.telegram.messenger.i0.L(150.0f));
        a(o8Var.k0, o8Var.S, org.telegram.messenger.i0.L(220.0f));
        a(o8Var.m0, o8Var.S, o8Var.U);
        a(o8Var.l0, o8Var.S, o8Var.T);
        a(o8Var.s.c, size, size2);
        do0 do0Var = o8Var.t0;
        if (do0Var != null) {
            a(do0Var, size, size2);
        }
        oh ohVar = o8Var.c1.M;
        if (ohVar != null) {
            a(ohVar, o8Var.S, o8Var.T);
        }
        oe0 oe0Var = o8Var.B1;
        if (oe0Var != null) {
            a(oe0Var, size, size2);
        }
        s7 s7Var = o8Var.v1;
        if (s7Var != null) {
            a(s7Var, size, size2);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof x60) {
                a(childAt, size, size2);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        this.a = f7;
        super.setTranslationY(this.b + f7);
        float i10 = Utilities.i((f7 / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        o8 o8Var = this.e;
        o8Var.K = i10;
        o8Var.n();
        o8Var.n.invalidate();
        float i11 = 1.0f - (Utilities.i(getTranslationY() / org.telegram.messenger.i0.L(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(i11);
        setScaleY(i11);
    }
}
