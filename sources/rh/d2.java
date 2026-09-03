package rh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class d2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ p2 f;

    public d2(p2 p2Var, boolean z4, float f10, float f11, float f12, float f13) {
        this.f = p2Var;
        this.a = z4;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        p2 p2Var = this.f;
        h2 h2Var = p2Var.x;
        m2 m2Var = p2Var.T;
        g2 g2Var = p2Var.v;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        p2Var.d0 = floatValue;
        if (!this.a) {
            floatValue = 1.0f - floatValue;
        }
        p2Var.c0 = floatValue;
        m2Var.setAlpha(1.0f - floatValue);
        m2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * p2Var.c0);
        float f10 = this.b;
        float f11 = p2Var.d0;
        float f12 = this.c;
        g2Var.setTranslationY(AndroidUtilities.lerp(f10, f12, f11));
        g2Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, p2Var.d0));
        p2Var.i0.setTranslationX(AndroidUtilities.lerp(this.e, 0.0f, p2Var.d0));
        p2Var.j0.setAlpha(p2Var.c0);
        p2Var.e.invalidate();
        h2Var.setViewPortHeightOffset(g2Var.getTranslationY() - f12);
        h2Var.o(false, false);
        p2Var.C();
    }
}
