// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class z3c implements ValueAnimator.AnimatorUpdateListener {
    public int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ d4c c;

    public z3c(d4c d4cVar, int i) {
        this.c = d4cVar;
        this.b = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.b);
        d4c d4cVar = this.c;
        d4cVar.O = true;
        d4cVar.n.scrollBy(0, floatValue - this.a);
        d4cVar.O = false;
        this.a = floatValue;
    }
}
