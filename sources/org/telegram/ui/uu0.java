package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class uu0 extends ImageView {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public org.telegram.ui.Components.t71 e;
    public final org.telegram.ui.Components.qr f;
    public ValueAnimator h;
    public final /* synthetic */ PhotoViewer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.n = photoViewer;
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = org.telegram.ui.Components.qr.i;
        setAlpha(0.0f);
    }

    public static void a(uu0 uu0Var) {
        PhotoViewer photoViewer = uu0Var.n;
        org.telegram.ui.Components.t71 t71Var = photoViewer.F2;
        if (t71Var == null || t71Var.p() == -9223372036854775807L) {
            ValueAnimator valueAnimator = uu0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                uu0Var.h = null;
            }
            uu0Var.setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
        float max2 = 1.0f - Math.max(Math.min(max / 250.0f, 1.0f), 0.0f);
        if (max2 <= 0.0f) {
            ValueAnimator valueAnimator2 = uu0Var.h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                uu0Var.h = null;
            }
            uu0Var.setAlpha(0.0f);
            return;
        }
        if (!photoViewer.F2.y()) {
            ValueAnimator valueAnimator3 = uu0Var.h;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                uu0Var.h = null;
            }
            uu0Var.setAlpha(max2);
            return;
        }
        if (uu0Var.h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
            uu0Var.h = ofFloat;
            ofFloat.addUpdateListener(new b3(uu0Var, 23));
            uu0Var.h.setDuration(max);
            uu0Var.h.setInterpolator(uu0Var.f);
            uu0Var.h.start();
            uu0Var.setAlpha(max2);
        }
    }
}
