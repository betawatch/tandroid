package zh;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class f7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i7 b;

    public /* synthetic */ f7(i7 i7Var, int i10) {
        this.a = i10;
        this.b = i7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                u7 u7Var = this.b.I0;
                u7Var.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u7.k(u7Var);
                break;
            default:
                u7 u7Var2 = this.b.I0;
                u7Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u7.k(u7Var2);
                break;
        }
    }
}
