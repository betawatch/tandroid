package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
        photoViewer.M0.setAlpha(kk7.d4);
        photoViewer.f0.invalidate();
        photoViewer.Q0.setTranslationY(0.0f);
        if (photoViewer.s4) {
            photoViewer.G0(xVar.b.intValue());
        }
        o98 o98Var = xVar.a;
        if (o98Var != null) {
            o98Var.e();
        }
    }
}
