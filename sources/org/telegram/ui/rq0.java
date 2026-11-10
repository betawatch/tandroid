package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class rq0 extends ImageView {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public org.telegram.ui.Components.t51 e;
    public final org.telegram.ui.Components.wq f;
    public ValueAnimator h;
    public final /* synthetic */ PhotoViewer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.n = photoViewer;
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = org.telegram.ui.Components.wq.i;
        setAlpha(0.0f);
    }

    public static void a(rq0 rq0Var) {
        PhotoViewer photoViewer = rq0Var.n;
        org.telegram.ui.Components.t51 t51Var = photoViewer.F2;
        if (t51Var == null || t51Var.U() == -9223372036854775807L) {
            ValueAnimator valueAnimator = rq0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                rq0Var.h = null;
            }
            rq0Var.setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.F2.U() - photoViewer.F2.S());
        float max2 = 1.0f - Math.max(Math.min(max / 250.0f, 1.0f), 0.0f);
        if (max2 <= 0.0f) {
            ValueAnimator valueAnimator2 = rq0Var.h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                rq0Var.h = null;
            }
            rq0Var.setAlpha(0.0f);
            return;
        }
        if (!photoViewer.F2.d0()) {
            ValueAnimator valueAnimator3 = rq0Var.h;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                rq0Var.h = null;
            }
            rq0Var.setAlpha(max2);
            return;
        }
        if (rq0Var.h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
            rq0Var.h = ofFloat;
            ofFloat.addUpdateListener(new a3(rq0Var, 22));
            rq0Var.h.setDuration(max);
            rq0Var.h.setInterpolator(rq0Var.f);
            rq0Var.h.start();
            rq0Var.setAlpha(max2);
        }
    }
}
