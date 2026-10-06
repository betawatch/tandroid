package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class uc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ pd1 a;

    public uc1(pd1 pd1Var) {
        this.a = pd1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        pd1 pd1Var = this.a;
        pd1Var.J0[pd1Var.W0 != null ? (char) 0 : (char) 2].setVisibility(4);
    }
}
