package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class th1 extends AnimatorListenerAdapter {
    public final /* synthetic */ ci1 a;

    public th1(ci1 ci1Var) {
        this.a = ci1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ci1 ci1Var = this.a;
        ci1Var.B.setText(LocaleController.getString(R.string.VoipCallEnded));
        ci1Var.B.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
