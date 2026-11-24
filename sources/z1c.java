// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class z1c implements ValueAnimator.AnimatorUpdateListener {
    public int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ d2c c;

    public z1c(d2c d2cVar, int i) {
        this.c = d2cVar;
        this.b = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.b);
        d2c d2cVar = this.c;
        d2cVar.O = true;
        d2cVar.n.scrollBy(0, floatValue - this.a);
        d2cVar.O = false;
        this.a = floatValue;
    }
}
