package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class u extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PhotoViewer b;

    /* JADX WARN: Multi-variable type inference failed */
    public u(PhotoViewer photoViewer, int i) {
        this.b = photoViewer;
        this.a = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float min;
        int i;
        PhotoViewer photoViewer = this.b;
        photoViewer.p6 = null;
        photoViewer.Q0.setVisibility(8);
        photoViewer.T0.setVisibility(8);
        photoViewer.o0.setVisibility(8);
        photoViewer.G.setVisibility(8);
        photoViewer.f1.setVisibility(8);
        photoViewer.g1.setVisibility(8);
        photoViewer.h1.setVisibility(8);
        v48 v48Var = photoViewer.D1;
        if (v48Var != null) {
            v48Var.setVisibility(4);
        }
        photoViewer.p1.setVisibility(8);
        photoViewer.p1.setAlpha(0.0f);
        photoViewer.p1.setTranslationY(-gl.L(10.0f));
        photoViewer.P0.setRotationX(0.0f);
        photoViewer.p1.setEnabled(false);
        photoViewer.L = false;
        if (photoViewer.j2) {
            photoViewer.R1.setVisibility(4);
        }
        int i2 = photoViewer.d2;
        if (i2 == 0 || i2 == 4 || ((i2 == 2 || i2 == 5) && photoViewer.f7.size() > 1)) {
            photoViewer.O0.setVisibility(8);
            photoViewer.P0.setVisibility(8);
            photoViewer.D2();
        }
        Bitmap n = photoViewer.B4.n();
        if (photoViewer.d2 == 11) {
            photoViewer.h6 = photoViewer.X5;
            photoViewer.g6 = photoViewer.W5;
            photoViewer.i6 = photoViewer.Z5;
            photoViewer.j6 = photoViewer.a6;
            photoViewer.e6 = 0.0f;
        }
        if (n != null) {
            float q = photoViewer.B4.q();
            float o = photoViewer.B4.o();
            float min2 = Math.min(photoViewer.i0(2) / q, photoViewer.f0(2, false) / o);
            if (photoViewer.d2 == 1) {
                photoViewer.c6 = -gl.L(36.0f);
                min = photoViewer.j0(false);
            } else {
                photoViewer.c6 = (-gl.L(93.0f)) + (!photoViewer.s ? gl.m / 2 : 0);
                zl6 zl6Var = photoViewer.W4.c;
                min = (zl6Var == null || !((i = zl6Var.k) == 90 || i == 270)) ? Math.min(photoViewer.i0(photoViewer.t4) / q, photoViewer.g0() / o) : Math.min(photoViewer.i0(photoViewer.t4) / o, photoViewer.g0() / q);
            }
            photoViewer.d6 = min2 / min;
            Rect rect = photoViewer.t2;
            photoViewer.b6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.m6 = System.currentTimeMillis();
            photoViewer.Q6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.o6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, rn.g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.J1.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, gl.L(186.0f), 0.0f));
        photoViewer.o6.setDuration(200L);
        photoViewer.o6.addListener(new l48(this, (byte) 6));
        photoViewer.o6.start();
    }
}
