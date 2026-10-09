package yh;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p3 b;

    public /* synthetic */ m3(p3 p3Var, int i10) {
        this.a = i10;
        this.b = p3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                p3 p3Var = this.b;
                p3Var.getClass();
                p3Var.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3Var.d(p3Var.U);
                break;
            case 1:
                p3 p3Var2 = this.b;
                p3Var2.getClass();
                float w10 = com.google.android.gms.internal.vision.e2.w((float) Math.pow((r6 * 2.0f) - 2.0f, 2.0d), 0.075f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                p3Var2.t0 = w10;
                FrameLayout frameLayout = p3Var2.b;
                frameLayout.setScaleX(w10);
                frameLayout.setScaleY(p3Var2.t0);
                p3Var2.invalidate();
                break;
            default:
                p3 p3Var3 = this.b;
                p3Var3.getClass();
                p3Var3.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3Var3.d(p3Var3.U);
                break;
        }
    }
}
