package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class rt0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClippingImageView[] a;
    public final /* synthetic */ ViewGroup.LayoutParams b;
    public final /* synthetic */ float c;
    public final /* synthetic */ qu0 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ ou0 f;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ Integer n;
    public final /* synthetic */ PhotoViewer r;

    public rt0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f10, qu0 qu0Var, float f11, ou0 ou0Var, ArrayList arrayList, Integer num) {
        this.r = photoViewer;
        this.a = clippingImageViewArr;
        this.b = layoutParams;
        this.c = f10;
        this.d = qu0Var;
        this.e = f11;
        this.f = ou0Var;
        this.h = arrayList;
        this.n = num;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        char c3;
        float r22;
        float d;
        float d10;
        boolean z4;
        PhotoViewer photoViewer = this.r;
        Rect rect = photoViewer.p2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.I0;
        float[][] fArr = photoViewer.h4;
        ClippingImageView[] clippingImageViewArr = this.a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            clippingImageViewArr[1].setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView = clippingImageViewArr[0];
        clippingImageView.setTranslationX(clippingImageView.getTranslationX() + rect.left);
        photoViewer.d0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i10 = photoViewer.Z1;
        ViewGroup.LayoutParams layoutParams = this.b;
        if (i10 == 1) {
            float f10 = !photoViewer.s ? AndroidUtilities.statusBarHeight : 0;
            float measuredHeight = (photoViewer.z1.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - f10;
            c3 = 0;
            float min = Math.min(photoViewer.z1.getMeasuredWidth(), measuredHeight) - (AndroidUtilities.dp(16.0f) * 2);
            float measuredWidth = photoViewer.z1.getMeasuredWidth() / 2.0f;
            float f11 = (measuredHeight / 2.0f) + f10;
            float f12 = min / 2.0f;
            float f13 = f11 - f12;
            float f14 = (f11 + f12) - f13;
            r22 = Math.max(((measuredWidth + f12) - (measuredWidth - f12)) / layoutParams.width, f14 / layoutParams.height);
            d = ((f14 - (layoutParams.height * r22)) / 2.0f) + f13;
            int measuredWidth2 = photoViewer.d0.getMeasuredWidth();
            d10 = e2.c.d(layoutParams.width, r22, (measuredWidth2 - r11) - rect.right, 2.0f) + rect.left;
        } else {
            c3 = 0;
            float min2 = Math.min(photoViewer.d0.getMeasuredWidth() / layoutParams.width, (AndroidUtilities.displaySize.y + (!photoViewer.s ? AndroidUtilities.statusBarHeight : 0)) / layoutParams.height);
            r22 = photoViewer.Z1 == 11 ? photoViewer.r2(true) * min2 : min2;
            d = e2.c.d(layoutParams.height, r22, AndroidUtilities.displaySize.y + (!photoViewer.s ? AndroidUtilities.statusBarHeight : 0), 2.0f);
            d10 = e2.c.d(layoutParams.width, r22, photoViewer.d0.getMeasuredWidth(), 2.0f);
            photoViewer.Y5 = 0.0f;
            photoViewer.c6 = 0.0f;
        }
        qu0 qu0Var = this.d;
        int abs = (int) Math.abs(this.c - qu0Var.a.getImageX());
        float imageY = qu0Var.a.getImageY();
        float f15 = this.e;
        int abs2 = (int) Math.abs(f15 - imageY);
        if (qu0Var.a.isAspectFit()) {
            abs = 0;
        }
        int[] iArr = new int[2];
        qu0Var.d.getLocationInWindow(iArr);
        float f16 = qu0Var.c + f15;
        int i11 = (int) ((iArr[1] - f16) + qu0Var.j);
        if (i11 < 0) {
            i11 = 0;
        }
        int height = (int) (((f16 + layoutParams.height) - (qu0Var.d.getHeight() + r10)) + qu0Var.i);
        if (height < 0) {
            height = 0;
        }
        int max = Math.max(i11, abs2);
        int max2 = Math.max(height, abs2);
        fArr[c3][c3] = photoViewer.e0.getScaleX();
        fArr[c3][1] = photoViewer.e0.getScaleY();
        fArr[c3][2] = photoViewer.e0.getTranslationX();
        fArr[c3][3] = photoViewer.e0.getTranslationY();
        float[] fArr2 = fArr[c3];
        float f17 = abs;
        float f18 = qu0Var.k;
        fArr2[4] = f17 * f18;
        fArr2[5] = max * f18;
        fArr2[6] = max2 * f18;
        int[] radius = photoViewer.e0.getRadius();
        for (int i12 = 0; i12 < 4; i12++) {
            fArr[c3][i12 + 7] = radius != null ? radius[i12] : 0.0f;
        }
        float[] fArr3 = fArr[c3];
        float f19 = qu0Var.k;
        fArr3[11] = abs2 * f19;
        fArr3[12] = f17 * f19;
        float[] fArr4 = fArr[1];
        fArr4[c3] = r22;
        fArr4[1] = r22;
        fArr4[2] = d10;
        fArr4[3] = d;
        fArr4[4] = 0.0f;
        fArr4[5] = 0.0f;
        fArr4[6] = 0.0f;
        fArr4[7] = 0.0f;
        fArr4[8] = 0.0f;
        fArr4[9] = 0.0f;
        fArr4[10] = 0.0f;
        fArr4[11] = 0.0f;
        fArr4[12] = 0.0f;
        for (ClippingImageView clippingImageView2 : clippingImageViewArr) {
            clippingImageView2.setAnimationProgress(0.0f);
        }
        backgroundDrawable.setAlpha(0);
        photoViewer.b0.setAlpha(0.0f);
        photoViewer.g0.setAlpha(0.0f);
        org.telegram.ui.Components.jy0 jy0Var = new org.telegram.ui.Components.jy0(this, clippingImageViewArr, this.h, this.n, this.f, 21);
        photoViewer.m4 = jy0Var;
        if (photoViewer.i2) {
            jy0Var.run();
            photoViewer.m4 = null;
            photoViewer.b0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(255);
            for (ClippingImageView clippingImageView3 : clippingImageViewArr) {
                clippingImageView3.setAnimationProgress(1.0f);
            }
            if (photoViewer.Z1 == 1) {
                photoViewer.z1.setAlpha(1.0f);
            }
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList((photoViewer.Z1 != 1 ? 2 : 3) + clippingImageViewArr.length + (clippingImageViewArr.length > 1 ? 1 : 0));
            for (int i13 = 0; i13 < clippingImageViewArr.length; i13++) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i13], org.telegram.ui.Components.n6.f, 0.0f, 1.0f);
                if (i13 == 0) {
                    ofFloat.addUpdateListener(new e3(this, 23));
                }
                arrayList.add(ofFloat);
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.e0, (Property<ClippingImageView, Float>) View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.n6.d, 0, 255));
            iu0 iu0Var = photoViewer.b0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(iu0Var, (Property<iu0, Float>) property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.g0, (Property<View, Float>) property, 0.0f, 1.0f));
            if (photoViewer.Z1 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.z1, (Property<org.telegram.ui.Components.af0, Float>) property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new ss0(this, 6));
            photoViewer.b0.setLayerType(2, null);
            photoViewer.y2(false);
            photoViewer.l4 = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(new pr0(5, this, animatorSet));
        }
        backgroundDrawable.d = new pr0(6, this, qu0Var);
        xn xnVar = photoViewer.i4;
        if (xnVar == null || xnVar.getFragmentView() == null) {
            return true;
        }
        xn xnVar2 = photoViewer.i4;
        xnVar2.Q7();
        UndoView undoView = xnVar2.v3;
        if (undoView != null) {
            z4 = true;
            undoView.e(1, false);
        } else {
            z4 = true;
        }
        photoViewer.i4.getFragmentView().invalidate();
        return z4;
    }
}
