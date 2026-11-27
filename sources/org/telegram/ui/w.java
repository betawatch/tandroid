package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
        photoViewer.M0.setAlpha(jn7.d4);
        photoViewer.f0.invalidate();
        photoViewer.Q0.setTranslationY(0.0f);
        if (photoViewer.s4) {
            photoViewer.G0(xVar.b.intValue());
        }
        ed8 ed8Var = xVar.a;
        if (ed8Var != null) {
            ed8Var.e();
        }
    }
}
