package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ti1 extends AnimatorListenerAdapter {
    public final /* synthetic */ cj1 a;

    public ti1(cj1 cj1Var) {
        this.a = cj1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        cj1 cj1Var = this.a;
        cj1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        cj1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
