package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ut implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Activity d;
    public final /* synthetic */ org.telegram.ui.Components.wd e;

    public ut(org.telegram.ui.Components.wd wdVar, float f10, int i7, int i10, Activity activity) {
        this.e = wdVar;
        this.a = f10;
        this.b = i7;
        this.c = i10;
        this.d = activity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.a) / 150.0f));
        wt wtVar = (wt) this.e.d;
        wtVar.n = i0.a.f(max, this.b, this.c);
        int i7 = wtVar.n;
        Activity activity = this.d;
        org.telegram.messenger.g0.t3(activity, i7, false);
        org.telegram.messenger.g0.m3(activity, org.telegram.messenger.g0.B(wtVar.n) >= 0.721f);
    }
}
