package qg;

import android.animation.ValueAnimator;
import ji.w4;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ l0(q0 q0Var, int i10) {
        this.a = i10;
        this.b = q0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                final q0 q0Var = this.b;
                final int i10 = 1;
                q0Var.f.f(new Runnable() { // from class: qg.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                q0 q0Var2 = q0Var;
                                q0Var2.getClass();
                                q0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                w4 w4Var = q0Var2.a;
                                if (w4Var != null) {
                                    w4Var.Y0();
                                    break;
                                }
                                break;
                            default:
                                q0 q0Var3 = q0Var;
                                q0Var3.getClass();
                                q0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                w4 w4Var2 = q0Var3.a;
                                if (w4Var2 != null) {
                                    w4Var2.Y0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final q0 q0Var2 = this.b;
                final int i11 = 0;
                q0Var2.f.f(new Runnable() { // from class: qg.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                q0 q0Var22 = q0Var2;
                                q0Var22.getClass();
                                q0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                w4 w4Var = q0Var22.a;
                                if (w4Var != null) {
                                    w4Var.Y0();
                                    break;
                                }
                                break;
                            default:
                                q0 q0Var3 = q0Var2;
                                q0Var3.getClass();
                                q0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                w4 w4Var2 = q0Var3.a;
                                if (w4Var2 != null) {
                                    w4Var2.Y0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
