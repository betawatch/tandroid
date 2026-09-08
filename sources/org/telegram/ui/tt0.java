package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class tt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ut0 b;

    public tt0(ut0 ut0Var, int i10) {
        this.b = ut0Var;
        this.a = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b.b.j8) {
            PhotoViewer photoViewer = this.b.b;
            if (photoViewer.r1) {
                photoViewer.B3();
            }
        }
        if (this.a == 3) {
            PhotoViewer photoViewer2 = this.b.b;
            photoViewer2.G2(photoViewer2.P4, false, true, true);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        PhotoViewer photoViewer = this.b.b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.i2) {
            qu0 qu0Var = photoViewer.Q1;
            qu0Var.setVisibility(qu0Var.getTag() != null ? 0 : 4);
        }
        if (photoViewer.d2 || photoViewer.e2) {
            return;
        }
        int i10 = photoViewer.c2;
        if ((i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.g7.size() > 1)) && !photoViewer.f4) {
            photoViewer.N0.setVisibility(0);
            photoViewer.O0.setVisibility(0);
            photoViewer.s3();
        }
    }
}
