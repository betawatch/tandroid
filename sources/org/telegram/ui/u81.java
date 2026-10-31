package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u81 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ m91 e;

    public u81(m91 m91Var, boolean z10, int i10, int i11, boolean z11) {
        this.e = m91Var;
        this.a = z10;
        this.b = i10;
        this.c = i11;
        this.d = z11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m91 m91Var = this.e;
        FrameLayout[] frameLayoutArr = m91Var.M0;
        m91Var.s1 = null;
        int i10 = this.c;
        int i11 = this.b;
        boolean z10 = this.a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = m91Var.b;
        if (i12 == 1 || i12 == 2) {
            m91Var.K0[this.d ? (char) 0 : (char) 2].setVisibility(4);
        } else if (i10 == 1) {
            frameLayoutArr[i11].setAlpha(0.0f);
        }
    }
}
