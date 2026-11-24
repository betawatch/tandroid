// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class s7b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t7b b;

    public /* synthetic */ s7b(t7b t7bVar, byte b) {
        this.a = b;
        this.b = t7bVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        t7b t7bVar = this.b;
        switch (b) {
            case 0:
                t7bVar.b(valueAnimator);
                break;
            default:
                t7bVar.getClass();
                t7bVar.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
