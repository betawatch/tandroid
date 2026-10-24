package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ru implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Activity d;
    public final /* synthetic */ su e;

    public ru(su suVar, float f7, int i10, int i11, Activity activity) {
        this.e = suVar;
        this.a = f7;
        this.b = i10;
        this.c = i11;
        this.d = activity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.a) / 150.0f));
        uu uuVar = this.e.c;
        uuVar.n = i0.a.f(max, this.b, this.c);
        int i10 = uuVar.n;
        Activity activity = this.d;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        AndroidUtilities.setLightNavigationBar(activity, AndroidUtilities.computePerceivedBrightness(uuVar.n) >= 0.721f);
    }
}
