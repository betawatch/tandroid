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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
        photoViewer.q6 = null;
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
        if (i2 == 0 || i2 == 4 || ((i2 == 2 || i2 == 5) && photoViewer.g7.size() > 1)) {
            photoViewer.O0.setVisibility(8);
            photoViewer.P0.setVisibility(8);
            photoViewer.C2();
        }
        Bitmap n = photoViewer.C4.n();
        if (photoViewer.d2 == 11) {
            photoViewer.i6 = photoViewer.Y5;
            photoViewer.h6 = photoViewer.X5;
            photoViewer.j6 = photoViewer.a6;
            photoViewer.k6 = photoViewer.b6;
            photoViewer.f6 = 0.0f;
        }
        if (n != null) {
            float q = photoViewer.C4.q();
            float o = photoViewer.C4.o();
            float min2 = Math.min(photoViewer.i0(2) / q, photoViewer.f0(2, false) / o);
            if (photoViewer.d2 == 1) {
                photoViewer.d6 = -gl.L(36.0f);
                min = photoViewer.j0(false);
            } else {
                photoViewer.d6 = (-gl.L(93.0f)) + (!photoViewer.s ? gl.m / 2 : 0);
                zl6 zl6Var = photoViewer.X4.c;
                min = (zl6Var == null || !((i = zl6Var.k) == 90 || i == 270)) ? Math.min(photoViewer.i0(photoViewer.u4) / q, photoViewer.g0() / o) : Math.min(photoViewer.i0(photoViewer.u4) / o, photoViewer.g0() / q);
            }
            photoViewer.e6 = min2 / min;
            Rect rect = photoViewer.t2;
            photoViewer.c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, rn.g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.J1.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, gl.L(186.0f), 0.0f));
        photoViewer.p6.setDuration(200L);
        photoViewer.p6.addListener(new l48(this, (byte) 6));
        photoViewer.p6.start();
    }
}
