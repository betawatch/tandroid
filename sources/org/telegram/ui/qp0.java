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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qp0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClippingImageView[] a;
    public final /* synthetic */ ViewGroup.LayoutParams b;
    public final /* synthetic */ float c;
    public final /* synthetic */ mq0 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ kq0 f;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ Integer n;
    public final /* synthetic */ PhotoViewer r;

    public qp0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f10, mq0 mq0Var, float f11, kq0 kq0Var, ArrayList arrayList, Integer num) {
        this.r = photoViewer;
        this.a = clippingImageViewArr;
        this.b = layoutParams;
        this.c = f10;
        this.d = mq0Var;
        this.e = f11;
        this.f = kq0Var;
        this.h = arrayList;
        this.n = num;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i3;
        float c2;
        float f10;
        float f11;
        boolean z10;
        PhotoViewer photoViewer = this.r;
        Rect rect = photoViewer.t2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.M0;
        float[][] fArr = photoViewer.l4;
        ClippingImageView[] clippingImageViewArr = this.a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            clippingImageViewArr[1].setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView = clippingImageViewArr[0];
        clippingImageView.setTranslationX(clippingImageView.getTranslationX() + rect.left);
        photoViewer.h0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i10 = photoViewer.d2;
        int i11 = 11;
        ViewGroup.LayoutParams layoutParams = this.b;
        if (i10 == 1) {
            float f12 = !photoViewer.s ? org.telegram.messenger.g0.m : 0;
            float measuredHeight = (photoViewer.D1.getMeasuredHeight() - org.telegram.messenger.g0.L(64.0f)) - f12;
            i3 = 0;
            float min = Math.min(photoViewer.D1.getMeasuredWidth(), measuredHeight) - (org.telegram.messenger.g0.L(16.0f) * 2);
            float measuredWidth = photoViewer.D1.getMeasuredWidth() / 2.0f;
            float f13 = (measuredHeight / 2.0f) + f12;
            float f14 = min / 2.0f;
            float f15 = f13 - f14;
            float f16 = (f13 + f14) - f15;
            f10 = Math.max(((measuredWidth + f14) - (measuredWidth - f14)) / layoutParams.width, f16 / layoutParams.height);
            c2 = ((f16 - (layoutParams.height * f10)) / 2.0f) + f15;
            int measuredWidth2 = photoViewer.h0.getMeasuredWidth();
            f11 = com.google.android.recaptcha.internal.a.c(layoutParams.width, f10, (measuredWidth2 - r10) - rect.right, 2.0f) + rect.left;
        } else {
            i3 = 0;
            float measuredWidth3 = photoViewer.h0.getMeasuredWidth() / layoutParams.width;
            Point point = org.telegram.messenger.g0.q;
            float min2 = Math.min(measuredWidth3, (point.y + (!photoViewer.s ? org.telegram.messenger.g0.m : 0)) / layoutParams.height);
            if (photoViewer.d2 == 11) {
                min2 = photoViewer.u2(true) * min2;
            }
            c2 = com.google.android.recaptcha.internal.a.c(layoutParams.height, min2, point.y + (!photoViewer.s ? org.telegram.messenger.g0.m : 0), 2.0f);
            float c10 = com.google.android.recaptcha.internal.a.c(layoutParams.width, min2, photoViewer.h0.getMeasuredWidth(), 2.0f);
            photoViewer.c6 = 0.0f;
            photoViewer.g6 = 0.0f;
            f10 = min2;
            f11 = c10;
        }
        mq0 mq0Var = this.d;
        int abs = (int) Math.abs(this.c - mq0Var.a.L0);
        float f17 = mq0Var.a.M0;
        float f18 = this.e;
        int abs2 = (int) Math.abs(f18 - f17);
        if (mq0Var.a.S0) {
            abs = i3;
        }
        int[] iArr = new int[2];
        int i12 = 2;
        mq0Var.d.getLocationInWindow(iArr);
        float f19 = mq0Var.c + f18;
        int i13 = (int) ((iArr[1] - f19) + mq0Var.j);
        if (i13 < 0) {
            i13 = i3;
        }
        int height = (int) (((f19 + layoutParams.height) - (mq0Var.d.getHeight() + r9)) + mq0Var.i);
        if (height < 0) {
            height = i3;
        }
        int max = Math.max(i13, abs2);
        int max2 = Math.max(height, abs2);
        fArr[i3][i3] = photoViewer.i0.getScaleX();
        fArr[i3][1] = photoViewer.i0.getScaleY();
        fArr[i3][2] = photoViewer.i0.getTranslationX();
        fArr[i3][3] = photoViewer.i0.getTranslationY();
        float[] fArr2 = fArr[i3];
        float f20 = abs;
        float f21 = mq0Var.k;
        fArr2[4] = f20 * f21;
        fArr2[5] = max * f21;
        char c11 = 6;
        fArr2[6] = max2 * f21;
        int[] radius = photoViewer.i0.getRadius();
        int i14 = i3;
        while (i14 < 4) {
            char c12 = c11;
            fArr[i3][i14 + 7] = radius != null ? radius[i14] : 0.0f;
            i14++;
            c11 = c12;
        }
        float[] fArr3 = fArr[i3];
        float f22 = mq0Var.k;
        fArr3[11] = abs2 * f22;
        fArr3[12] = f20 * f22;
        float[] fArr4 = fArr[1];
        fArr4[i3] = f10;
        fArr4[1] = f10;
        fArr4[2] = f11;
        fArr4[3] = c2;
        fArr4[4] = 0.0f;
        fArr4[5] = 0.0f;
        fArr4[c11] = 0.0f;
        fArr4[7] = 0.0f;
        fArr4[8] = 0.0f;
        fArr4[9] = 0.0f;
        int i15 = 10;
        fArr4[10] = 0.0f;
        fArr4[11] = 0.0f;
        fArr4[12] = 0.0f;
        for (int i16 = i3; i16 < clippingImageViewArr.length; i16++) {
            clippingImageViewArr[i16].setAnimationProgress(0.0f);
        }
        backgroundDrawable.setAlpha(i3);
        photoViewer.f0.setAlpha(0.0f);
        photoViewer.k0.setAlpha(0.0f);
        lq lqVar = new lq(this, clippingImageViewArr, this.h, this.n, this.f);
        photoViewer.q4 = lqVar;
        if (photoViewer.m2) {
            lqVar.run();
            photoViewer.q4 = null;
            photoViewer.f0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(org.telegram.messenger.hs.e4);
            for (ClippingImageView clippingImageView2 : clippingImageViewArr) {
                clippingImageView2.setAnimationProgress(1.0f);
            }
            if (photoViewer.d2 == 1) {
                photoViewer.D1.setAlpha(1.0f);
            }
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList((photoViewer.d2 != 1 ? 2 : 3) + clippingImageViewArr.length + (clippingImageViewArr.length > 1 ? 1 : 0));
            int i17 = 0;
            while (i17 < clippingImageViewArr.length) {
                float[] fArr5 = new float[i12];
                // fill-array-data instruction
                fArr5[0] = 0.0f;
                fArr5[1] = 1.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i17], org.telegram.ui.Components.k6.f, fArr5);
                if (i17 == 0) {
                    ofFloat.addUpdateListener(new b3(this, 21));
                }
                arrayList.add(ofFloat);
                i17++;
                i12 = 2;
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.i0, (Property<ClippingImageView, Float>) View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.k6.d, 0, org.telegram.messenger.hs.e4));
            gq0 gq0Var = photoViewer.f0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(gq0Var, (Property<gq0, Float>) property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.k0, (Property<View, Float>) property, 0.0f, 1.0f));
            if (photoViewer.d2 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.D1, (Property<org.telegram.ui.Components.ad0, Float>) property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new y20(this, 16));
            photoViewer.f0.setLayerType(2, null);
            photoViewer.B2(false);
            photoViewer.p4 = System.currentTimeMillis();
            org.telegram.messenger.g0.h3(new hk0(i15, this, animatorSet));
        }
        backgroundDrawable.d = new hk0(i11, this, mq0Var);
        wm wmVar = photoViewer.m4;
        if (wmVar == null || wmVar.getFragmentView() == null) {
            return true;
        }
        wm wmVar2 = photoViewer.m4;
        wmVar2.f8();
        UndoView undoView = wmVar2.N3;
        if (undoView != null) {
            z10 = true;
            undoView.d(1, false);
        } else {
            z10 = true;
        }
        photoViewer.m4.getFragmentView().invalidate();
        return z10;
    }
}
