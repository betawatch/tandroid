package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class xc0 implements ValueAnimator.AnimatorUpdateListener {
    public boolean a;
    public final float[] b = {0.0f, 1.0f};
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ yc0 d;

    public xc0(yc0 yc0Var, FrameLayout frameLayout) {
        this.d = yc0Var;
        this.c = frameLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float lerp = AndroidUtilities.lerp(this.b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.a) {
            yc0 yc0Var = this.d;
            bd0 bd0Var = yc0Var.b;
            bd0 bd0Var2 = yc0Var.b;
            if (bd0Var.l0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(bd0Var2.l0, (Property<FrameLayout, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(bd0Var2.l0, (Property<FrameLayout, Float>) View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(bd0Var2.l0, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.a = true;
            }
        }
        float interpolation = lerp <= 0.5f ? org.telegram.ui.Components.pr.g.getInterpolation(lerp / 0.5f) * 1.1f : lerp <= 0.75f ? 1.1f - (org.telegram.ui.Components.pr.g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f) : (org.telegram.ui.Components.pr.g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        FrameLayout frameLayout = this.c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
