// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class qlc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ slc b;

    public /* synthetic */ qlc(slc slcVar, byte b) {
        this.a = b;
        this.b = slcVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        byte b2 = 2;
        slc slcVar = this.b;
        switch (b) {
            case 0:
                slcVar.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                slcVar.k.invalidate();
                if (slcVar.n > 1.0f && slcVar.r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(gm.L(12.0f), 0);
                    slcVar.r = ofInt;
                    ofInt.addUpdateListener(new qlc(slcVar, b2));
                    slcVar.r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    slcVar.r.start();
                    break;
                }
                break;
            case 1:
                slcVar.m = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                slcVar.k.invalidate();
                break;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (slcVar.i <= slcVar.o / 2) {
                    intValue = -intValue;
                }
                slcVar.p = intValue;
                slcVar.k.invalidate();
                break;
        }
    }
}
