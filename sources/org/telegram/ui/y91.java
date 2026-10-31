package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z91 b;

    public /* synthetic */ y91(z91 z91Var, int i10) {
        this.a = i10;
        this.b = z91Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.b.s.setVisibility(8);
                break;
            default:
                this.b.b.a.setVisibility(8);
                break;
        }
    }
}
