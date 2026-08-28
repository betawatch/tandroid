package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rs0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ss0 b;

    public rs0(ss0 ss0Var, int i9) {
        this.b = ss0Var;
        this.a = i9;
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
            pt0 pt0Var = photoViewer.M1;
            pt0Var.setVisibility(pt0Var.getTag() != null ? 0 : 4);
        }
        if (photoViewer.Z1 || photoViewer.a2) {
            return;
        }
        int i9 = photoViewer.Y1;
        if ((i9 == 0 || i9 == 4 || ((i9 == 2 || i9 == 5) && photoViewer.c7.size() > 1)) && !photoViewer.b4) {
            photoViewer.J0.setVisibility(0);
            photoViewer.K0.setVisibility(0);
            photoViewer.s3();
        }
    }
}
