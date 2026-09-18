package yh;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;

    public /* synthetic */ t3(x3 x3Var, int i10) {
        this.a = i10;
        this.b = x3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x3 x3Var = this.b;
                x3Var.getClass();
                x3Var.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3Var.d(x3Var.U);
                break;
            case 1:
                x3 x3Var2 = this.b;
                x3Var2.getClass();
                float x10 = com.google.android.gms.internal.vision.e2.x((float) Math.pow((r6 * 2.0f) - 2.0f, 2.0d), 0.075f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                x3Var2.t0 = x10;
                FrameLayout frameLayout = x3Var2.b;
                frameLayout.setScaleX(x10);
                frameLayout.setScaleY(x3Var2.t0);
                x3Var2.invalidate();
                break;
            default:
                x3 x3Var3 = this.b;
                x3Var3.getClass();
                x3Var3.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3Var3.d(x3Var3.U);
                break;
        }
    }
}
