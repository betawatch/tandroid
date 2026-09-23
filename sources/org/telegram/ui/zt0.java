package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class zt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ au0 a;

    public zt0(au0 au0Var) {
        this.a = au0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        au0 au0Var = this.a;
        PhotoViewer photoViewer = au0Var.c;
        photoViewer.n4 = 0;
        photoViewer.F1();
        photoViewer.L0.setAlpha(255);
        photoViewer.e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.t4) {
            PhotoViewer.a0(photoViewer, au0Var.b.intValue());
        }
        uu0 uu0Var = au0Var.a;
        if (uu0Var != null) {
            uu0Var.d();
        }
    }
}
