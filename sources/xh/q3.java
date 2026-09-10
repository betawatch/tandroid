package xh;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class q3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u3 b;

    public /* synthetic */ q3(u3 u3Var, int i10) {
        this.a = i10;
        this.b = u3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                u3 u3Var = this.b;
                u3Var.getClass();
                u3Var.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3Var.d(u3Var.U);
                break;
            case 1:
                u3 u3Var2 = this.b;
                u3Var2.getClass();
                float x10 = com.google.android.gms.internal.vision.e2.x((float) Math.pow((r6 * 2.0f) - 2.0f, 2.0d), 0.075f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                u3Var2.t0 = x10;
                FrameLayout frameLayout = u3Var2.b;
                frameLayout.setScaleX(x10);
                frameLayout.setScaleY(u3Var2.t0);
                u3Var2.invalidate();
                break;
            default:
                u3 u3Var3 = this.b;
                u3Var3.getClass();
                u3Var3.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3Var3.d(u3Var3.U);
                break;
        }
    }
}
