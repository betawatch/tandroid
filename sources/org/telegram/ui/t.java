package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class t extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PhotoViewer b;

    /* JADX WARN: Multi-variable type inference failed */
    public t(PhotoViewer photoViewer, int i) {
        this.b = photoViewer;
        this.a = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.b;
        h98 h98Var = photoViewer.W4;
        photoViewer.p6 = null;
        photoViewer.Q0.setVisibility(8);
        photoViewer.T0.setVisibility(8);
        photoViewer.o0.setVisibility(8);
        photoViewer.f1.setVisibility(8);
        photoViewer.g1.setVisibility(8);
        photoViewer.h1.setVisibility(8);
        photoViewer.p1.setVisibility(8);
        photoViewer.p1.setAlpha(0.0f);
        photoViewer.p1.setTranslationY(-gl.L(10.0f));
        photoViewer.P0.setRotationX(0.0f);
        photoViewer.p1.setEnabled(false);
        photoViewer.L = false;
        if (photoViewer.j2) {
            photoViewer.R1.setVisibility(4);
        }
        int i = photoViewer.d2;
        if (i == 0 || i == 4 || ((i == 2 || i == 5) && photoViewer.f7.size() > 1)) {
            photoViewer.O0.setVisibility(8);
            photoViewer.P0.setVisibility(8);
            photoViewer.D2();
        }
        if (photoViewer.d2 == 11) {
            photoViewer.h6 = photoViewer.X5;
            photoViewer.g6 = photoViewer.W5;
            photoViewer.i6 = photoViewer.Z5;
            photoViewer.j6 = photoViewer.a6;
            photoViewer.e6 = 0.0f;
        }
        Bitmap n = photoViewer.B4.n();
        if (n != null || photoViewer.s1) {
            photoViewer.D1.b(n, photoViewer.B4.V, photoViewer.d2 != 1, false, photoViewer.E1, photoViewer.s1 ? (kac) photoViewer.C2 : null, h98Var.c);
            photoViewer.D1.a();
            int q = photoViewer.B4.q();
            int o = photoViewer.B4.o();
            zl6 zl6Var = h98Var.c;
            if (zl6Var != null) {
                int i2 = zl6Var.k;
                if (i2 == 90 || i2 == 270) {
                    o = q;
                    q = o;
                }
                q = (int) (q * zl6Var.e);
                o = (int) (o * zl6Var.f);
            }
            float f = q;
            float f2 = o;
            float min = Math.min(photoViewer.i0(photoViewer.t4) / f, photoViewer.g0() / f2);
            float min2 = Math.min(photoViewer.i0(1) / f, photoViewer.f0(1, false) / f2);
            if (photoViewer.d2 == 1) {
                float min3 = Math.min(photoViewer.i0(1), photoViewer.f0(1, false));
                min2 = Math.max(min3 / f, min3 / f2);
            }
            photoViewer.d6 = min2 / min;
            Rect rect = photoViewer.t2;
            photoViewer.b6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.c6 = (-gl.L(56.0f)) + (!photoViewer.s ? gl.m / 2 : 0);
            photoViewer.m6 = System.currentTimeMillis();
            photoViewer.Q6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.o6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.V0, (Property<z92, Float>) View.TRANSLATION_Y, gl.L(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, rn.g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.D1, (Property<v48, Float>) View.ALPHA, 0.0f, 1.0f));
        photoViewer.o6.setDuration(200L);
        photoViewer.o6.addListener(new l48(this, (byte) 5));
        photoViewer.o6.start();
    }
}
