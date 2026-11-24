// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class rmc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ goc b;

    public /* synthetic */ rmc(goc gocVar, byte b) {
        this.a = b;
        this.b = gocVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        goc gocVar = this.b;
        switch (b) {
            case 0:
                gocVar.Q0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                gocVar.L0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gocVar.Y0();
                break;
        }
    }
}
