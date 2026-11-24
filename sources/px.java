// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class px implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sx b;

    public /* synthetic */ px(sx sxVar, byte b) {
        this.a = b;
        this.b = sxVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        sx sxVar = this.b;
        switch (b) {
            case 0:
                sxVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sxVar.c.invalidate();
                sxVar.u();
                sxVar.r();
                break;
            case 1:
                sxVar.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sxVar.A();
                sxVar.u();
                sxVar.r();
                break;
            default:
                sxVar.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!sxVar.n) {
                    sxVar.A();
                }
                sxVar.u();
                sxVar.r();
                break;
        }
    }
}
