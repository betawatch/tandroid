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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class v implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClippingImageView[] a;
    public final /* synthetic */ ViewGroup.LayoutParams b;
    public final /* synthetic */ float c;
    public final /* synthetic */ p98 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ o98 f;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ Integer n;
    public final /* synthetic */ PhotoViewer r;

    public v(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f, p98 p98Var, float f2, o98 o98Var, ArrayList arrayList, Integer num) {
        this.r = photoViewer;
        this.a = clippingImageViewArr;
        this.b = layoutParams;
        this.c = f;
        this.d = p98Var;
        this.e = f2;
        this.f = o98Var;
        this.h = arrayList;
        this.n = num;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        float b;
        float f;
        float f2;
        boolean z;
        PhotoViewer photoViewer = this.r;
        Rect rect = photoViewer.t2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.M0;
        float[][] fArr = photoViewer.k4;
        ClippingImageView[] clippingImageViewArr = this.a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            ClippingImageView clippingImageView = clippingImageViewArr[1];
            Drawable[] drawableArr = PhotoViewer.f9;
            clippingImageView.setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView2 = clippingImageViewArr[0];
        float translationX = clippingImageView2.getTranslationX();
        Drawable[] drawableArr2 = PhotoViewer.f9;
        clippingImageView2.setTranslationX(translationX + rect.left);
        photoViewer.h0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i = photoViewer.d2;
        ViewGroup.LayoutParams layoutParams = this.b;
        if (i == 1) {
            float f3 = !photoViewer.s ? gl.m : 0;
            float measuredHeight = (photoViewer.D1.getMeasuredHeight() - gl.L(64.0f)) - f3;
            float min = Math.min(photoViewer.D1.getMeasuredWidth(), measuredHeight) - (gl.L(16.0f) << 1);
            float measuredWidth = photoViewer.D1.getMeasuredWidth() / 2.0f;
            float f4 = (measuredHeight / 2.0f) + f3;
            float f5 = min / 2.0f;
            float f6 = f4 - f5;
            float f7 = (f4 + f5) - f6;
            f = Math.max(((measuredWidth + f5) - (measuredWidth - f5)) / layoutParams.width, f7 / layoutParams.height);
            b = ((f7 - (layoutParams.height * f)) / 2.0f) + f6;
            int measuredWidth2 = photoViewer.h0.getMeasuredWidth();
            f2 = b00.b(layoutParams.width, f, (measuredWidth2 - r15) - rect.right, 2.0f) + rect.left;
        } else {
            float measuredWidth3 = photoViewer.h0.getMeasuredWidth() / layoutParams.width;
            Point point = gl.q;
            float min2 = Math.min(measuredWidth3, (point.y + (!photoViewer.s ? gl.m : 0)) / layoutParams.height);
            if (photoViewer.d2 == 11) {
                min2 = photoViewer.y1(true) * min2;
            }
            b = b00.b(layoutParams.height, min2, point.y + (!photoViewer.s ? gl.m : 0), 2.0f);
            float b2 = b00.b(layoutParams.width, min2, photoViewer.h0.getMeasuredWidth(), 2.0f);
            photoViewer.b6 = 0.0f;
            photoViewer.f6 = 0.0f;
            f = min2;
            f2 = b2;
        }
        p98 p98Var = this.d;
        int abs = (int) Math.abs(this.c - p98Var.a.L0);
        float f8 = p98Var.a.M0;
        float f9 = this.e;
        int abs2 = (int) Math.abs(f9 - f8);
        if (p98Var.a.S0) {
            abs = 0;
        }
        int[] iArr = new int[2];
        int i2 = 2;
        p98Var.d.getLocationInWindow(iArr);
        float f10 = p98Var.c + f9;
        int i3 = (int) ((iArr[1] - f10) + p98Var.j);
        if (i3 < 0) {
            i3 = 0;
        }
        int height = (int) (((f10 + layoutParams.height) - (p98Var.d.getHeight() + r10)) + p98Var.i);
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
        float f12 = p98Var.k;
        fArr2[4] = f11 * f12;
        fArr2[5] = max * f12;
        float f13 = max2 * f12;
        char c = 6;
        fArr2[6] = f13;
        int[] radius = photoViewer.i0.getRadius();
        int i4 = 0;
        while (i4 < 4) {
            char c2 = c;
            fArr[0][i4 + 7] = radius != null ? radius[i4] : 0.0f;
            i4++;
            c = c2;
        }
        float[] fArr3 = fArr[0];
        float f14 = p98Var.k;
        fArr3[11] = abs2 * f14;
        fArr3[12] = f11 * f14;
        float[] fArr4 = fArr[1];
        fArr4[0] = f;
        fArr4[1] = f;
        fArr4[2] = f2;
        fArr4[3] = b;
        fArr4[4] = 0.0f;
        fArr4[5] = 0.0f;
        fArr4[c] = 0.0f;
        fArr4[7] = 0.0f;
        fArr4[8] = 0.0f;
        fArr4[9] = 0.0f;
        byte b3 = 10;
        fArr4[10] = 0.0f;
        fArr4[11] = 0.0f;
        fArr4[12] = 0.0f;
        for (ClippingImageView clippingImageView3 : clippingImageViewArr) {
            clippingImageView3.setAnimationProgress(0.0f);
        }
        backgroundDrawable.setAlpha(0);
        photoViewer.f0.setAlpha(0.0f);
        photoViewer.k0.setAlpha(0.0f);
        ex7 ex7Var = new ex7((Object) this, (Object) clippingImageViewArr, (Object) this.h, (Object) this.n, (Object) this.f, (byte) 6);
        photoViewer.p4 = ex7Var;
        if (photoViewer.m2) {
            ex7Var.run();
            photoViewer.p4 = null;
            photoViewer.f0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(kk7.d4);
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
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i5], rn.f, fArr5);
                if (i5 == 0) {
                    ofFloat.addUpdateListener(new u28(this, (byte) 4));
                }
                arrayList.add(ofFloat);
                i5++;
                i2 = 2;
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.i0, (Property<ClippingImageView, Float>) View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, rn.d, 0, kk7.d4));
            k98 k98Var = photoViewer.f0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(k98Var, (Property<k98, Float>) property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.k0, (Property<View, Float>) property, 0.0f, 1.0f));
            if (photoViewer.d2 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.D1, (Property<v48, Float>) property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new l48(this, b3));
            photoViewer.f0.setLayerType(2, null);
            photoViewer.G1(false);
            photoViewer.o4 = System.currentTimeMillis();
            gl.d3(new h18(this, animatorSet, (byte) 12));
        }
        backgroundDrawable.d = new h18(this, p98Var, (byte) 13);
        mu1 mu1Var = photoViewer.l4;
        if (mu1Var == null || mu1Var.getFragmentView() == null) {
            return true;
        }
        mu1 mu1Var2 = photoViewer.l4;
        mu1Var2.Z5();
        UndoView undoView = mu1Var2.N3;
        if (undoView != null) {
            z = true;
            undoView.d(1, false);
        } else {
            z = true;
        }
        photoViewer.l4.getFragmentView().invalidate();
        return z;
    }
}
