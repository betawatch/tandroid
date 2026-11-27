package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class v implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClippingImageView[] a;
    public final /* synthetic */ ViewGroup.LayoutParams b;
    public final /* synthetic */ float c;
    public final /* synthetic */ fd8 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ ed8 f;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ Integer n;
    public final /* synthetic */ PhotoViewer r;

    public v(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f, fd8 fd8Var, float f2, ed8 ed8Var, ArrayList arrayList, Integer num) {
        this.r = photoViewer;
        this.a = clippingImageViewArr;
        this.b = layoutParams;
        this.c = f;
        this.d = fd8Var;
        this.e = f2;
        this.f = ed8Var;
        this.h = arrayList;
        this.n = num;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        float c;
        float f;
        float f2;
        boolean z;
        PhotoViewer photoViewer = this.r;
        Rect rect = photoViewer.t2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.M0;
        float[][] fArr = photoViewer.j4;
        ClippingImageView[] clippingImageViewArr = this.a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            ClippingImageView clippingImageView = clippingImageViewArr[1];
            Drawable[] drawableArr = PhotoViewer.d9;
            clippingImageView.setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView2 = clippingImageViewArr[0];
        float translationX = clippingImageView2.getTranslationX();
        Drawable[] drawableArr2 = PhotoViewer.d9;
        clippingImageView2.setTranslationX(translationX + rect.left);
        photoViewer.h0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i = photoViewer.d2;
        byte b = 11;
        ViewGroup.LayoutParams layoutParams = this.b;
        if (i == 1) {
            float f3 = !photoViewer.s ? hl.m : 0;
            float measuredHeight = (photoViewer.D1.getMeasuredHeight() - hl.L(64.0f)) - f3;
            float min = Math.min(photoViewer.D1.getMeasuredWidth(), measuredHeight) - (hl.L(16.0f) << 1);
            float measuredWidth = photoViewer.D1.getMeasuredWidth() / 2.0f;
            float f4 = (measuredHeight / 2.0f) + f3;
            float f5 = min / 2.0f;
            float f6 = f4 - f5;
            float f7 = (f4 + f5) - f6;
            f = Math.max(((measuredWidth + f5) - (measuredWidth - f5)) / layoutParams.width, f7 / layoutParams.height);
            c = ((f7 - (layoutParams.height * f)) / 2.0f) + f6;
            int measuredWidth2 = photoViewer.h0.getMeasuredWidth();
            f2 = c00.c(layoutParams.width, f, (measuredWidth2 - r15) - rect.right, 2.0f) + rect.left;
        } else {
            float measuredWidth3 = photoViewer.h0.getMeasuredWidth() / layoutParams.width;
            Point point = hl.q;
            float min2 = Math.min(measuredWidth3, (point.y + (!photoViewer.s ? hl.m : 0)) / layoutParams.height);
            if (photoViewer.d2 == 11) {
                min2 = photoViewer.z1(true) * min2;
            }
            c = c00.c(layoutParams.height, min2, point.y + (!photoViewer.s ? hl.m : 0), 2.0f);
            float c2 = c00.c(layoutParams.width, min2, photoViewer.h0.getMeasuredWidth(), 2.0f);
            photoViewer.a6 = 0.0f;
            photoViewer.e6 = 0.0f;
            f = min2;
            f2 = c2;
        }
        fd8 fd8Var = this.d;
        int abs = (int) Math.abs(this.c - fd8Var.a.L0);
        float f8 = fd8Var.a.M0;
        float f9 = this.e;
        int abs2 = (int) Math.abs(f9 - f8);
        if (fd8Var.a.S0) {
            abs = 0;
        }
        int[] iArr = new int[2];
        int i2 = 2;
        fd8Var.d.getLocationInWindow(iArr);
        float f10 = fd8Var.c + f9;
        int i3 = (int) ((iArr[1] - f10) + fd8Var.j);
        if (i3 < 0) {
            i3 = 0;
        }
        int height = (int) (((f10 + layoutParams.height) - (fd8Var.d.getHeight() + r10)) + fd8Var.i);
        if (height < 0) {
            height = 0;
        }
        int max = Math.max(i3, abs2);
        int max2 = Math.max(height, abs2);
        fArr[0][0] = photoViewer.i0.getScaleX();
        fArr[0][1] = photoViewer.i0.getScaleY();
        fArr[0][2] = photoViewer.i0.getTranslationX();
        fArr[0][3] = photoViewer.i0.getTranslationY();
        float[] fArr2 = fArr[0];
        float f11 = abs;
        float f12 = fd8Var.k;
        fArr2[4] = f11 * f12;
        fArr2[5] = max * f12;
        char c3 = 6;
        fArr2[6] = max2 * f12;
        int[] radius = photoViewer.i0.getRadius();
        int i4 = 0;
        while (i4 < 4) {
            char c4 = c3;
            fArr[0][i4 + 7] = radius != null ? radius[i4] : 0.0f;
            i4++;
            c3 = c4;
        }
        float[] fArr3 = fArr[0];
        float f13 = fd8Var.k;
        fArr3[11] = abs2 * f13;
        fArr3[12] = f11 * f13;
        float[] fArr4 = fArr[1];
        fArr4[0] = f;
        fArr4[1] = f;
        fArr4[2] = f2;
        fArr4[3] = c;
        fArr4[4] = 0.0f;
        fArr4[5] = 0.0f;
        fArr4[c3] = 0.0f;
        byte b2 = 7;
        fArr4[7] = 0.0f;
        fArr4[8] = 0.0f;
        byte b3 = 9;
        fArr4[9] = 0.0f;
        fArr4[10] = 0.0f;
        fArr4[11] = 0.0f;
        fArr4[12] = 0.0f;
        for (ClippingImageView clippingImageView3 : clippingImageViewArr) {
            clippingImageView3.setAnimationProgress(0.0f);
        }
        backgroundDrawable.setAlpha(0);
        photoViewer.f0.setAlpha(0.0f);
        photoViewer.k0.setAlpha(0.0f);
        cp7 cp7Var = new cp7((Object) this, (Object) clippingImageViewArr, this.h, (Object) this.n, (Object) this.f, (byte) 7);
        photoViewer.o4 = cp7Var;
        if (photoViewer.m2) {
            cp7Var.run();
            photoViewer.o4 = null;
            photoViewer.f0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(jn7.d4);
            for (ClippingImageView clippingImageView4 : clippingImageViewArr) {
                clippingImageView4.setAnimationProgress(1.0f);
            }
            if (photoViewer.d2 == 1) {
                photoViewer.D1.setAlpha(1.0f);
            }
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList((photoViewer.d2 != 1 ? 2 : 3) + clippingImageViewArr.length + (clippingImageViewArr.length > 1 ? 1 : 0));
            int i5 = 0;
            while (i5 < clippingImageViewArr.length) {
                float[] fArr5 = new float[i2];
                // fill-array-data instruction
                fArr5[0] = 0.0f;
                fArr5[1] = 1.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i5], sn.f, fArr5);
                if (i5 == 0) {
                    ofFloat.addUpdateListener(new pv7(this, b2));
                }
                arrayList.add(ofFloat);
                i5++;
                i2 = 2;
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.i0, (Property<ClippingImageView, Float>) View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, sn.d, 0, jn7.d4));
            ad8 ad8Var = photoViewer.f0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(ad8Var, (Property<ad8, Float>) property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.k0, (Property<View, Float>) property, 0.0f, 1.0f));
            if (photoViewer.d2 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.D1, (Property<k88, Float>) property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new n88(this, b3));
            photoViewer.f0.setLayerType(2, null);
            photoViewer.H1(false);
            photoViewer.n4 = System.currentTimeMillis();
            hl.c3(new a58(this, animatorSet, b));
        }
        backgroundDrawable.d = new a58(this, fd8Var, (byte) 12);
        zu1 zu1Var = photoViewer.k4;
        if (zu1Var == null || zu1Var.getFragmentView() == null) {
            return true;
        }
        zu1 zu1Var2 = photoViewer.k4;
        zu1Var2.i6();
        UndoView undoView = zu1Var2.N3;
        if (undoView != null) {
            z = true;
            undoView.d(1, false);
        } else {
            z = true;
        }
        photoViewer.k4.getFragmentView().invalidate();
        return z;
    }
}
