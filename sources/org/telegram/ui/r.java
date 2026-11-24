package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
        if (this.b.b.q8) {
            PhotoViewer photoViewer = this.b.b;
            if (photoViewer.s1) {
                photoViewer.O2();
            }
        }
        if (this.a == 3) {
            PhotoViewer photoViewer2 = this.b.b;
            photoViewer2.O1(false, true, true, photoViewer2.P4);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        PhotoViewer photoViewer = this.b.b;
        photoViewer.Q0.setVisibility(0);
        if (photoViewer.S2()) {
            photoViewer.o0.setVisibility(0);
        } else {
            photoViewer.T0.setVisibility(0);
        }
        photoViewer.G.setVisibility(0);
        if (photoViewer.j2) {
            g98 g98Var = photoViewer.R1;
            g98Var.setVisibility(g98Var.getTag() != null ? 0 : 4);
        }
        if (photoViewer.e2 || photoViewer.f2) {
            return;
        }
        int i = photoViewer.d2;
        if ((i == 0 || i == 4 || ((i == 2 || i == 5) && photoViewer.g7.size() > 1)) && !photoViewer.f4) {
            photoViewer.O0.setVisibility(0);
            photoViewer.P0.setVisibility(0);
            photoViewer.C2();
        }
    }
}
