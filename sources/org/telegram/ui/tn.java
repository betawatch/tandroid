package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class tn extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.vc0 a;

    public tn(org.telegram.ui.Components.vc0 vc0Var) {
        this.a = vc0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.r(1.0f);
    }
}
