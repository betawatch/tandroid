package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class st0 extends AnimatorListenerAdapter {
    public final /* synthetic */ tt0 a;

    public st0(tt0 tt0Var) {
        this.a = tt0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        tt0 tt0Var = this.a;
        PhotoViewer photoViewer = tt0Var.c;
        photoViewer.k4 = 0;
        photoViewer.F1();
        photoViewer.I0.setAlpha(255);
        photoViewer.b0.invalidate();
        photoViewer.M0.setTranslationY(0.0f);
        if (photoViewer.q4) {
            PhotoViewer.a0(photoViewer, tt0Var.b.intValue());
        }
        ou0 ou0Var = tt0Var.a;
        if (ou0Var != null) {
            ou0Var.d();
        }
    }
}
