package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class yn extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.dc0 a;

    public yn(org.telegram.ui.Components.dc0 dc0Var) {
        this.a = dc0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.s(1.0f);
    }
}
