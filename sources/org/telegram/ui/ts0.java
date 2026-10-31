package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ts0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ at0 b;

    public /* synthetic */ ts0(at0 at0Var, int i10) {
        this.a = i10;
        this.b = at0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.R.setTranslationY(0.0f);
                break;
            case 1:
                this.b.R.setTranslationY(0.0f);
                break;
            default:
                at0 at0Var = this.b;
                at0Var.getClass();
                at0Var.R.setTranslationY(0.0f);
                at0Var.p0();
                break;
        }
    }
}
