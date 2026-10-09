package pg;

import android.animation.ValueAnimator;
import m.f3;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                s0Var.f.f(new Runnable() { // from class: pg.m0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                s0 s0Var2 = s0Var;
                                s0Var2.getClass();
                                s0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                f3 f3Var = s0Var2.a;
                                if (f3Var != null) {
                                    f3Var.g();
                                    break;
                                }
                                break;
                            default:
                                s0 s0Var3 = s0Var;
                                s0Var3.getClass();
                                s0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                f3 f3Var2 = s0Var3.a;
                                if (f3Var2 != null) {
                                    f3Var2.g();
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
                s0Var2.f.f(new Runnable() { // from class: pg.m0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                s0 s0Var22 = s0Var2;
                                s0Var22.getClass();
                                s0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                f3 f3Var = s0Var22.a;
                                if (f3Var != null) {
                                    f3Var.g();
                                    break;
                                }
                                break;
                            default:
                                s0 s0Var3 = s0Var2;
                                s0Var3.getClass();
                                s0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                f3 f3Var2 = s0Var3.a;
                                if (f3Var2 != null) {
                                    f3Var2.g();
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
