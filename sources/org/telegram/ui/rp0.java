package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class rp0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ PhotoViewer c;

    public /* synthetic */ rp0(PhotoViewer photoViewer, int i7, int i10) {
        this.a = i10;
        this.c = photoViewer;
        this.b = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.c;
                sp0 sp0Var = photoViewer.O1;
                sp0Var.e.setVisibility(0);
                FrameLayout frameLayout = sp0Var.r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(org.telegram.messenger.g0.L(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
                org.telegram.messenger.i20.n(translationY, erVar, 320L);
                sp0Var.x.animate().alpha(1.0f).translationX(0.0f).setInterpolator(erVar).setDuration(320L).start();
                photoViewer.u4 = this.b;
                photoViewer.q6 = null;
                photoViewer.o6 = -1;
                break;
            default:
                int i7 = this.b;
                PhotoViewer photoViewer2 = this.c;
                photoViewer2.u4 = i7;
                photoViewer2.q6 = null;
                photoViewer2.o6 = -1;
                break;
        }
    }
}
