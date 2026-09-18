package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class wu0 extends ImageView {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public org.telegram.ui.Components.h71 e;
    public final org.telegram.ui.Components.qr f;
    public ValueAnimator h;
    public final /* synthetic */ PhotoViewer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.n = photoViewer;
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = org.telegram.ui.Components.qr.i;
        setAlpha(0.0f);
    }

    public static void a(wu0 wu0Var) {
        PhotoViewer photoViewer = wu0Var.n;
        org.telegram.ui.Components.h71 h71Var = photoViewer.F2;
        if (h71Var == null || h71Var.p() == -9223372036854775807L) {
            ValueAnimator valueAnimator = wu0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                wu0Var.h = null;
            }
            wu0Var.setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
        float max2 = 1.0f - Math.max(Math.min(max / 250.0f, 1.0f), 0.0f);
        if (max2 <= 0.0f) {
            ValueAnimator valueAnimator2 = wu0Var.h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                wu0Var.h = null;
            }
            wu0Var.setAlpha(0.0f);
            return;
        }
        if (!photoViewer.F2.y()) {
            ValueAnimator valueAnimator3 = wu0Var.h;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                wu0Var.h = null;
            }
            wu0Var.setAlpha(max2);
            return;
        }
        if (wu0Var.h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
            wu0Var.h = ofFloat;
            ofFloat.addUpdateListener(new b3(wu0Var, 23));
            wu0Var.h.setDuration(max);
            wu0Var.h.setInterpolator(wu0Var.f);
            wu0Var.h.start();
            wu0Var.setAlpha(max2);
        }
    }
}
