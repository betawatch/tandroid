package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class qq0 extends ImageView {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public org.telegram.ui.Components.u51 e;
    public final org.telegram.ui.Components.xq f;
    public ValueAnimator h;
    public final /* synthetic */ PhotoViewer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.n = photoViewer;
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = org.telegram.ui.Components.xq.i;
        setAlpha(0.0f);
    }

    public static void a(qq0 qq0Var) {
        PhotoViewer photoViewer = qq0Var.n;
        org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
        if (u51Var == null || u51Var.U() == -9223372036854775807L) {
            ValueAnimator valueAnimator = qq0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                qq0Var.h = null;
            }
            qq0Var.setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.F2.U() - photoViewer.F2.S());
        float max2 = 1.0f - Math.max(Math.min(max / 250.0f, 1.0f), 0.0f);
        if (max2 <= 0.0f) {
            ValueAnimator valueAnimator2 = qq0Var.h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                qq0Var.h = null;
            }
            qq0Var.setAlpha(0.0f);
            return;
        }
        if (!photoViewer.F2.d0()) {
            ValueAnimator valueAnimator3 = qq0Var.h;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                qq0Var.h = null;
            }
            qq0Var.setAlpha(max2);
            return;
        }
        if (qq0Var.h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
            qq0Var.h = ofFloat;
            ofFloat.addUpdateListener(new a3(qq0Var, 22));
            qq0Var.h.setDuration(max);
            qq0Var.h.setInterpolator(qq0Var.f);
            qq0Var.h.start();
            qq0Var.setAlpha(max2);
        }
    }
}
