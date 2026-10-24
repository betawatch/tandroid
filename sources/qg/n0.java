package qg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ n0(s0 s0Var, int i10) {
        this.a = i10;
        this.b = s0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                final s0 s0Var = this.b;
                final int i10 = 1;
                s0Var.f.f(new Runnable() { // from class: qg.m0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                s0 s0Var2 = s0Var;
                                s0Var2.getClass();
                                s0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ki.t1 t1Var = s0Var2.a;
                                if (t1Var != null) {
                                    t1Var.J();
                                    break;
                                }
                                break;
                            default:
                                s0 s0Var3 = s0Var;
                                s0Var3.getClass();
                                s0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ki.t1 t1Var2 = s0Var3.a;
                                if (t1Var2 != null) {
                                    t1Var2.J();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final s0 s0Var2 = this.b;
                final int i11 = 0;
                s0Var2.f.f(new Runnable() { // from class: qg.m0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                s0 s0Var22 = s0Var2;
                                s0Var22.getClass();
                                s0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ki.t1 t1Var = s0Var22.a;
                                if (t1Var != null) {
                                    t1Var.J();
                                    break;
                                }
                                break;
                            default:
                                s0 s0Var3 = s0Var2;
                                s0Var3.getClass();
                                s0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ki.t1 t1Var2 = s0Var3.a;
                                if (t1Var2 != null) {
                                    t1Var2.J();
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
