package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qi1 extends AnimatorListenerAdapter {
    public final /* synthetic */ zi1 a;

    public qi1(zi1 zi1Var) {
        this.a = zi1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zi1 zi1Var = this.a;
        zi1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        zi1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
