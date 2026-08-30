package rh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class e2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ q2 f;

    public e2(q2 q2Var, boolean z4, float f10, float f11, float f12, float f13) {
        this.f = q2Var;
        this.a = z4;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        q2 q2Var = this.f;
        i2 i2Var = q2Var.x;
        n2 n2Var = q2Var.T;
        h2 h2Var = q2Var.v;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        q2Var.d0 = floatValue;
        if (!this.a) {
            floatValue = 1.0f - floatValue;
        }
        q2Var.c0 = floatValue;
        n2Var.setAlpha(1.0f - floatValue);
        n2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * q2Var.c0);
        float f10 = this.b;
        float f11 = q2Var.d0;
        float f12 = this.c;
        h2Var.setTranslationY(AndroidUtilities.lerp(f10, f12, f11));
        h2Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, q2Var.d0));
        q2Var.i0.setTranslationX(AndroidUtilities.lerp(this.e, 0.0f, q2Var.d0));
        q2Var.j0.setAlpha(q2Var.c0);
        q2Var.e.invalidate();
        i2Var.setViewPortHeightOffset(h2Var.getTranslationY() - f12);
        i2Var.n(false, false);
        q2Var.C();
    }
}
