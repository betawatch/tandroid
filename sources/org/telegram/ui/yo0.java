package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class yo0 implements org.telegram.ui.Components.q4, org.telegram.ui.ActionBar.u1, org.telegram.messenger.mc, r0.m {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ yo0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.a.z2(z10, i10, i11, false, false, false);
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        PhotoViewer photoViewer = this.a;
        qo0 qo0Var = photoViewer.v4;
        Rect rect = photoViewer.s2;
        Rect rect2 = new Rect(rect);
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        int i10 = j1Var.a.f(647).d;
        int i11 = I0.a;
        int i12 = I0.b;
        int i13 = I0.c;
        rect.set(i11, i12, i13, i10);
        if (!rect2.equals(rect)) {
            int i14 = photoViewer.n4;
            if (i14 == 1 || i14 == 3) {
                ClippingImageView clippingImageView = photoViewer.h0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.k4[0][2] = photoViewer.h0.getTranslationX();
            }
            fs0 fs0Var = photoViewer.g0;
            if (fs0Var != null) {
                fs0Var.requestLayout();
            }
        }
        View view2 = photoViewer.j0;
        if (view2 != null) {
            photoViewer.k0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i15 = photoViewer.k0;
            marginLayoutParams.height = i15;
            marginLayoutParams.bottomMargin = (-i15) / 2;
            photoViewer.j0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.e0.setPadding(i11, 0, i13, 0);
        if (photoViewer.F != null) {
            org.telegram.messenger.i0.r(qo0Var);
            if (photoViewer.e && photoViewer.n4 == 0) {
                org.telegram.messenger.i0.h3(qo0Var, 200L);
            }
        }
        return r0.j1.b;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.a.h3(0);
    }

    @Override // org.telegram.messenger.mc
    public void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        es0 es0Var;
        int i10;
        Bitmap n10;
        int i11;
        PhotoViewer photoViewer = this.a;
        if (imageReceiver == photoViewer.C4 && z10 && !z11) {
            if (!photoViewer.r1 && ((photoViewer.u4 == 1 || (i11 = photoViewer.c2) == 1 || i11 == 11) && photoViewer.C1 != null && (n10 = imageReceiver.n()) != null)) {
                org.telegram.ui.Components.be0 be0Var = photoViewer.C1;
                int i12 = imageReceiver.U;
                int i13 = photoViewer.c2;
                be0Var.b(n10, i12, (i13 == 1 || i13 == 11) ? false : true, true, photoViewer.D1, null, null);
            }
            if (photoViewer.y4.getVisibility() == 0) {
                photoViewer.e0.requestLayout();
            }
            photoViewer.R0();
        }
        if (imageReceiver != photoViewer.C4 || !z10 || (es0Var = photoViewer.d) == null || !es0Var.K() || photoViewer.k5 || (i10 = photoViewer.c2) == 1 || i10 == 11) {
            return;
        }
        if (photoViewer.T5) {
            photoViewer.Q2();
        } else {
            photoViewer.U5 = true;
        }
    }

    @Override // org.telegram.messenger.mc
    public /* synthetic */ void j(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.mc
    public /* synthetic */ void q(int i10, Drawable drawable) {
    }
}
