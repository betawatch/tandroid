package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class rp0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ sp0 b;

    public rp0(sp0 sp0Var, int i7) {
        this.b = sp0Var;
        this.a = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b.b.j8) {
            PhotoViewer photoViewer = this.b.b;
            if (photoViewer.r1) {
                photoViewer.z3();
            }
        }
        if (this.a == 3) {
            PhotoViewer photoViewer2 = this.b.b;
            photoViewer2.D2(photoViewer2.O4, false, true, true);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        PhotoViewer photoViewer = this.b.b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.C3()) {
            photoViewer.n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.i2) {
            oq0 oq0Var = photoViewer.Q1;
            oq0Var.setVisibility(oq0Var.getTag() != null ? 0 : 4);
        }
        if (photoViewer.d2 || photoViewer.e2) {
            return;
        }
        int i7 = photoViewer.c2;
        if ((i7 == 0 || i7 == 4 || ((i7 == 2 || i7 == 5) && photoViewer.f7.size() > 1)) && !photoViewer.e4) {
            photoViewer.N0.setVisibility(0);
            photoViewer.O0.setVisibility(0);
            photoViewer.p3();
        }
    }
}
