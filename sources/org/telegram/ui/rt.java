package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class rt implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Activity d;
    public final /* synthetic */ org.telegram.ui.Components.xd e;

    public rt(org.telegram.ui.Components.xd xdVar, float f10, int i7, int i10, Activity activity) {
        this.e = xdVar;
        this.a = f10;
        this.b = i7;
        this.c = i10;
        this.d = activity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.a) / 150.0f));
        tt ttVar = (tt) this.e.d;
        ttVar.n = i0.a.f(max, this.b, this.c);
        int i7 = ttVar.n;
        Activity activity = this.d;
        org.telegram.messenger.g0.t3(activity, i7, false);
        org.telegram.messenger.g0.m3(activity, org.telegram.messenger.g0.B(ttVar.n) >= 0.721f);
    }
}
