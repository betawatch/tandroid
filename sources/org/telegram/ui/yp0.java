package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class yp0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClippingImageView[] a;
    public final /* synthetic */ ViewGroup.LayoutParams b;
    public final /* synthetic */ float c;
    public final /* synthetic */ vq0 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ tq0 f;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ Integer n;
    public final /* synthetic */ PhotoViewer r;

    public yp0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f10, vq0 vq0Var, float f11, tq0 tq0Var, ArrayList arrayList, Integer num) {
        this.r = photoViewer;
        this.a = clippingImageViewArr;
        this.b = layoutParams;
        this.c = f10;
        this.d = vq0Var;
        this.e = f11;
        this.f = tq0Var;
        this.h = arrayList;
        this.n = num;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i7;
        float w10;
        float f10;
        float f11;
        boolean z9;
        PhotoViewer photoViewer = this.r;
        Rect rect = photoViewer.s2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.L0;
        float[][] fArr = photoViewer.j4;
        ClippingImageView[] clippingImageViewArr = this.a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            clippingImageViewArr[1].setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView = clippingImageViewArr[0];
        clippingImageView.setTranslationX(clippingImageView.getTranslationX() + rect.left);
        photoViewer.g0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i10 = photoViewer.c2;
        ViewGroup.LayoutParams layoutParams = this.b;
        if (i10 == 1) {
            float f12 = !photoViewer.s ? org.telegram.messenger.g0.m : 0;
            float measuredHeight = (photoViewer.C1.getMeasuredHeight() - org.telegram.messenger.g0.L(64.0f)) - f12;
            i7 = 0;
            float min = Math.min(photoViewer.C1.getMeasuredWidth(), measuredHeight) - (org.telegram.messenger.g0.L(16.0f) * 2);
            float measuredWidth = photoViewer.C1.getMeasuredWidth() / 2.0f;
            float f13 = (measuredHeight / 2.0f) + f12;
            float f14 = min / 2.0f;
            float f15 = f13 - f14;
            float f16 = (f13 + f14) - f15;
            f10 = Math.max(((measuredWidth + f14) - (measuredWidth - f14)) / layoutParams.width, f16 / layoutParams.height);
            w10 = ((f16 - (layoutParams.height * f10)) / 2.0f) + f15;
            int measuredWidth2 = photoViewer.g0.getMeasuredWidth();
            f11 = com.google.android.recaptcha.internal.a.w(layoutParams.width, f10, (measuredWidth2 - r11) - rect.right, 2.0f) + rect.left;
        } else {
            i7 = 0;
            float measuredWidth3 = photoViewer.g0.getMeasuredWidth() / layoutParams.width;
            Point point = org.telegram.messenger.g0.q;
            float min2 = Math.min(measuredWidth3, (point.y + (!photoViewer.s ? org.telegram.messenger.g0.m : 0)) / layoutParams.height);
            if (photoViewer.c2 == 11) {
                min2 = photoViewer.o2(true) * min2;
            }
            w10 = com.google.android.recaptcha.internal.a.w(layoutParams.height, min2, point.y + (!photoViewer.s ? org.telegram.messenger.g0.m : 0), 2.0f);
            float w11 = com.google.android.recaptcha.internal.a.w(layoutParams.width, min2, photoViewer.g0.getMeasuredWidth(), 2.0f);
            photoViewer.a6 = 0.0f;
            photoViewer.e6 = 0.0f;
            f10 = min2;
            f11 = w11;
        }
        vq0 vq0Var = this.d;
        int abs = (int) Math.abs(this.c - vq0Var.a.K0);
        float f17 = vq0Var.a.L0;
        float f18 = this.e;
        int abs2 = (int) Math.abs(f18 - f17);
        if (vq0Var.a.R0) {
            abs = i7;
        }
        int[] iArr = new int[2];
        int i11 = 2;
        vq0Var.d.getLocationInWindow(iArr);
        float f19 = vq0Var.c + f18;
        int i12 = (int) ((iArr[1] - f19) + vq0Var.j);
        if (i12 < 0) {
            i12 = i7;
        }
        int height = (int) (((f19 + layoutParams.height) - (vq0Var.d.getHeight() + r10)) + vq0Var.i);
        if (height < 0) {
            height = i7;
        }
        int max = Math.max(i12, abs2);
        int max2 = Math.max(height, abs2);
        fArr[i7][i7] = photoViewer.h0.getScaleX();
        fArr[i7][1] = photoViewer.h0.getScaleY();
        fArr[i7][2] = photoViewer.h0.getTranslationX();
        fArr[i7][3] = photoViewer.h0.getTranslationY();
        float[] fArr2 = fArr[i7];
        float f20 = abs;
        float f21 = vq0Var.k;
        fArr2[4] = f20 * f21;
        fArr2[5] = max * f21;
        float f22 = max2 * f21;
        int i13 = 6;
        fArr2[6] = f22;
        int[] radius = photoViewer.h0.getRadius();
        int i14 = i7;
        while (i14 < 4) {
            int i15 = i13;
            fArr[i7][i14 + 7] = radius != null ? radius[i14] : 0.0f;
            i14++;
            i13 = i15;
        }
        int i16 = i13;
        float[] fArr3 = fArr[i7];
        float f23 = vq0Var.k;
        fArr3[11] = abs2 * f23;
        fArr3[12] = f20 * f23;
        float[] fArr4 = fArr[1];
        fArr4[i7] = f10;
        fArr4[1] = f10;
        fArr4[2] = f11;
        fArr4[3] = w10;
        fArr4[4] = 0.0f;
        fArr4[5] = 0.0f;
        fArr4[i16] = 0.0f;
        fArr4[7] = 0.0f;
        fArr4[8] = 0.0f;
        fArr4[9] = 0.0f;
        fArr4[10] = 0.0f;
        fArr4[11] = 0.0f;
        fArr4[12] = 0.0f;
        for (int i17 = i7; i17 < clippingImageViewArr.length; i17++) {
            clippingImageViewArr[i17].setAnimationProgress(0.0f);
        }
        backgroundDrawable.setAlpha(i7);
        photoViewer.e0.setAlpha(0.0f);
        photoViewer.j0.setAlpha(0.0f);
        org.telegram.ui.Components.jv0 jv0Var = new org.telegram.ui.Components.jv0(this, clippingImageViewArr, this.h, this.n, this.f, 22);
        photoViewer.o4 = jv0Var;
        if (photoViewer.l2) {
            jv0Var.run();
            photoViewer.o4 = null;
            photoViewer.e0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(org.telegram.messenger.qs.e4);
            for (ClippingImageView clippingImageView2 : clippingImageViewArr) {
                clippingImageView2.setAnimationProgress(1.0f);
            }
            if (photoViewer.c2 == 1) {
                photoViewer.C1.setAlpha(1.0f);
            }
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList((photoViewer.c2 != 1 ? 2 : 3) + clippingImageViewArr.length + (clippingImageViewArr.length > 1 ? 1 : 0));
            int i18 = 0;
            while (i18 < clippingImageViewArr.length) {
                float[] fArr5 = new float[i11];
                // fill-array-data instruction
                fArr5[0] = 0.0f;
                fArr5[1] = 1.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i18], org.telegram.ui.Components.m6.f, fArr5);
                if (i18 == 0) {
                    ofFloat.addUpdateListener(new a3(this, 21));
                }
                arrayList.add(ofFloat);
                i18++;
                i11 = 2;
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.h0, (Property<ClippingImageView, Float>) View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.m6.d, 0, org.telegram.messenger.qs.e4));
            oq0 oq0Var = photoViewer.e0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(oq0Var, (Property<oq0, Float>) property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.j0, (Property<View, Float>) property, 0.0f, 1.0f));
            if (photoViewer.c2 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.C1, (Property<org.telegram.ui.Components.fd0, Float>) property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new d30(this, 16));
            photoViewer.e0.setLayerType(2, null);
            photoViewer.v2(false);
            photoViewer.n4 = System.currentTimeMillis();
            org.telegram.messenger.g0.h3(new qn0(5, this, animatorSet));
        }
        backgroundDrawable.d = new qn0(i16, this, vq0Var);
        an anVar = photoViewer.k4;
        if (anVar == null || anVar.getFragmentView() == null) {
            return true;
        }
        an anVar2 = photoViewer.k4;
        anVar2.f8();
        UndoView undoView = anVar2.M3;
        if (undoView != null) {
            z9 = true;
            undoView.d(1, false);
        } else {
            z9 = true;
        }
        photoViewer.k4.getFragmentView().invalidate();
        return z9;
    }
}
