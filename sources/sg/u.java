package sg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ u(b0 b0Var, int i10) {
        this.a = i10;
        this.b = b0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b0 b0Var = this.b;
                b0Var.getClass();
                b0Var.a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                this.b.a.invalidate();
                break;
        }
    }
}
