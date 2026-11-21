package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ym extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.cb0 a;

    public ym(org.telegram.ui.Components.cb0 cb0Var) {
        this.a = cb0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.r(1.0f);
    }
}
