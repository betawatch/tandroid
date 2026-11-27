// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class y5c implements ValueAnimator.AnimatorUpdateListener {
    public int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ d6c c;

    public y5c(d6c d6cVar, int i) {
        this.c = d6cVar;
        this.b = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.b);
        d6c d6cVar = this.c;
        d6cVar.O = true;
        d6cVar.n.scrollBy(0, floatValue - this.a);
        d6cVar.O = false;
        this.a = floatValue;
    }
}
