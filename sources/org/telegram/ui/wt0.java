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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class wt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public wt0(PhotoViewer photoViewer, int i10) {
        this.b = photoViewer;
        this.a = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float min;
        int i10;
        PhotoViewer photoViewer = this.b;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.n0.setVisibility(8);
        photoViewer.F.setVisibility(8);
        photoViewer.e1.setVisibility(8);
        photoViewer.f1.setVisibility(8);
        photoViewer.g1.setVisibility(8);
        org.telegram.ui.Components.ue0 ue0Var = photoViewer.C1;
        if (ue0Var != null) {
            ue0Var.setVisibility(4);
        }
        photoViewer.o1.setVisibility(8);
        photoViewer.o1.setAlpha(0.0f);
        photoViewer.o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i11 = photoViewer.c2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.s3();
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (photoViewer.c2 == 11) {
            photoViewer.i6 = photoViewer.Y5;
            photoViewer.h6 = photoViewer.X5;
            photoViewer.j6 = photoViewer.a6;
            photoViewer.k6 = photoViewer.b6;
            photoViewer.f6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.C4.getBitmapWidth();
            float bitmapHeight = photoViewer.C4.getBitmapHeight();
            float min2 = Math.min(photoViewer.k1(2) / bitmapWidth, photoViewer.h1(2, false) / bitmapHeight);
            if (photoViewer.c2 == 1) {
                photoViewer.d6 = -AndroidUtilities.dp(36.0f);
                min = photoViewer.l1(false);
            } else {
                photoViewer.d6 = (-AndroidUtilities.dp(93.0f)) + (!photoViewer.s ? AndroidUtilities.statusBarHeight / 2 : 0);
                MediaController.CropState cropState = photoViewer.X4.c;
                min = (cropState == null || !((i10 = cropState.transformRotation) == 90 || i10 == 270)) ? Math.min(photoViewer.k1(photoViewer.u4) / bitmapWidth, photoViewer.i1() / bitmapHeight) : Math.min(photoViewer.k1(photoViewer.u4) / bitmapHeight, photoViewer.i1() / bitmapWidth);
            }
            photoViewer.e6 = min2 / min;
            Rect rect = photoViewer.s2;
            photoViewer.c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.t6.g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.I1.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.p6.setDuration(200L);
        photoViewer.p6.addListener(new gk0(this, 6));
        photoViewer.p6.start();
    }
}
