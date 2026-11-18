package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class tp0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ PhotoViewer c;

    public /* synthetic */ tp0(PhotoViewer photoViewer, int i7, int i10) {
        this.a = i10;
        this.c = photoViewer;
        this.b = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.c;
                up0 up0Var = photoViewer.O1;
                up0Var.e.setVisibility(0);
                FrameLayout frameLayout = up0Var.r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(org.telegram.messenger.g0.L(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.h;
                org.telegram.messenger.n10.o(translationY, lrVar, 320L);
                up0Var.x.animate().alpha(1.0f).translationX(0.0f).setInterpolator(lrVar).setDuration(320L).start();
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
