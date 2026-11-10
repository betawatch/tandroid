package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class vp0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ PhotoViewer c;

    public /* synthetic */ vp0(PhotoViewer photoViewer, int i7, int i10) {
        this.a = i10;
        this.c = photoViewer;
        this.b = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.c;
                wp0 wp0Var = photoViewer.N1;
                wp0Var.e.setVisibility(0);
                FrameLayout frameLayout = wp0Var.r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(org.telegram.messenger.g0.L(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.h;
                org.telegram.messenger.camera.q.l(translationY, wqVar, 320L);
                wp0Var.x.animate().alpha(1.0f).translationX(0.0f).setInterpolator(wqVar).setDuration(320L).start();
                photoViewer.t4 = this.b;
                photoViewer.p6 = null;
                photoViewer.n6 = -1;
                break;
            default:
                int i7 = this.b;
                PhotoViewer photoViewer2 = this.c;
                photoViewer2.t4 = i7;
                photoViewer2.p6 = null;
                photoViewer2.n6 = -1;
                break;
        }
    }
}
