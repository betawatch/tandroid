// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zf4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gg4 b;

    public /* synthetic */ zf4(gg4 gg4Var, byte b) {
        this.a = b;
        this.b = gg4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        gg4 gg4Var = this.b;
        switch (b) {
            case 0:
                gg4Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gg4Var.invalidate();
                break;
            default:
                gg4Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gg4Var.invalidate();
                break;
        }
    }
}
