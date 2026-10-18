package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class sb1 extends AnimatorListenerAdapter {
    public final /* synthetic */ mc1 a;

    public sb1(mc1 mc1Var) {
        this.a = mc1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        mc1 mc1Var = this.a;
        if (mc1Var.W0 == null) {
            mc1Var.J0[0].setVisibility(4);
        }
    }
}
