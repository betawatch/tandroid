package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zf0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg0 b;

    public /* synthetic */ zf0(dg0 dg0Var, int i10) {
        this.a = i10;
        this.b = dg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                dg0 dg0Var = this.b;
                dg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dg0Var.d.setAlpha(floatValue);
                dg0Var.e.setAlpha(floatValue);
                dg0Var.f.setProgress(floatValue);
                FrameLayout frameLayout = dg0Var.w;
                frameLayout.setAlpha(floatValue);
                float f10 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f10);
                frameLayout.setScaleY(f10);
                break;
            default:
                dg0 dg0Var2 = this.b;
                dg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dg0Var2.f.setProgress(floatValue2);
                dg0Var2.d.setAlpha(floatValue2);
                dg0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = dg0Var2.w;
                frameLayout2.setAlpha(floatValue2);
                float f11 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f11);
                frameLayout2.setScaleY(f11);
                break;
        }
    }
}
