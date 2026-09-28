package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class yt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ zt0 a;

    public yt0(zt0 zt0Var) {
        this.a = zt0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        zt0 zt0Var = this.a;
        PhotoViewer photoViewer = zt0Var.c;
        photoViewer.n4 = 0;
        photoViewer.F1();
        photoViewer.L0.setAlpha(255);
        photoViewer.e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.t4) {
            PhotoViewer.a0(photoViewer, zt0Var.b.intValue());
        }
        tu0 tu0Var = zt0Var.a;
        if (tu0Var != null) {
            tu0Var.d();
        }
    }
}
