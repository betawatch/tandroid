package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vs0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ PhotoViewer c;

    public /* synthetic */ vs0(PhotoViewer photoViewer, int i9, int i10) {
        this.a = i10;
        this.c = photoViewer;
        this.b = i9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.c;
                ws0 ws0Var = photoViewer.J1;
                ws0Var.e.setVisibility(0);
                FrameLayout frameLayout = ws0Var.r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
                org.telegram.messenger.ll.r(translationY, grVar, 320L);
                ws0Var.w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(grVar).setDuration(320L).start();
                photoViewer.q4 = this.b;
                photoViewer.m6 = null;
                photoViewer.k6 = -1;
                break;
            default:
                int i9 = this.b;
                PhotoViewer photoViewer2 = this.c;
                photoViewer2.q4 = i9;
                photoViewer2.m6 = null;
                photoViewer2.k6 = -1;
                break;
        }
    }
}
