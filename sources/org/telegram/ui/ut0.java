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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ut0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClippingImageView[] a;
    public final /* synthetic */ ViewGroup.LayoutParams b;
    public final /* synthetic */ float c;
    public final /* synthetic */ su0 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ qu0 f;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ Integer n;
    public final /* synthetic */ PhotoViewer r;

    public ut0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f7, su0 su0Var, float f10, qu0 qu0Var, ArrayList arrayList, Integer num) {
        this.r = photoViewer;
        this.a = clippingImageViewArr;
        this.b = layoutParams;
        this.c = f7;
        this.d = su0Var;
        this.e = f10;
        this.f = qu0Var;
        this.h = arrayList;
        this.n = num;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i10;
        float u22;
        float f7;
        float f10;
        boolean z10;
        PhotoViewer photoViewer = this.r;
        Rect rect = photoViewer.s2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.L0;
        float[][] fArr = photoViewer.k4;
        ClippingImageView[] clippingImageViewArr = this.a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            clippingImageViewArr[1].setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView = clippingImageViewArr[0];
        clippingImageView.setTranslationX(clippingImageView.getTranslationX() + rect.left);
        photoViewer.g0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i11 = photoViewer.c2;
        ViewGroup.LayoutParams layoutParams = this.b;
        if (i11 == 1) {
            float f11 = !photoViewer.s ? AndroidUtilities.statusBarHeight : 0;
            float measuredHeight = (photoViewer.C1.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - f11;
            i10 = 0;
            float min = Math.min(photoViewer.C1.getMeasuredWidth(), measuredHeight) - (AndroidUtilities.dp(16.0f) * 2);
            float measuredWidth = photoViewer.C1.getMeasuredWidth() / 2.0f;
            float f12 = (measuredHeight / 2.0f) + f11;
            float f13 = min / 2.0f;
            float f14 = f12 - f13;
            float f15 = (f12 + f13) - f14;
            u22 = Math.max(((measuredWidth + f13) - (measuredWidth - f13)) / layoutParams.width, f15 / layoutParams.height);
            f7 = ((f15 - (layoutParams.height * u22)) / 2.0f) + f14;
            int measuredWidth2 = photoViewer.g0.getMeasuredWidth();
            f10 = c3.h0.f(layoutParams.width, u22, (measuredWidth2 - r11) - rect.right, 2.0f) + rect.left;
        } else {
            i10 = 0;
            float min2 = Math.min(photoViewer.g0.getMeasuredWidth() / layoutParams.width, (AndroidUtilities.displaySize.y + (!photoViewer.s ? AndroidUtilities.statusBarHeight : 0)) / layoutParams.height);
            u22 = photoViewer.c2 == 11 ? photoViewer.u2(true) * min2 : min2;
            f7 = c3.h0.f(layoutParams.height, u22, AndroidUtilities.displaySize.y + (!photoViewer.s ? AndroidUtilities.statusBarHeight : 0), 2.0f);
            f10 = c3.h0.f(layoutParams.width, u22, photoViewer.g0.getMeasuredWidth(), 2.0f);
            photoViewer.b6 = 0.0f;
            photoViewer.f6 = 0.0f;
        }
        su0 su0Var = this.d;
        int abs = (int) Math.abs(this.c - su0Var.a.getImageX());
        float imageY = su0Var.a.getImageY();
        float f16 = this.e;
        int abs2 = (int) Math.abs(f16 - imageY);
        if (su0Var.a.isAspectFit()) {
            abs = i10;
        }
        int[] iArr = new int[2];
        int i12 = 2;
        su0Var.d.getLocationInWindow(iArr);
        float f17 = su0Var.c + f16;
        int i13 = (int) ((iArr[1] - f17) + su0Var.j);
        if (i13 < 0) {
            i13 = i10;
        }
        int height = (int) (((f17 + layoutParams.height) - (su0Var.d.getHeight() + r10)) + su0Var.i);
        if (height < 0) {
            height = i10;
        }
        int max = Math.max(i13, abs2);
        int max2 = Math.max(height, abs2);
        fArr[i10][i10] = photoViewer.h0.getScaleX();
        fArr[i10][1] = photoViewer.h0.getScaleY();
        fArr[i10][2] = photoViewer.h0.getTranslationX();
        fArr[i10][3] = photoViewer.h0.getTranslationY();
        float[] fArr2 = fArr[i10];
        float f18 = abs;
        float f19 = su0Var.k;
        fArr2[4] = f18 * f19;
        fArr2[5] = max * f19;
        float f20 = max2 * f19;
        char c10 = 6;
        fArr2[6] = f20;
        int[] radius = photoViewer.h0.getRadius();
        int i14 = i10;
        while (i14 < 4) {
            char c11 = c10;
            fArr[i10][i14 + 7] = radius != null ? radius[i14] : 0.0f;
            i14++;
            c10 = c11;
        }
        float[] fArr3 = fArr[i10];
        float f21 = su0Var.k;
        fArr3[11] = abs2 * f21;
        fArr3[12] = f18 * f21;
        float[] fArr4 = fArr[1];
        fArr4[i10] = u22;
        fArr4[1] = u22;
        fArr4[2] = f10;
        fArr4[3] = f7;
        fArr4[4] = 0.0f;
        fArr4[5] = 0.0f;
        fArr4[c10] = 0.0f;
        fArr4[7] = 0.0f;
        fArr4[8] = 0.0f;
        fArr4[9] = 0.0f;
        fArr4[10] = 0.0f;
        fArr4[11] = 0.0f;
        fArr4[12] = 0.0f;
        for (int i15 = i10; i15 < clippingImageViewArr.length; i15++) {
            clippingImageViewArr[i15].setAnimationProgress(0.0f);
        }
        backgroundDrawable.setAlpha(i10);
        photoViewer.e0.setAlpha(0.0f);
        photoViewer.j0.setAlpha(0.0f);
        org.telegram.ui.Components.i30 i30Var = new org.telegram.ui.Components.i30(this, clippingImageViewArr, this.h, this.n, this.f, 23);
        photoViewer.p4 = i30Var;
        if (photoViewer.l2) {
            i30Var.run();
            photoViewer.p4 = null;
            photoViewer.e0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(255);
            for (ClippingImageView clippingImageView2 : clippingImageViewArr) {
                clippingImageView2.setAnimationProgress(1.0f);
            }
            if (photoViewer.c2 == 1) {
                photoViewer.C1.setAlpha(1.0f);
            }
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList((photoViewer.c2 != 1 ? 2 : 3) + clippingImageViewArr.length + (clippingImageViewArr.length > 1 ? 1 : 0));
            int i16 = 0;
            while (i16 < clippingImageViewArr.length) {
                float[] fArr5 = new float[i12];
                // fill-array-data instruction
                fArr5[0] = 0.0f;
                fArr5[1] = 1.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i16], org.telegram.ui.Components.v6.f, fArr5);
                if (i16 == 0) {
                    ofFloat.addUpdateListener(new b3(this, 22));
                }
                arrayList.add(ofFloat);
                i16++;
                i12 = 2;
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.h0, (Property<ClippingImageView, Float>) View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.v6.d, 0, 255));
            ku0 ku0Var = photoViewer.e0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(ku0Var, (Property<ku0, Float>) property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.j0, (Property<View, Float>) property, 0.0f, 1.0f));
            if (photoViewer.c2 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.C1, (Property<org.telegram.ui.Components.pf0, Float>) property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new k50(this, 16));
            photoViewer.e0.setLayerType(2, null);
            photoViewer.B2(false);
            photoViewer.o4 = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(new am0(17, this, animatorSet));
        }
        backgroundDrawable.d = new am0(18, this, su0Var);
        wn wnVar = photoViewer.l4;
        if (wnVar == null || wnVar.getFragmentView() == null) {
            return true;
        }
        wn wnVar2 = photoViewer.l4;
        wnVar2.Z7();
        UndoView undoView = wnVar2.K3;
        if (undoView != null) {
            z10 = true;
            undoView.d(1, false);
        } else {
            z10 = true;
        }
        photoViewer.l4.getFragmentView().invalidate();
        return z10;
    }
}
