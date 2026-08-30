package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class zs0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ at0 b;

    public zs0(at0 at0Var, int i10) {
        this.b = at0Var;
        this.a = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b.b.g8) {
            PhotoViewer photoViewer = this.b.b;
            if (photoViewer.o1) {
                photoViewer.B3();
            }
        }
        if (this.a == 3) {
            PhotoViewer photoViewer2 = this.b.b;
            photoViewer2.G2(photoViewer2.M4, false, true, true);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        PhotoViewer photoViewer = this.b.b;
        photoViewer.M0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.k0.setVisibility(0);
        } else {
            photoViewer.P0.setVisibility(0);
        }
        photoViewer.C.setVisibility(0);
        if (photoViewer.f2) {
            wt0 wt0Var = photoViewer.N1;
            wt0Var.setVisibility(wt0Var.getTag() != null ? 0 : 4);
        }
        if (photoViewer.a2 || photoViewer.b2) {
            return;
        }
        int i10 = photoViewer.Z1;
        if ((i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.d7.size() > 1)) && !photoViewer.c4) {
            photoViewer.K0.setVisibility(0);
            photoViewer.L0.setVisibility(0);
            photoViewer.s3();
        }
    }
}
