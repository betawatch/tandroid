package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qn0 implements org.telegram.ui.Components.a5, org.telegram.ui.ActionBar.q1, org.telegram.messenger.jc, r0.m {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ qn0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // org.telegram.ui.Components.a5
    public void O(int i7, int i10, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.Z8;
        this.a.u2(z10, i7, i10, false, false, false);
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        PhotoViewer photoViewer = this.a;
        hn0 hn0Var = photoViewer.v4;
        Rect rect = photoViewer.t2;
        Rect rect2 = new Rect(rect);
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        int i7 = l1Var.a.f(647).d;
        int i10 = I0.a;
        int i11 = I0.b;
        int i12 = I0.c;
        rect.set(i10, i11, i12, i7);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.n4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.i0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.k4[0][2] = photoViewer.i0.getTranslationX();
            }
            vq0 vq0Var = photoViewer.h0;
            if (vq0Var != null) {
                vq0Var.requestLayout();
            }
        }
        View view2 = photoViewer.k0;
        if (view2 != null) {
            photoViewer.l0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.l0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.k0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f0.setPadding(i10, 0, i12, 0);
        if (photoViewer.G != null) {
            org.telegram.messenger.g0.r(hn0Var);
            if (photoViewer.e && photoViewer.n4 == 0) {
                org.telegram.messenger.g0.h3(hn0Var, 200L);
            }
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        Drawable[] drawableArr = PhotoViewer.Z8;
        this.a.c3(0);
    }

    @Override // org.telegram.messenger.jc
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        uq0 uq0Var;
        int i7;
        Bitmap n10;
        int i10;
        PhotoViewer photoViewer = this.a;
        if (imageReceiver == photoViewer.C4 && z10 && !z11) {
            if (!photoViewer.s1 && ((photoViewer.u4 == 1 || (i10 = photoViewer.d2) == 1 || i10 == 11) && photoViewer.D1 != null && (n10 = imageReceiver.n()) != null)) {
                org.telegram.ui.Components.rd0 rd0Var = photoViewer.D1;
                int i11 = imageReceiver.V;
                int i12 = photoViewer.d2;
                rd0Var.b(n10, i11, (i12 == 1 || i12 == 11) ? false : true, true, photoViewer.E1, null, null);
            }
            if (photoViewer.y4.getVisibility() == 0) {
                photoViewer.f0.requestLayout();
            }
            photoViewer.K0();
        }
        if (imageReceiver != photoViewer.C4 || !z10 || (uq0Var = photoViewer.d) == null || !uq0Var.K() || photoViewer.k5 || (i7 = photoViewer.d2) == 1 || i7 == 11) {
            return;
        }
        if (photoViewer.T5) {
            photoViewer.L2();
        } else {
            photoViewer.U5 = true;
        }
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void V(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void G0(int i7, Drawable drawable) {
    }
}
