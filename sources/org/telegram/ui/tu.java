package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class tu implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Activity d;
    public final /* synthetic */ org.telegram.ui.Components.sd e;

    public tu(org.telegram.ui.Components.sd sdVar, float f7, int i10, int i11, Activity activity) {
        this.e = sdVar;
        this.a = f7;
        this.b = i10;
        this.c = i11;
        this.d = activity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.a) / 150.0f));
        vu vuVar = (vu) this.e.d;
        vuVar.n = i0.b.f(max, this.b, this.c);
        int i10 = vuVar.n;
        Activity activity = this.d;
        org.telegram.messenger.i0.s3(activity, i10, false);
        org.telegram.messenger.i0.l3(activity, org.telegram.messenger.i0.B(vuVar.n) >= 0.721f);
    }
}
