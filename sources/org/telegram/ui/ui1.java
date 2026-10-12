package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ui1 extends AnimatorListenerAdapter {
    public final /* synthetic */ dj1 a;

    public ui1(dj1 dj1Var) {
        this.a = dj1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        dj1 dj1Var = this.a;
        dj1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        dj1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
