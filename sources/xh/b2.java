package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b2 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ m2 d;

    public b2(m2 m2Var, boolean z10, float f7, float f10) {
        this.d = m2Var;
        this.a = z10;
        this.b = f7;
        this.c = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m2 m2Var = this.d;
        e2 e2Var = m2Var.D;
        j2 j2Var = m2Var.X;
        d2 d2Var = m2Var.x;
        m2Var.i0 = false;
        boolean z10 = this.a;
        if (z10) {
            d2Var.setForceOffsetY(-org.telegram.messenger.i0.L(24.0f));
            d2Var.setTopActionBarOffsetY(-org.telegram.messenger.i0.L(24.0f));
            d2Var.setSwipeOffsetY(0.0f);
        } else {
            m2Var.I();
            m2Var.L();
            float L = org.telegram.messenger.i0.L(24.0f);
            float f7 = this.b;
            d2Var.setForceOffsetY(f7 - L);
            d2Var.setTopActionBarOffsetY(f7 - org.telegram.messenger.i0.L(24.0f));
            d2Var.setSwipeOffsetY(0.0f);
        }
        float f10 = z10 ? m2Var.h0 : 1.0f - m2Var.h0;
        m2Var.g0 = f10;
        j2Var.setAlpha(1.0f - f10);
        j2Var.setTranslationY((-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) * m2Var.g0);
        m2Var.n0.setAlpha(m2Var.g0);
        if (z10) {
            j2Var.setVisibility(8);
        }
        d2Var.setSwipeOffsetAnimationDisallowed(false);
        d2Var.setTranslationX(org.telegram.messenger.i0.T1(this.c, 0.0f, m2Var.h0));
        m2Var.m0.setTranslationX(0.0f);
        m2Var.f.invalidate();
        e2Var.setViewPortHeightOffset(0.0f);
        e2Var.n(true, true);
        m2Var.H();
    }
}
