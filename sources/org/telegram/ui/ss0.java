package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ss0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ts0 b;

    public ss0(ts0 ts0Var, int i10) {
        this.b = ts0Var;
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
            qt0 qt0Var = photoViewer.M1;
            qt0Var.setVisibility(qt0Var.getTag() != null ? 0 : 4);
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
