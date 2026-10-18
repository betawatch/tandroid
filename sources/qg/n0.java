package qg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                                le.b bVar = s0Var2.a;
                                if (bVar != null) {
                                    bVar.a0();
                                    break;
                                }
                                break;
                            default:
                                s0 s0Var3 = s0Var;
                                s0Var3.getClass();
                                s0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                le.b bVar2 = s0Var3.a;
                                if (bVar2 != null) {
                                    bVar2.a0();
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
                                le.b bVar = s0Var22.a;
                                if (bVar != null) {
                                    bVar.a0();
                                    break;
                                }
                                break;
                            default:
                                s0 s0Var3 = s0Var2;
                                s0Var3.getClass();
                                s0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                le.b bVar2 = s0Var3.a;
                                if (bVar2 != null) {
                                    bVar2.a0();
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
