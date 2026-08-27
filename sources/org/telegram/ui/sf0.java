package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sf0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wf0 b;

    public /* synthetic */ sf0(wf0 wf0Var, int i10) {
        this.a = i10;
        this.b = wf0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                wf0 wf0Var = this.b;
                wf0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wf0Var.d.setAlpha(floatValue);
                wf0Var.e.setAlpha(floatValue);
                wf0Var.f.setProgress(floatValue);
                FrameLayout frameLayout = wf0Var.w;
                frameLayout.setAlpha(floatValue);
                float f10 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f10);
                frameLayout.setScaleY(f10);
                break;
            default:
                wf0 wf0Var2 = this.b;
                wf0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wf0Var2.f.setProgress(floatValue2);
                wf0Var2.d.setAlpha(floatValue2);
                wf0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = wf0Var2.w;
                frameLayout2.setAlpha(floatValue2);
                float f11 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f11);
                frameLayout2.setScaleY(f11);
                break;
        }
    }
}
