package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class tu0 extends ImageView {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public org.telegram.ui.Components.g71 e;
    public final org.telegram.ui.Components.pr f;
    public ValueAnimator h;
    public final /* synthetic */ PhotoViewer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.n = photoViewer;
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = org.telegram.ui.Components.pr.i;
        setAlpha(0.0f);
    }

    public static void a(tu0 tu0Var) {
        PhotoViewer photoViewer = tu0Var.n;
        org.telegram.ui.Components.g71 g71Var = photoViewer.F2;
        if (g71Var == null || g71Var.p() == -9223372036854775807L) {
            ValueAnimator valueAnimator = tu0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                tu0Var.h = null;
            }
            tu0Var.setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
        float max2 = 1.0f - Math.max(Math.min(max / 250.0f, 1.0f), 0.0f);
        if (max2 <= 0.0f) {
            ValueAnimator valueAnimator2 = tu0Var.h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                tu0Var.h = null;
            }
            tu0Var.setAlpha(0.0f);
            return;
        }
        if (!photoViewer.F2.y()) {
            ValueAnimator valueAnimator3 = tu0Var.h;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                tu0Var.h = null;
            }
            tu0Var.setAlpha(max2);
            return;
        }
        if (tu0Var.h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
            tu0Var.h = ofFloat;
            ofFloat.addUpdateListener(new c3(tu0Var, 24));
            tu0Var.h.setDuration(max);
            tu0Var.h.setInterpolator(tu0Var.f);
            tu0Var.h.start();
            tu0Var.setAlpha(max2);
        }
    }
}
