// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class tkb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ukb b;

    public /* synthetic */ tkb(ukb ukbVar, byte b) {
        this.a = b;
        this.b = ukbVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ukb ukbVar = this.b;
        switch (b) {
            case 0:
                ukbVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ukbVar.invalidate();
                break;
            case 1:
                ukbVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ukbVar.invalidate();
                break;
            case 2:
                ukbVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ukbVar.invalidate();
                break;
            case 3:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ukbVar.s = floatValue;
                ukbVar.x = (int) ((ukbVar.h * floatValue) + 0.0f);
                ukbVar.invalidate();
                break;
            default:
                ukbVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ukbVar.y = ukbVar.r + ((int) Math.ceil((ukbVar.n - r0) * r4));
                ukbVar.invalidate();
                break;
        }
    }
}
