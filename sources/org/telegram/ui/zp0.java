package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class zp0 extends AnimatorListenerAdapter {
    public final /* synthetic */ aq0 a;

    public zp0(aq0 aq0Var) {
        this.a = aq0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        aq0 aq0Var = this.a;
        PhotoViewer photoViewer = aq0Var.c;
        photoViewer.m4 = 0;
        photoViewer.D1();
        photoViewer.L0.setAlpha(org.telegram.messenger.qs.e4);
        photoViewer.e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.s4) {
            PhotoViewer.S(photoViewer, aq0Var.b.intValue());
        }
        tq0 tq0Var = aq0Var.a;
        if (tq0Var != null) {
            tq0Var.d();
        }
    }
}
