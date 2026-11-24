package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class r extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s b;

    /* JADX WARN: Multi-variable type inference failed */
    public r(s sVar, int i) {
        this.b = sVar;
        this.a = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b.b.p8) {
            PhotoViewer photoViewer = this.b.b;
            if (photoViewer.s1) {
                photoViewer.P2();
            }
        }
        if (this.a == 3) {
            PhotoViewer photoViewer2 = this.b.b;
            photoViewer2.P1(false, true, true, photoViewer2.O4);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        PhotoViewer photoViewer = this.b.b;
        photoViewer.Q0.setVisibility(0);
        if (photoViewer.T2()) {
            photoViewer.o0.setVisibility(0);
        } else {
            photoViewer.T0.setVisibility(0);
        }
        photoViewer.G.setVisibility(0);
        if (photoViewer.j2) {
            hb8 hb8Var = photoViewer.R1;
            hb8Var.setVisibility(hb8Var.getTag() != null ? 0 : 4);
        }
        if (photoViewer.e2 || photoViewer.f2) {
            return;
        }
        int i = photoViewer.d2;
        if ((i == 0 || i == 4 || ((i == 2 || i == 5) && photoViewer.f7.size() > 1)) && !photoViewer.f4) {
            photoViewer.O0.setVisibility(0);
            photoViewer.P0.setVisibility(0);
            photoViewer.D2();
        }
    }
}
