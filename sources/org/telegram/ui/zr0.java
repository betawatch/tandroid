package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zr0 extends ImageView {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public org.telegram.ui.Components.u61 e;
    public final org.telegram.ui.Components.gr f;
    public ValueAnimator h;
    public final /* synthetic */ PhotoViewer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.n = photoViewer;
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = org.telegram.ui.Components.gr.i;
        setAlpha(0.0f);
    }

    public static void a(zr0 zr0Var) {
        PhotoViewer photoViewer = zr0Var.n;
        org.telegram.ui.Components.u61 u61Var = photoViewer.F2;
        if (u61Var == null || u61Var.U() == -9223372036854775807L) {
            ValueAnimator valueAnimator = zr0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                zr0Var.h = null;
            }
            zr0Var.setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.F2.U() - photoViewer.F2.S());
        float max2 = 1.0f - Math.max(Math.min(max / 250.0f, 1.0f), 0.0f);
        if (max2 <= 0.0f) {
            ValueAnimator valueAnimator2 = zr0Var.h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                zr0Var.h = null;
            }
            zr0Var.setAlpha(0.0f);
            return;
        }
        if (!photoViewer.F2.d0()) {
            ValueAnimator valueAnimator3 = zr0Var.h;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                zr0Var.h = null;
            }
            zr0Var.setAlpha(max2);
            return;
        }
        if (zr0Var.h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
            zr0Var.h = ofFloat;
            ofFloat.addUpdateListener(new a3(zr0Var, 22));
            zr0Var.h.setDuration(max);
            zr0Var.h.setInterpolator(zr0Var.f);
            zr0Var.h.start();
            zr0Var.setAlpha(max2);
        }
    }
}
