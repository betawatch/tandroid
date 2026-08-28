package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class st0 extends ImageView {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public org.telegram.ui.Components.k61 e;
    public final org.telegram.ui.Components.gr f;
    public ValueAnimator h;
    public final /* synthetic */ PhotoViewer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.n = photoViewer;
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = org.telegram.ui.Components.gr.i;
        setAlpha(0.0f);
    }

    public static void a(st0 st0Var) {
        PhotoViewer photoViewer = st0Var.n;
        org.telegram.ui.Components.k61 k61Var = photoViewer.B2;
        if (k61Var == null || k61Var.q() == -9223372036854775807L) {
            ValueAnimator valueAnimator = st0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                st0Var.h = null;
            }
            st0Var.setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.B2.q() - photoViewer.B2.o());
        float max2 = 1.0f - Math.max(Math.min(max / 250.0f, 1.0f), 0.0f);
        if (max2 <= 0.0f) {
            ValueAnimator valueAnimator2 = st0Var.h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                st0Var.h = null;
            }
            st0Var.setAlpha(0.0f);
            return;
        }
        if (!photoViewer.B2.z()) {
            ValueAnimator valueAnimator3 = st0Var.h;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                st0Var.h = null;
            }
            st0Var.setAlpha(max2);
            return;
        }
        if (st0Var.h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
            st0Var.h = ofFloat;
            ofFloat.addUpdateListener(new f3(st0Var, 24));
            st0Var.h.setDuration(max);
            st0Var.h.setInterpolator(st0Var.f);
            st0Var.h.start();
            st0Var.setAlpha(max2);
        }
    }
}
