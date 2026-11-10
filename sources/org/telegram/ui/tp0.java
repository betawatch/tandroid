package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class tp0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public tp0(PhotoViewer photoViewer, int i7) {
        this.b = photoViewer;
        this.a = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.b;
        pq0 pq0Var = photoViewer.W4;
        photoViewer.p6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.n0.setVisibility(8);
        photoViewer.e1.setVisibility(8);
        photoViewer.f1.setVisibility(8);
        photoViewer.g1.setVisibility(8);
        photoViewer.o1.setVisibility(8);
        photoViewer.o1.setAlpha(0.0f);
        photoViewer.o1.setTranslationY(-org.telegram.messenger.g0.L(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i7 = photoViewer.c2;
        if (i7 == 0 || i7 == 4 || ((i7 == 2 || i7 == 5) && photoViewer.f7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.p3();
        }
        if (photoViewer.c2 == 11) {
            photoViewer.h6 = photoViewer.X5;
            photoViewer.g6 = photoViewer.W5;
            photoViewer.i6 = photoViewer.Z5;
            photoViewer.j6 = photoViewer.a6;
            photoViewer.e6 = 0.0f;
        }
        Bitmap n10 = photoViewer.B4.n();
        if (n10 != null || photoViewer.r1) {
            photoViewer.C1.b(n10, photoViewer.B4.U, photoViewer.c2 != 1, false, photoViewer.D1, photoViewer.r1 ? (org.telegram.ui.Components.i51) photoViewer.B2 : null, pq0Var.c);
            photoViewer.C1.a();
            int q10 = photoViewer.B4.q();
            int o4 = photoViewer.B4.o();
            org.telegram.messenger.ye yeVar = pq0Var.c;
            if (yeVar != null) {
                int i10 = yeVar.k;
                if (i10 == 90 || i10 == 270) {
                    o4 = q10;
                    q10 = o4;
                }
                q10 = (int) (q10 * yeVar.e);
                o4 = (int) (o4 * yeVar.f);
            }
            float f10 = q10;
            float f11 = o4;
            float min = Math.min(photoViewer.g1(photoViewer.t4) / f10, photoViewer.e1() / f11);
            float min2 = Math.min(photoViewer.g1(1) / f10, photoViewer.c1(1, false) / f11);
            if (photoViewer.c2 == 1) {
                float min3 = Math.min(photoViewer.g1(1), photoViewer.c1(1, false));
                min2 = Math.max(min3 / f10, min3 / f11);
            }
            photoViewer.d6 = min2 / min;
            Rect rect = photoViewer.s2;
            photoViewer.b6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.c6 = (-org.telegram.messenger.g0.L(56.0f)) + (!photoViewer.s ? org.telegram.messenger.g0.m / 2 : 0);
            photoViewer.m6 = System.currentTimeMillis();
            photoViewer.Q6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.o6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.U0, (Property<org.telegram.ui.Cells.v0, Float>) View.TRANSLATION_Y, org.telegram.messenger.g0.L(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.l6.g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.C1, (Property<org.telegram.ui.Components.fd0, Float>) View.ALPHA, 0.0f, 1.0f));
        photoViewer.o6.setDuration(200L);
        photoViewer.o6.addListener(new g30(this, 11));
        photoViewer.o6.start();
    }
}
