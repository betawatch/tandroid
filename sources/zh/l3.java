package zh;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class l3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3 b;

    public /* synthetic */ l3(o3 o3Var, int i10) {
        this.a = i10;
        this.b = o3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                o3 o3Var = this.b;
                o3Var.getClass();
                o3Var.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o3Var.d(o3Var.U);
                break;
            case 1:
                o3 o3Var2 = this.b;
                o3Var2.getClass();
                float t10 = com.google.android.gms.internal.play_billing.k3.t((float) Math.pow((r6 * 2.0f) - 2.0f, 2.0d), 0.075f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                o3Var2.t0 = t10;
                FrameLayout frameLayout = o3Var2.b;
                frameLayout.setScaleX(t10);
                frameLayout.setScaleY(o3Var2.t0);
                o3Var2.invalidate();
                break;
            default:
                o3 o3Var3 = this.b;
                o3Var3.getClass();
                o3Var3.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o3Var3.d(o3Var3.U);
                break;
        }
    }
}
