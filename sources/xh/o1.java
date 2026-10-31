package xh;

import android.animation.ValueAnimator;
import android.graphics.Paint;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class o1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ o1(m2 m2Var, int i10, int i11, int i12) {
        this.a = i12;
        this.b = m2Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m2 m2Var = this.b;
                Paint paint = m2Var.Q;
                paint.setColor(i0.b.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c, this.d));
                m2Var.F();
                m2Var.f.invalidate();
                org.telegram.ui.b3 b3Var = m2Var.Y0;
                if (b3Var != null) {
                    b3Var.b(org.telegram.messenger.i0.B(paint.getColor()) <= 0.721f, false);
                    m2Var.Y0.setBackgroundColor(paint.getColor());
                }
                m2Var.K();
                break;
            default:
                m2 m2Var2 = this.b;
                m2Var2.getClass();
                m2Var2.S = i0.b.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c, this.d);
                m2Var2.l();
                break;
        }
    }
}
