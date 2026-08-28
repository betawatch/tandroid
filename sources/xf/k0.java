package xf;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ k0(q0 q0Var, int i9) {
        this.a = i9;
        this.b = q0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                final q0 q0Var = this.b;
                final int i9 = 1;
                q0Var.f.f(new Runnable() { // from class: xf.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                q0 q0Var2 = q0Var;
                                q0Var2.getClass();
                                q0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                m5.c0 c0Var = q0Var2.a;
                                if (c0Var != null) {
                                    c0Var.i();
                                    break;
                                }
                                break;
                            default:
                                q0 q0Var3 = q0Var;
                                q0Var3.getClass();
                                q0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                m5.c0 c0Var2 = q0Var3.a;
                                if (c0Var2 != null) {
                                    c0Var2.i();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final q0 q0Var2 = this.b;
                final int i10 = 0;
                q0Var2.f.f(new Runnable() { // from class: xf.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                q0 q0Var22 = q0Var2;
                                q0Var22.getClass();
                                q0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                m5.c0 c0Var = q0Var22.a;
                                if (c0Var != null) {
                                    c0Var.i();
                                    break;
                                }
                                break;
                            default:
                                q0 q0Var3 = q0Var2;
                                q0Var3.getClass();
                                q0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                m5.c0 c0Var2 = q0Var3.a;
                                if (c0Var2 != null) {
                                    c0Var2.i();
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
