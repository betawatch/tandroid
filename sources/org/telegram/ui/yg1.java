package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class yg1 extends AnimatorListenerAdapter {
    public final /* synthetic */ hh1 a;

    public yg1(hh1 hh1Var) {
        this.a = hh1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        hh1 hh1Var = this.a;
        hh1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        hh1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
