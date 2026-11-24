// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pe5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ re5 b;

    public /* synthetic */ pe5(re5 re5Var, byte b) {
        this.a = b;
        this.b = re5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        fw1 fw1Var;
        fv fvVar;
        byte b = this.a;
        re5 re5Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                re5Var.x = floatValue;
                re5Var.e.setTranslationY(floatValue * gm.L(48.0f));
                re5Var.e.setPadding(0, 0, 0, (int) (re5Var.x * gm.L(48.0f)));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                re5Var.F = floatValue2;
                re5Var.n.setScaleX(gm.R1(0.95f, 1.0f, floatValue2));
                re5Var.n.setScaleY(gm.R1(0.95f, 1.0f, re5Var.F));
                is1 is1Var = re5Var.f;
                if (is1Var != null && (fw1Var = is1Var.a) != null && (fvVar = fw1Var.a4) != null) {
                    fvVar.setScaleX(gm.R1(1.0f, 0.95f, re5Var.F));
                    re5Var.f.a.a4.setScaleY(gm.R1(1.0f, 0.95f, re5Var.F));
                }
                re5Var.h.setAlpha(re5Var.F);
                break;
        }
    }
}
