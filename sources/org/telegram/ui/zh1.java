package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class zh1 extends AnimatorListenerAdapter {
    public final /* synthetic */ ii1 a;

    public zh1(ii1 ii1Var) {
        this.a = ii1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ii1 ii1Var = this.a;
        ii1Var.B.setText(LocaleController.getString(R.string.VoipCallEnded));
        ii1Var.B.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
