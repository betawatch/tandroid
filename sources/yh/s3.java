package yh;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;

    public /* synthetic */ s3(w3 w3Var, int i10) {
        this.a = i10;
        this.b = w3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                w3 w3Var = this.b;
                w3Var.getClass();
                w3Var.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3Var.d(w3Var.U);
                break;
            case 1:
                w3 w3Var2 = this.b;
                w3Var2.getClass();
                float x10 = com.google.android.gms.internal.vision.e2.x((float) Math.pow((r6 * 2.0f) - 2.0f, 2.0d), 0.075f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                w3Var2.t0 = x10;
                FrameLayout frameLayout = w3Var2.b;
                frameLayout.setScaleX(x10);
                frameLayout.setScaleY(w3Var2.t0);
                w3Var2.invalidate();
                break;
            default:
                w3 w3Var3 = this.b;
                w3Var3.getClass();
                w3Var3.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3Var3.d(w3Var3.U);
                break;
        }
    }
}
