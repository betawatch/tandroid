package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class yr0 extends ImageView {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public org.telegram.ui.Components.v61 e;
    public final org.telegram.ui.Components.gr f;
    public ValueAnimator h;
    public final /* synthetic */ PhotoViewer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.n = photoViewer;
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = org.telegram.ui.Components.gr.i;
        setAlpha(0.0f);
    }

    public static void a(yr0 yr0Var) {
        PhotoViewer photoViewer = yr0Var.n;
        org.telegram.ui.Components.v61 v61Var = photoViewer.F2;
        if (v61Var == null || v61Var.U() == -9223372036854775807L) {
            ValueAnimator valueAnimator = yr0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                yr0Var.h = null;
            }
            yr0Var.setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.F2.U() - photoViewer.F2.S());
        float max2 = 1.0f - Math.max(Math.min(max / 250.0f, 1.0f), 0.0f);
        if (max2 <= 0.0f) {
            ValueAnimator valueAnimator2 = yr0Var.h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                yr0Var.h = null;
            }
            yr0Var.setAlpha(0.0f);
            return;
        }
        if (!photoViewer.F2.d0()) {
            ValueAnimator valueAnimator3 = yr0Var.h;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                yr0Var.h = null;
            }
            yr0Var.setAlpha(max2);
            return;
        }
        if (yr0Var.h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
            yr0Var.h = ofFloat;
            ofFloat.addUpdateListener(new a3(yr0Var, 22));
            yr0Var.h.setDuration(max);
            yr0Var.h.setInterpolator(yr0Var.f);
            yr0Var.h.start();
            yr0Var.setAlpha(max2);
        }
    }
}
