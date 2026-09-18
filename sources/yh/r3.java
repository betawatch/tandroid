package yh;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v3 b;

    public /* synthetic */ r3(v3 v3Var, int i10) {
        this.a = i10;
        this.b = v3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                v3 v3Var = this.b;
                v3Var.getClass();
                v3Var.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3Var.d(v3Var.U);
                break;
            case 1:
                v3 v3Var2 = this.b;
                v3Var2.getClass();
                float x10 = com.google.android.gms.internal.vision.e2.x((float) Math.pow((r6 * 2.0f) - 2.0f, 2.0d), 0.075f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                v3Var2.t0 = x10;
                FrameLayout frameLayout = v3Var2.b;
                frameLayout.setScaleX(x10);
                frameLayout.setScaleY(v3Var2.t0);
                v3Var2.invalidate();
                break;
            default:
                v3 v3Var3 = this.b;
                v3Var3.getClass();
                v3Var3.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3Var3.d(v3Var3.U);
                break;
        }
    }
}
