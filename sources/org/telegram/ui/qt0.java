package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class qt0 extends ImageView {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public org.telegram.ui.Components.x61 e;
    public final org.telegram.ui.Components.jr f;
    public ValueAnimator h;
    public final /* synthetic */ PhotoViewer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.n = photoViewer;
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = org.telegram.ui.Components.jr.i;
        setAlpha(0.0f);
    }

    public static void a(qt0 qt0Var) {
        PhotoViewer photoViewer = qt0Var.n;
        org.telegram.ui.Components.x61 x61Var = photoViewer.B2;
        if (x61Var == null || x61Var.q() == -9223372036854775807L) {
            ValueAnimator valueAnimator = qt0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                qt0Var.h = null;
            }
            qt0Var.setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.B2.q() - photoViewer.B2.o());
        float max2 = 1.0f - Math.max(Math.min(max / 250.0f, 1.0f), 0.0f);
        if (max2 <= 0.0f) {
            ValueAnimator valueAnimator2 = qt0Var.h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                qt0Var.h = null;
            }
            qt0Var.setAlpha(0.0f);
            return;
        }
        if (!photoViewer.B2.z()) {
            ValueAnimator valueAnimator3 = qt0Var.h;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                qt0Var.h = null;
            }
            qt0Var.setAlpha(max2);
            return;
        }
        if (qt0Var.h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
            qt0Var.h = ofFloat;
            ofFloat.addUpdateListener(new g3(qt0Var, 24));
            qt0Var.h.setDuration(max);
            qt0Var.h.setInterpolator(qt0Var.f);
            qt0Var.h.start();
            qt0Var.setAlpha(max2);
        }
    }
}
