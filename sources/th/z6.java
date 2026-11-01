package th;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c7 b;

    public /* synthetic */ z6(c7 c7Var, int i10) {
        this.a = i10;
        this.b = c7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                o7 o7Var = this.b.r0;
                o7Var.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7.w(o7Var);
                break;
            default:
                o7 o7Var2 = this.b.r0;
                o7Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7.w(o7Var2);
                break;
        }
    }
}
