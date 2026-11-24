// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class s53 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x53 b;

    public /* synthetic */ s53(x53 x53Var, byte b) {
        this.a = b;
        this.b = x53Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        x53 x53Var = this.b;
        switch (b) {
            case 0:
                x53Var.getClass();
                x53Var.a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                x53Var.a.invalidate();
                break;
        }
    }
}
