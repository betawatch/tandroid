package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class vt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ wt0 a;

    public vt0(wt0 wt0Var) {
        this.a = wt0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        wt0 wt0Var = this.a;
        PhotoViewer photoViewer = wt0Var.c;
        photoViewer.n4 = 0;
        photoViewer.I1();
        photoViewer.L0.setAlpha(255);
        photoViewer.e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.t4) {
            PhotoViewer.b0(photoViewer, wt0Var.b.intValue());
        }
        qu0 qu0Var = wt0Var.a;
        if (qu0Var != null) {
            qu0Var.d();
        }
    }
}
