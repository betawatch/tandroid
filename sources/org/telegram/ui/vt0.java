package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class vt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public vt0(PhotoViewer photoViewer, int i10) {
        this.b = photoViewer;
        this.a = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.b;
        ru0 ru0Var = photoViewer.X4;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.n0.setVisibility(8);
        photoViewer.e1.setVisibility(8);
        photoViewer.f1.setVisibility(8);
        photoViewer.g1.setVisibility(8);
        photoViewer.o1.setVisibility(8);
        photoViewer.o1.setAlpha(0.0f);
        photoViewer.o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i10 = photoViewer.c2;
        if (i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.s3();
        }
        if (photoViewer.c2 == 11) {
            photoViewer.i6 = photoViewer.Y5;
            photoViewer.h6 = photoViewer.X5;
            photoViewer.j6 = photoViewer.a6;
            photoViewer.k6 = photoViewer.b6;
            photoViewer.f6 = 0.0f;
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (bitmap != null || photoViewer.r1) {
            photoViewer.C1.b(bitmap, photoViewer.C4.getOrientation(), photoViewer.c2 != 1, false, photoViewer.D1, photoViewer.r1 ? (org.telegram.ui.Components.u61) photoViewer.B2 : null, ru0Var.c);
            photoViewer.C1.a();
            int bitmapWidth = photoViewer.C4.getBitmapWidth();
            int bitmapHeight = photoViewer.C4.getBitmapHeight();
            MediaController.CropState cropState = ru0Var.c;
            if (cropState != null) {
                int i11 = cropState.transformRotation;
                if (i11 == 90 || i11 == 270) {
                    bitmapHeight = bitmapWidth;
                    bitmapWidth = bitmapHeight;
                }
                bitmapWidth = (int) (bitmapWidth * cropState.cropPw);
                bitmapHeight = (int) (bitmapHeight * cropState.cropPh);
            }
            float f7 = bitmapWidth;
            float f10 = bitmapHeight;
            float min = Math.min(photoViewer.k1(photoViewer.u4) / f7, photoViewer.i1() / f10);
            float min2 = Math.min(photoViewer.k1(1) / f7, photoViewer.h1(1, false) / f10);
            if (photoViewer.c2 == 1) {
                float min3 = Math.min(photoViewer.k1(1), photoViewer.h1(1, false));
                min2 = Math.max(min3 / f7, min3 / f10);
            }
            photoViewer.e6 = min2 / min;
            Rect rect = photoViewer.s2;
            photoViewer.c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.d6 = (-AndroidUtilities.dp(56.0f)) + (!photoViewer.s ? AndroidUtilities.statusBarHeight / 2 : 0);
            photoViewer.n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.U0, (Property<org.telegram.ui.Components.sf0, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.t6.g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.C1, (Property<org.telegram.ui.Components.ue0, Float>) View.ALPHA, 0.0f, 1.0f));
        photoViewer.p6.setDuration(200L);
        photoViewer.p6.addListener(new gk0(this, 5));
        photoViewer.p6.start();
    }
}
