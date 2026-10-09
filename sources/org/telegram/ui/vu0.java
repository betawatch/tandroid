package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class vu0 extends ImageView {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public org.telegram.ui.Components.k81 e;
    public final org.telegram.ui.Components.hs f;
    public ValueAnimator h;
    public final /* synthetic */ PhotoViewer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.n = photoViewer;
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = org.telegram.ui.Components.hs.i;
        setAlpha(0.0f);
    }

    public static void a(vu0 vu0Var) {
        PhotoViewer photoViewer = vu0Var.n;
        org.telegram.ui.Components.k81 k81Var = photoViewer.F2;
        if (k81Var == null || k81Var.p() == -9223372036854775807L) {
            ValueAnimator valueAnimator = vu0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                vu0Var.h = null;
            }
            vu0Var.setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
        float max2 = 1.0f - Math.max(Math.min(max / 250.0f, 1.0f), 0.0f);
        if (max2 <= 0.0f) {
            ValueAnimator valueAnimator2 = vu0Var.h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                vu0Var.h = null;
            }
            vu0Var.setAlpha(0.0f);
            return;
        }
        if (!photoViewer.F2.y()) {
            ValueAnimator valueAnimator3 = vu0Var.h;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                vu0Var.h = null;
            }
            vu0Var.setAlpha(max2);
            return;
        }
        if (vu0Var.h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
            vu0Var.h = ofFloat;
            ofFloat.addUpdateListener(new c3(vu0Var, 24));
            vu0Var.h.setDuration(max);
            vu0Var.h.setInterpolator(vu0Var.f);
            vu0Var.h.start();
            vu0Var.setAlpha(max2);
        }
    }
}
