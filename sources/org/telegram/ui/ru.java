package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ru implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Activity d;
    public final /* synthetic */ su e;

    public ru(su suVar, float f10, int i9, int i10, Activity activity) {
        this.e = suVar;
        this.a = f10;
        this.b = i9;
        this.c = i10;
        this.d = activity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.a) / 150.0f));
        tu tuVar = this.e.c;
        tuVar.n = i0.a.d(max, this.b, this.c);
        int i9 = tuVar.n;
        Activity activity = this.d;
        AndroidUtilities.setNavigationBarColor(activity, i9, false);
        AndroidUtilities.setLightNavigationBar(activity, AndroidUtilities.computePerceivedBrightness(tuVar.n) >= 0.721f);
    }
}
