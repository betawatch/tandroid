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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class us0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public us0(PhotoViewer photoViewer, int i9) {
        this.b = photoViewer;
        this.a = i9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float min;
        int i9;
        PhotoViewer photoViewer = this.b;
        photoViewer.m6 = null;
        photoViewer.L0.setVisibility(8);
        photoViewer.O0.setVisibility(8);
        photoViewer.j0.setVisibility(8);
        photoViewer.B.setVisibility(8);
        photoViewer.a1.setVisibility(8);
        photoViewer.b1.setVisibility(8);
        photoViewer.c1.setVisibility(8);
        org.telegram.ui.Components.be0 be0Var = photoViewer.y1;
        if (be0Var != null) {
            be0Var.setVisibility(4);
        }
        photoViewer.k1.setVisibility(8);
        photoViewer.k1.setAlpha(0.0f);
        photoViewer.k1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.K0.setRotationX(0.0f);
        photoViewer.k1.setEnabled(false);
        photoViewer.G = false;
        if (photoViewer.e2) {
            photoViewer.M1.setVisibility(4);
        }
        int i10 = photoViewer.Y1;
        if (i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.c7.size() > 1)) {
            photoViewer.J0.setVisibility(8);
            photoViewer.K0.setVisibility(8);
            photoViewer.s3();
        }
        Bitmap bitmap = photoViewer.y4.getBitmap();
        if (photoViewer.Y1 == 11) {
            photoViewer.e6 = photoViewer.U5;
            photoViewer.d6 = photoViewer.T5;
            photoViewer.f6 = photoViewer.W5;
            photoViewer.g6 = photoViewer.X5;
            photoViewer.b6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.y4.getBitmapWidth();
            float bitmapHeight = photoViewer.y4.getBitmapHeight();
            float min2 = Math.min(photoViewer.k1(2) / bitmapWidth, photoViewer.h1(2, false) / bitmapHeight);
            if (photoViewer.Y1 == 1) {
                photoViewer.Z5 = -AndroidUtilities.dp(36.0f);
                min = photoViewer.l1(false);
            } else {
                photoViewer.Z5 = (-AndroidUtilities.dp(93.0f)) + (!photoViewer.s ? AndroidUtilities.statusBarHeight / 2 : 0);
                MediaController.CropState cropState = photoViewer.T4.c;
                min = (cropState == null || !((i9 = cropState.transformRotation) == 90 || i9 == 270)) ? Math.min(photoViewer.k1(photoViewer.q4) / bitmapWidth, photoViewer.i1() / bitmapHeight) : Math.min(photoViewer.k1(photoViewer.q4) / bitmapHeight, photoViewer.i1() / bitmapWidth);
            }
            photoViewer.a6 = min2 / min;
            Rect rect = photoViewer.o2;
            photoViewer.Y5 = (rect.left / 2) - (rect.right / 2);
            photoViewer.j6 = System.currentTimeMillis();
            photoViewer.N6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.l6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.m6.g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.E1.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.l6.setDuration(200L);
        photoViewer.l6.addListener(new bc0(this, 9));
        photoViewer.l6.start();
    }
}
