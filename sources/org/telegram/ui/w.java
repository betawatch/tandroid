package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class w extends AnimatorListenerAdapter {
    public final /* synthetic */ x a;

    public w(x xVar) {
        this.a = xVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        x xVar = this.a;
        PhotoViewer photoViewer = xVar.c;
        photoViewer.m4 = (byte) 0;
        photoViewer.H0();
        photoViewer.M0.setAlpha(nm7.d4);
        photoViewer.f0.invalidate();
        photoViewer.Q0.setTranslationY(0.0f);
        if (photoViewer.s4) {
            photoViewer.G0(xVar.b.intValue());
        }
        pb8 pb8Var = xVar.a;
        if (pb8Var != null) {
            pb8Var.e();
        }
    }
}
