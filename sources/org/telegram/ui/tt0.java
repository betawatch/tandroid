package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class tt0 extends ImageView {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public org.telegram.ui.Components.m61 e;
    public final org.telegram.ui.Components.er f;
    public ValueAnimator h;
    public final /* synthetic */ PhotoViewer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.n = photoViewer;
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = org.telegram.ui.Components.er.i;
        setAlpha(0.0f);
    }

    public static void a(tt0 tt0Var) {
        PhotoViewer photoViewer = tt0Var.n;
        org.telegram.ui.Components.m61 m61Var = photoViewer.B2;
        if (m61Var == null || m61Var.q() == -9223372036854775807L) {
            ValueAnimator valueAnimator = tt0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                tt0Var.h = null;
            }
            tt0Var.setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.B2.q() - photoViewer.B2.o());
        float max2 = 1.0f - Math.max(Math.min(max / 250.0f, 1.0f), 0.0f);
        if (max2 <= 0.0f) {
            ValueAnimator valueAnimator2 = tt0Var.h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                tt0Var.h = null;
            }
            tt0Var.setAlpha(0.0f);
            return;
        }
        if (!photoViewer.B2.z()) {
            ValueAnimator valueAnimator3 = tt0Var.h;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                tt0Var.h = null;
            }
            tt0Var.setAlpha(max2);
            return;
        }
        if (tt0Var.h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
            tt0Var.h = ofFloat;
            ofFloat.addUpdateListener(new g3(tt0Var, 24));
            tt0Var.h.setDuration(max);
            tt0Var.h.setInterpolator(tt0Var.f);
            tt0Var.h.start();
            tt0Var.setAlpha(max2);
        }
    }
}
