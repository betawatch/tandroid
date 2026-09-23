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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class yt0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClippingImageView[] a;
    public final /* synthetic */ ViewGroup.LayoutParams b;
    public final /* synthetic */ float c;
    public final /* synthetic */ wu0 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ uu0 f;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ Integer n;
    public final /* synthetic */ PhotoViewer r;

    public yt0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f7, wu0 wu0Var, float f10, uu0 uu0Var, ArrayList arrayList, Integer num) {
        this.r = photoViewer;
        this.a = clippingImageViewArr;
        this.b = layoutParams;
        this.c = f7;
        this.d = wu0Var;
        this.e = f10;
        this.f = uu0Var;
        this.h = arrayList;
        this.n = num;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        char c10;
        float q22;
        float v;
        float v9;
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
        int i10 = photoViewer.c2;
        ViewGroup.LayoutParams layoutParams = this.b;
        if (i10 == 1) {
            float f7 = !photoViewer.s ? AndroidUtilities.statusBarHeight : 0;
            float measuredHeight = (photoViewer.C1.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - f7;
            c10 = 0;
            float min = Math.min(photoViewer.C1.getMeasuredWidth(), measuredHeight) - (AndroidUtilities.dp(16.0f) * 2);
            float measuredWidth = photoViewer.C1.getMeasuredWidth() / 2.0f;
            float f10 = (measuredHeight / 2.0f) + f7;
            float f11 = min / 2.0f;
            float f12 = f10 - f11;
            float f13 = (f10 + f11) - f12;
            q22 = Math.max(((measuredWidth + f11) - (measuredWidth - f11)) / layoutParams.width, f13 / layoutParams.height);
            v = ((f13 - (layoutParams.height * q22)) / 2.0f) + f12;
            int measuredWidth2 = photoViewer.g0.getMeasuredWidth();
            v9 = com.google.android.gms.internal.vision.e2.v(layoutParams.width, q22, (measuredWidth2 - r11) - rect.right, 2.0f) + rect.left;
        } else {
            c10 = 0;
            float min2 = Math.min(photoViewer.g0.getMeasuredWidth() / layoutParams.width, (AndroidUtilities.displaySize.y + (!photoViewer.s ? AndroidUtilities.statusBarHeight : 0)) / layoutParams.height);
            q22 = photoViewer.c2 == 11 ? photoViewer.q2(true) * min2 : min2;
            v = com.google.android.gms.internal.vision.e2.v(layoutParams.height, q22, AndroidUtilities.displaySize.y + (!photoViewer.s ? AndroidUtilities.statusBarHeight : 0), 2.0f);
            v9 = com.google.android.gms.internal.vision.e2.v(layoutParams.width, q22, photoViewer.g0.getMeasuredWidth(), 2.0f);
            photoViewer.b6 = 0.0f;
            photoViewer.f6 = 0.0f;
        }
        wu0 wu0Var = this.d;
        int abs = (int) Math.abs(this.c - wu0Var.a.getImageX());
        float imageY = wu0Var.a.getImageY();
        float f14 = this.e;
        int abs2 = (int) Math.abs(f14 - imageY);
        if (wu0Var.a.isAspectFit()) {
            abs = 0;
        }
        int[] iArr = new int[2];
        wu0Var.d.getLocationInWindow(iArr);
        float f15 = wu0Var.c + f14;
        int i11 = (int) ((iArr[1] - f15) + wu0Var.j);
        if (i11 < 0) {
            i11 = 0;
        }
        int height = (int) (((f15 + layoutParams.height) - (wu0Var.d.getHeight() + r10)) + wu0Var.i);
        if (height < 0) {
            height = 0;
        }
        int max = Math.max(i11, abs2);
        int max2 = Math.max(height, abs2);
        fArr[c10][c10] = photoViewer.h0.getScaleX();
        fArr[c10][1] = photoViewer.h0.getScaleY();
        fArr[c10][2] = photoViewer.h0.getTranslationX();
        fArr[c10][3] = photoViewer.h0.getTranslationY();
        float[] fArr2 = fArr[c10];
        float f16 = abs;
        float f17 = wu0Var.k;
        fArr2[4] = f16 * f17;
        fArr2[5] = max * f17;
        fArr2[6] = max2 * f17;
        int[] radius = photoViewer.h0.getRadius();
        for (int i12 = 0; i12 < 4; i12++) {
            fArr[c10][i12 + 7] = radius != null ? radius[i12] : 0.0f;
        }
        float[] fArr3 = fArr[c10];
        float f18 = wu0Var.k;
        fArr3[11] = abs2 * f18;
        fArr3[12] = f16 * f18;
        float[] fArr4 = fArr[1];
        fArr4[c10] = q22;
        fArr4[1] = q22;
        fArr4[2] = v9;
        fArr4[3] = v;
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
        photoViewer.e0.setAlpha(0.0f);
        photoViewer.j0.setAlpha(0.0f);
        d90 d90Var = new d90(this, clippingImageViewArr, this.h, this.n, this.f, 15);
        photoViewer.p4 = d90Var;
        if (photoViewer.l2) {
            d90Var.run();
            photoViewer.p4 = null;
            photoViewer.e0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(255);
            for (ClippingImageView clippingImageView3 : clippingImageViewArr) {
                clippingImageView3.setAnimationProgress(1.0f);
            }
            if (photoViewer.c2 == 1) {
                photoViewer.C1.setAlpha(1.0f);
            }
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList((photoViewer.c2 != 1 ? 2 : 3) + clippingImageViewArr.length + (clippingImageViewArr.length > 1 ? 1 : 0));
            for (int i13 = 0; i13 < clippingImageViewArr.length; i13++) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i13], org.telegram.ui.Components.s6.f, 0.0f, 1.0f);
                if (i13 == 0) {
                    ofFloat.addUpdateListener(new c3(this, 23));
                }
                arrayList.add(ofFloat);
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.h0, (Property<ClippingImageView, Float>) View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.s6.d, 0, 255));
            ou0 ou0Var = photoViewer.e0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(ou0Var, (Property<ou0, Float>) property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.j0, (Property<View, Float>) property, 0.0f, 1.0f));
            if (photoViewer.c2 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.C1, (Property<org.telegram.ui.Components.ue0, Float>) property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new wq0(this, 7));
            photoViewer.e0.setLayerType(2, null);
            photoViewer.x2(false);
            photoViewer.o4 = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(new gl0(19, this, animatorSet));
        }
        backgroundDrawable.d = new gl0(20, this, wu0Var);
        xn xnVar = photoViewer.l4;
        if (xnVar == null || xnVar.getFragmentView() == null) {
            return true;
        }
        xn xnVar2 = photoViewer.l4;
        xnVar2.Q7();
        UndoView undoView = xnVar2.y3;
        if (undoView != null) {
            z10 = true;
            undoView.e(1, false);
        } else {
            z10 = true;
        }
        photoViewer.l4.getFragmentView().invalidate();
        return z10;
    }
}
