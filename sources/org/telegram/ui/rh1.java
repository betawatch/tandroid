package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class rh1 extends AnimatorListenerAdapter {
    public final /* synthetic */ ai1 a;

    public rh1(ai1 ai1Var) {
        this.a = ai1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ai1 ai1Var = this.a;
        ai1Var.B.setText(LocaleController.getString(R.string.VoipCallEnded));
        ai1Var.B.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
