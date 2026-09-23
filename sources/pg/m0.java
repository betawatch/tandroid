package pg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ m0(r0 r0Var, int i10) {
        this.a = i10;
        this.b = r0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                final r0 r0Var = this.b;
                final int i10 = 1;
                r0Var.f.f(new Runnable() { // from class: pg.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                r0 r0Var2 = r0Var;
                                r0Var2.getClass();
                                r0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                k2.u uVar = r0Var2.a;
                                if (uVar != null) {
                                    uVar.W();
                                    break;
                                }
                                break;
                            default:
                                r0 r0Var3 = r0Var;
                                r0Var3.getClass();
                                r0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                k2.u uVar2 = r0Var3.a;
                                if (uVar2 != null) {
                                    uVar2.W();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final r0 r0Var2 = this.b;
                final int i11 = 0;
                r0Var2.f.f(new Runnable() { // from class: pg.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                r0 r0Var22 = r0Var2;
                                r0Var22.getClass();
                                r0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                k2.u uVar = r0Var22.a;
                                if (uVar != null) {
                                    uVar.W();
                                    break;
                                }
                                break;
                            default:
                                r0 r0Var3 = r0Var2;
                                r0Var3.getClass();
                                r0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                k2.u uVar2 = r0Var3.a;
                                if (uVar2 != null) {
                                    uVar2.W();
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
