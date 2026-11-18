package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class rp0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public rp0(PhotoViewer photoViewer, int i7) {
        this.b = photoViewer;
        this.a = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.b;
        nq0 nq0Var = photoViewer.X4;
        photoViewer.q6 = null;
        photoViewer.Q0.setVisibility(8);
        photoViewer.T0.setVisibility(8);
        photoViewer.o0.setVisibility(8);
        photoViewer.f1.setVisibility(8);
        photoViewer.g1.setVisibility(8);
        photoViewer.h1.setVisibility(8);
        photoViewer.p1.setVisibility(8);
        photoViewer.p1.setAlpha(0.0f);
        photoViewer.p1.setTranslationY(-org.telegram.messenger.g0.L(10.0f));
        photoViewer.P0.setRotationX(0.0f);
        photoViewer.p1.setEnabled(false);
        photoViewer.L = false;
        if (photoViewer.j2) {
            photoViewer.R1.setVisibility(4);
        }
        int i7 = photoViewer.d2;
        if (i7 == 0 || i7 == 4 || ((i7 == 2 || i7 == 5) && photoViewer.g7.size() > 1)) {
            photoViewer.O0.setVisibility(8);
            photoViewer.P0.setVisibility(8);
            photoViewer.q3();
        }
        if (photoViewer.d2 == 11) {
            photoViewer.i6 = photoViewer.Y5;
            photoViewer.h6 = photoViewer.X5;
            photoViewer.j6 = photoViewer.a6;
            photoViewer.k6 = photoViewer.b6;
            photoViewer.f6 = 0.0f;
        }
        Bitmap n10 = photoViewer.C4.n();
        if (n10 != null || photoViewer.s1) {
            photoViewer.D1.b(n10, photoViewer.C4.V, photoViewer.d2 != 1, false, photoViewer.E1, photoViewer.s1 ? (org.telegram.ui.Components.v51) photoViewer.C2 : null, nq0Var.c);
            photoViewer.D1.a();
            int q10 = photoViewer.C4.q();
            int o4 = photoViewer.C4.o();
            org.telegram.messenger.we weVar = nq0Var.c;
            if (weVar != null) {
                int i10 = weVar.k;
                if (i10 == 90 || i10 == 270) {
                    o4 = q10;
                    q10 = o4;
                }
                q10 = (int) (q10 * weVar.e);
                o4 = (int) (o4 * weVar.f);
            }
            float f10 = q10;
            float f11 = o4;
            float min = Math.min(photoViewer.g1(photoViewer.u4) / f10, photoViewer.e1() / f11);
            float min2 = Math.min(photoViewer.g1(1) / f10, photoViewer.d1(1, false) / f11);
            if (photoViewer.d2 == 1) {
                float min3 = Math.min(photoViewer.g1(1), photoViewer.d1(1, false));
                min2 = Math.max(min3 / f10, min3 / f11);
            }
            photoViewer.e6 = min2 / min;
            Rect rect = photoViewer.t2;
            photoViewer.c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.d6 = (-org.telegram.messenger.g0.L(56.0f)) + (!photoViewer.s ? org.telegram.messenger.g0.m / 2 : 0);
            photoViewer.n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.V0, (Property<org.telegram.ui.Cells.w0, Float>) View.TRANSLATION_Y, org.telegram.messenger.g0.L(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.q6.g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.D1, (Property<org.telegram.ui.Components.qd0, Float>) View.ALPHA, 0.0f, 1.0f));
        photoViewer.p6.setDuration(200L);
        photoViewer.p6.addListener(new ay(this, 12));
        photoViewer.p6.start();
    }
}
