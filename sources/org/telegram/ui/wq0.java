package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wq0 implements org.telegram.ui.Components.y4, org.telegram.ui.ActionBar.c2, ImageReceiver.ImageReceiverDelegate, r0.o {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ wq0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // org.telegram.ui.Components.y4
    public void I(int i10, int i11, boolean z4) {
        Drawable[] drawableArr = PhotoViewer.Q8;
        this.a.w2(z4, i10, i11, false, false, false);
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        PhotoViewer photoViewer = this.a;
        oq0 oq0Var = photoViewer.s4;
        Rect rect = photoViewer.p2;
        Rect rect2 = new Rect(rect);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.a;
        int i11 = defaultWindowInsets.b;
        int i12 = defaultWindowInsets.c;
        rect.set(i10, i11, i12, defaultWindowInsets.d);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.k4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.e0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.h4[0][2] = photoViewer.e0.getTranslationX();
            }
            ku0 ku0Var = photoViewer.d0;
            if (ku0Var != null) {
                ku0Var.requestLayout();
            }
        }
        View view2 = photoViewer.g0;
        if (view2 != null) {
            photoViewer.h0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.h0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.g0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.b0.setPadding(defaultWindowInsets.a, 0, i12, 0);
        if (photoViewer.C != null) {
            AndroidUtilities.cancelRunOnUIThread(oq0Var);
            if (photoViewer.e && photoViewer.k4 == 0) {
                AndroidUtilities.runOnUIThread(oq0Var, 200L);
            }
        }
        return r0.m1.b;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        ju0 ju0Var;
        int i10;
        Bitmap bitmap;
        int i11;
        PhotoViewer photoViewer = this.a;
        if (imageReceiver == photoViewer.z4 && z4 && !z10) {
            if (!photoViewer.o1 && ((photoViewer.r4 == 1 || (i11 = photoViewer.Z1) == 1 || i11 == 11) && photoViewer.z1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.af0 af0Var = photoViewer.z1;
                int orientation = imageReceiver.getOrientation();
                int i12 = photoViewer.Z1;
                af0Var.b(bitmap, orientation, (i12 == 1 || i12 == 11) ? false : true, true, photoViewer.A1, null, null);
            }
            if (photoViewer.v4.getVisibility() == 0) {
                photoViewer.b0.requestLayout();
            }
            photoViewer.Q0();
        }
        if (imageReceiver != photoViewer.z4 || !z4 || (ju0Var = photoViewer.d) == null || !ju0Var.J() || photoViewer.h5 || (i10 = photoViewer.Z1) == 1 || i10 == 11) {
            return;
        }
        if (photoViewer.Q5) {
            photoViewer.N2();
        } else {
            photoViewer.R5 = true;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        Drawable[] drawableArr = PhotoViewer.Q8;
        this.a.e3(0);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.j5.b(this, imageReceiver);
    }
}
