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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class vs0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public vs0(PhotoViewer photoViewer, int i10) {
        this.b = photoViewer;
        this.a = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float min;
        int i10;
        PhotoViewer photoViewer = this.b;
        photoViewer.m6 = null;
        photoViewer.L0.setVisibility(8);
        photoViewer.O0.setVisibility(8);
        photoViewer.j0.setVisibility(8);
        photoViewer.B.setVisibility(8);
        photoViewer.a1.setVisibility(8);
        photoViewer.b1.setVisibility(8);
        photoViewer.c1.setVisibility(8);
        org.telegram.ui.Components.ge0 ge0Var = photoViewer.y1;
        if (ge0Var != null) {
            ge0Var.setVisibility(4);
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
        int i11 = photoViewer.Y1;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.c7.size() > 1)) {
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
                min = (cropState == null || !((i10 = cropState.transformRotation) == 90 || i10 == 270)) ? Math.min(photoViewer.k1(photoViewer.q4) / bitmapWidth, photoViewer.i1() / bitmapHeight) : Math.min(photoViewer.k1(photoViewer.q4) / bitmapHeight, photoViewer.i1() / bitmapWidth);
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
        photoViewer.l6.addListener(new f50(this, 11));
        photoViewer.l6.start();
    }
}
