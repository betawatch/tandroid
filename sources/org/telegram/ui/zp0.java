package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class zp0 extends AnimatorListenerAdapter {
    public final /* synthetic */ aq0 a;

    public zp0(aq0 aq0Var) {
        this.a = aq0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        aq0 aq0Var = this.a;
        PhotoViewer photoViewer = aq0Var.c;
        photoViewer.n4 = 0;
        photoViewer.D1();
        photoViewer.M0.setAlpha(org.telegram.messenger.ns.e4);
        photoViewer.f0.invalidate();
        photoViewer.Q0.setTranslationY(0.0f);
        if (photoViewer.t4) {
            PhotoViewer.T(photoViewer, aq0Var.b.intValue());
        }
        sq0 sq0Var = aq0Var.a;
        if (sq0Var != null) {
            sq0Var.d();
        }
    }
}
