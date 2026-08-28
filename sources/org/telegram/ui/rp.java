package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rp implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bq b;

    public /* synthetic */ rp(bq bqVar, int i9) {
        this.a = i9;
        this.b = bqVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                bq bqVar = this.b;
                bqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                bqVar.h.invalidateSelf();
                break;
            default:
                bq bqVar2 = this.b;
                bqVar2.getClass();
                bqVar2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = bqVar2.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    break;
                }
                break;
        }
    }
}
