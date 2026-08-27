package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ws0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ PhotoViewer c;

    public /* synthetic */ ws0(PhotoViewer photoViewer, int i10, int i11) {
        this.a = i11;
        this.c = photoViewer;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.c;
                xs0 xs0Var = photoViewer.J1;
                xs0Var.e.setVisibility(0);
                FrameLayout frameLayout = xs0Var.r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
                org.telegram.messenger.rl.o(translationY, erVar, 320L);
                xs0Var.w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(erVar).setDuration(320L).start();
                photoViewer.q4 = this.b;
                photoViewer.m6 = null;
                photoViewer.k6 = -1;
                break;
            default:
                int i10 = this.b;
                PhotoViewer photoViewer2 = this.c;
                photoViewer2.q4 = i10;
                photoViewer2.m6 = null;
                photoViewer2.k6 = -1;
                break;
        }
    }
}
