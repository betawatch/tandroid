package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class qs0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ rs0 b;

    public qs0(rs0 rs0Var, int i10) {
        this.b = rs0Var;
        this.a = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b.b.f8) {
            PhotoViewer photoViewer = this.b.b;
            if (photoViewer.n1) {
                photoViewer.B3();
            }
        }
        if (this.a == 3) {
            PhotoViewer photoViewer2 = this.b.b;
            photoViewer2.G2(photoViewer2.L4, false, true, true);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        PhotoViewer photoViewer = this.b.b;
        photoViewer.L0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.j0.setVisibility(0);
        } else {
            photoViewer.O0.setVisibility(0);
        }
        photoViewer.B.setVisibility(0);
        if (photoViewer.e2) {
            nt0 nt0Var = photoViewer.M1;
            nt0Var.setVisibility(nt0Var.getTag() != null ? 0 : 4);
        }
        if (photoViewer.Z1 || photoViewer.a2) {
            return;
        }
        int i10 = photoViewer.Y1;
        if ((i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.c7.size() > 1)) && !photoViewer.b4) {
            photoViewer.J0.setVisibility(0);
            photoViewer.K0.setVisibility(0);
            photoViewer.s3();
        }
    }
}
