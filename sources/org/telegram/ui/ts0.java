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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ts0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public ts0(PhotoViewer photoViewer, int i9) {
        this.b = photoViewer;
        this.a = i9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.b;
        qt0 qt0Var = photoViewer.T4;
        photoViewer.m6 = null;
        photoViewer.L0.setVisibility(8);
        photoViewer.O0.setVisibility(8);
        photoViewer.j0.setVisibility(8);
        photoViewer.a1.setVisibility(8);
        photoViewer.b1.setVisibility(8);
        photoViewer.c1.setVisibility(8);
        photoViewer.k1.setVisibility(8);
        photoViewer.k1.setAlpha(0.0f);
        photoViewer.k1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.K0.setRotationX(0.0f);
        photoViewer.k1.setEnabled(false);
        photoViewer.G = false;
        if (photoViewer.e2) {
            photoViewer.M1.setVisibility(4);
        }
        int i9 = photoViewer.Y1;
        if (i9 == 0 || i9 == 4 || ((i9 == 2 || i9 == 5) && photoViewer.c7.size() > 1)) {
            photoViewer.J0.setVisibility(8);
            photoViewer.K0.setVisibility(8);
            photoViewer.s3();
        }
        if (photoViewer.Y1 == 11) {
            photoViewer.e6 = photoViewer.U5;
            photoViewer.d6 = photoViewer.T5;
            photoViewer.f6 = photoViewer.W5;
            photoViewer.g6 = photoViewer.X5;
            photoViewer.b6 = 0.0f;
        }
        Bitmap bitmap = photoViewer.y4.getBitmap();
        if (bitmap != null || photoViewer.n1) {
            photoViewer.y1.b(bitmap, photoViewer.y4.getOrientation(), photoViewer.Y1 != 1, false, photoViewer.z1, photoViewer.n1 ? (org.telegram.ui.Components.y51) photoViewer.x2 : null, qt0Var.c);
            photoViewer.y1.a();
            int bitmapWidth = photoViewer.y4.getBitmapWidth();
            int bitmapHeight = photoViewer.y4.getBitmapHeight();
            MediaController.CropState cropState = qt0Var.c;
            if (cropState != null) {
                int i10 = cropState.transformRotation;
                if (i10 == 90 || i10 == 270) {
                    bitmapHeight = bitmapWidth;
                    bitmapWidth = bitmapHeight;
                }
                bitmapWidth = (int) (bitmapWidth * cropState.cropPw);
                bitmapHeight = (int) (bitmapHeight * cropState.cropPh);
            }
            float f10 = bitmapWidth;
            float f11 = bitmapHeight;
            float min = Math.min(photoViewer.k1(photoViewer.q4) / f10, photoViewer.i1() / f11);
            float min2 = Math.min(photoViewer.k1(1) / f10, photoViewer.h1(1, false) / f11);
            if (photoViewer.Y1 == 1) {
                float min3 = Math.min(photoViewer.k1(1), photoViewer.h1(1, false));
                min2 = Math.max(min3 / f10, min3 / f11);
            }
            photoViewer.a6 = min2 / min;
            Rect rect = photoViewer.o2;
            photoViewer.Y5 = (rect.left / 2) - (rect.right / 2);
            photoViewer.Z5 = (-AndroidUtilities.dp(56.0f)) + (!photoViewer.s ? AndroidUtilities.statusBarHeight / 2 : 0);
            photoViewer.j6 = System.currentTimeMillis();
            photoViewer.N6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.l6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.Q0, (Property<org.telegram.ui.Components.bf0, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.m6.g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.y1, (Property<org.telegram.ui.Components.be0, Float>) View.ALPHA, 0.0f, 1.0f));
        photoViewer.l6.setDuration(200L);
        photoViewer.l6.addListener(new bc0(this, 8));
        photoViewer.l6.start();
    }
}
