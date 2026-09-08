package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.a2, ImageReceiver.ImageReceiverDelegate, r0.n {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ qr0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.T8;
        this.a.w2(z10, i10, i11, false, false, false);
    }

    @Override // r0.n
    public r0.l1 T0(View view, r0.l1 l1Var) {
        PhotoViewer photoViewer = this.a;
        ir0 ir0Var = photoViewer.v4;
        Rect rect = photoViewer.s2;
        Rect rect2 = new Rect(rect);
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.a;
        int i11 = defaultWindowInsets.b;
        int i12 = defaultWindowInsets.c;
        rect.set(i10, i11, i12, defaultWindowInsets.d);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.n4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.h0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.k4[0][2] = photoViewer.h0.getTranslationX();
            }
            bv0 bv0Var = photoViewer.g0;
            if (bv0Var != null) {
                bv0Var.requestLayout();
            }
        }
        View view2 = photoViewer.j0;
        if (view2 != null) {
            photoViewer.k0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.k0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.j0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.e0.setPadding(defaultWindowInsets.a, 0, i12, 0);
        if (photoViewer.F != null) {
            AndroidUtilities.cancelRunOnUIThread(ir0Var);
            if (photoViewer.e && photoViewer.n4 == 0) {
                AndroidUtilities.runOnUIThread(ir0Var, 200L);
            }
        }
        return r0.l1.b;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        av0 av0Var;
        int i10;
        Bitmap bitmap;
        int i11;
        PhotoViewer photoViewer = this.a;
        if (imageReceiver == photoViewer.C4 && z10 && !z11) {
            if (!photoViewer.r1 && ((photoViewer.u4 == 1 || (i11 = photoViewer.c2) == 1 || i11 == 11) && photoViewer.C1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.ue0 ue0Var = photoViewer.C1;
                int orientation = imageReceiver.getOrientation();
                int i12 = photoViewer.c2;
                ue0Var.b(bitmap, orientation, (i12 == 1 || i12 == 11) ? false : true, true, photoViewer.D1, null, null);
            }
            if (photoViewer.y4.getVisibility() == 0) {
                photoViewer.e0.requestLayout();
            }
            photoViewer.Q0();
        }
        if (imageReceiver != photoViewer.C4 || !z10 || (av0Var = photoViewer.d) == null || !av0Var.J() || photoViewer.k5 || (i10 = photoViewer.c2) == 1 || i10 == 11) {
            return;
        }
        if (photoViewer.T5) {
            photoViewer.N2();
        } else {
            photoViewer.U5 = true;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        Drawable[] drawableArr = PhotoViewer.T8;
        this.a.e3(0);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }
}
