// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class z9b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cab b;

    public /* synthetic */ z9b(cab cabVar, byte b) {
        this.a = b;
        this.b = cabVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        cab cabVar = this.b;
        switch (b) {
            case 0:
                oab oabVar = cabVar.y0;
                oabVar.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oabVar.V();
                break;
            default:
                oab oabVar2 = cabVar.y0;
                oabVar2.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oabVar2.V();
                break;
        }
    }
}
