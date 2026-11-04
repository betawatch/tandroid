package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rp0 extends AnimatorListenerAdapter {
    public final /* synthetic */ sp0 a;

    public rp0(sp0 sp0Var) {
        this.a = sp0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        sp0 sp0Var = this.a;
        PhotoViewer photoViewer = sp0Var.c;
        photoViewer.o4 = 0;
        photoViewer.I1();
        photoViewer.M0.setAlpha(org.telegram.messenger.hs.e4);
        photoViewer.f0.invalidate();
        photoViewer.Q0.setTranslationY(0.0f);
        if (photoViewer.u4) {
            PhotoViewer.b0(photoViewer, sp0Var.b.intValue());
        }
        kq0 kq0Var = sp0Var.a;
        if (kq0Var != null) {
            kq0Var.d();
        }
    }
}
