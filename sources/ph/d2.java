package ph;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class d2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ p2 f;

    public d2(p2 p2Var, boolean z10, float f9, float f10, float f11, float f12) {
        this.f = p2Var;
        this.a = z10;
        this.b = f9;
        this.c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        p2 p2Var = this.f;
        h2 h2Var = p2Var.x;
        m2 m2Var = p2Var.S;
        g2 g2Var = p2Var.v;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        p2Var.c0 = floatValue;
        if (!this.a) {
            floatValue = 1.0f - floatValue;
        }
        p2Var.b0 = floatValue;
        m2Var.setAlpha(1.0f - floatValue);
        m2Var.setTranslationY((-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) * p2Var.b0);
        float f9 = this.b;
        float f10 = p2Var.c0;
        float f11 = this.c;
        g2Var.setTranslationY(AndroidUtilities.lerp(f9, f11, f10));
        g2Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, p2Var.c0));
        p2Var.h0.setTranslationX(AndroidUtilities.lerp(this.e, 0.0f, p2Var.c0));
        p2Var.i0.setAlpha(p2Var.b0);
        p2Var.e.invalidate();
        h2Var.setViewPortHeightOffset(g2Var.getTranslationY() - f11);
        h2Var.n(false, false);
        p2Var.C();
    }
}
