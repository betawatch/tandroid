package xh;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ m2 f;

    public a2(m2 m2Var, boolean z10, float f7, float f10, float f11, float f12) {
        this.f = m2Var;
        this.a = z10;
        this.b = f7;
        this.c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        m2 m2Var = this.f;
        e2 e2Var = m2Var.D;
        j2 j2Var = m2Var.X;
        d2 d2Var = m2Var.x;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        m2Var.h0 = floatValue;
        if (!this.a) {
            floatValue = 1.0f - floatValue;
        }
        m2Var.g0 = floatValue;
        j2Var.setAlpha(1.0f - floatValue);
        j2Var.setTranslationY((-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) * m2Var.g0);
        float f7 = this.b;
        float f10 = m2Var.h0;
        float f11 = this.c;
        d2Var.setTranslationY(org.telegram.messenger.i0.T1(f7, f11, f10));
        d2Var.setTranslationX(org.telegram.messenger.i0.T1(this.d, 0.0f, m2Var.h0));
        m2Var.m0.setTranslationX(org.telegram.messenger.i0.T1(this.e, 0.0f, m2Var.h0));
        m2Var.n0.setAlpha(m2Var.g0);
        m2Var.f.invalidate();
        e2Var.setViewPortHeightOffset(d2Var.getTranslationY() - f11);
        e2Var.n(false, false);
        m2Var.H();
    }
}
