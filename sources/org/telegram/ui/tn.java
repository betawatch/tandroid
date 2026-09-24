package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class tn extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.mc0 a;

    public tn(org.telegram.ui.Components.mc0 mc0Var) {
        this.a = mc0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.s(1.0f);
    }
}
