package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class yc0 implements ValueAnimator.AnimatorUpdateListener {
    public boolean a;
    public final float[] b = {0.0f, 1.0f};
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ zc0 d;

    public yc0(zc0 zc0Var, FrameLayout frameLayout) {
        this.d = zc0Var;
        this.c = frameLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float lerp = AndroidUtilities.lerp(this.b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.a) {
            zc0 zc0Var = this.d;
            cd0 cd0Var = zc0Var.b;
            cd0 cd0Var2 = zc0Var.b;
            if (cd0Var.o0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(cd0Var2.o0, (Property<FrameLayout, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(cd0Var2.o0, (Property<FrameLayout, Float>) View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(cd0Var2.o0, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.a = true;
            }
        }
        float interpolation = lerp <= 0.5f ? org.telegram.ui.Components.rr.g.getInterpolation(lerp / 0.5f) * 1.1f : lerp <= 0.75f ? 1.1f - (org.telegram.ui.Components.rr.g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f) : (org.telegram.ui.Components.rr.g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        FrameLayout frameLayout = this.c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
