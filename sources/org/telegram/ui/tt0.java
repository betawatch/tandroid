package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class tt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ut0 a;

    public tt0(ut0 ut0Var) {
        this.a = ut0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        ut0 ut0Var = this.a;
        PhotoViewer photoViewer = ut0Var.c;
        photoViewer.n4 = 0;
        photoViewer.H1();
        photoViewer.L0.setAlpha(255);
        photoViewer.e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.t4) {
            PhotoViewer.b0(photoViewer, ut0Var.b.intValue());
        }
        ou0 ou0Var = ut0Var.a;
        if (ou0Var != null) {
            ou0Var.d();
        }
    }
}
