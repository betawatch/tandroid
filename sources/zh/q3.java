package zh;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class q3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;

    public /* synthetic */ q3(t3 t3Var, int i10) {
        this.a = i10;
        this.b = t3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                t3 t3Var = this.b;
                t3Var.getClass();
                t3Var.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t3Var.d(t3Var.U);
                break;
            case 1:
                t3 t3Var2 = this.b;
                t3Var2.getClass();
                float x10 = com.google.android.gms.internal.vision.e2.x((float) Math.pow((r6 * 2.0f) - 2.0f, 2.0d), 0.075f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                t3Var2.t0 = x10;
                FrameLayout frameLayout = t3Var2.b;
                frameLayout.setScaleX(x10);
                frameLayout.setScaleY(t3Var2.t0);
                t3Var2.invalidate();
                break;
            default:
                t3 t3Var3 = this.b;
                t3Var3.getClass();
                t3Var3.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t3Var3.d(t3Var3.U);
                break;
        }
    }
}
