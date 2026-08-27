package yf;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;

    public /* synthetic */ k0(p0 p0Var, int i10) {
        this.a = i10;
        this.b = p0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                final p0 p0Var = this.b;
                final int i10 = 1;
                p0Var.f.f(new Runnable() { // from class: yf.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                p0 p0Var2 = p0Var;
                                p0Var2.getClass();
                                p0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                n1.d dVar = p0Var2.a;
                                if (dVar != null) {
                                    dVar.C();
                                    break;
                                }
                                break;
                            default:
                                p0 p0Var3 = p0Var;
                                p0Var3.getClass();
                                p0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                n1.d dVar2 = p0Var3.a;
                                if (dVar2 != null) {
                                    dVar2.C();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final p0 p0Var2 = this.b;
                final int i11 = 0;
                p0Var2.f.f(new Runnable() { // from class: yf.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                p0 p0Var22 = p0Var2;
                                p0Var22.getClass();
                                p0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                n1.d dVar = p0Var22.a;
                                if (dVar != null) {
                                    dVar.C();
                                    break;
                                }
                                break;
                            default:
                                p0 p0Var3 = p0Var2;
                                p0Var3.getClass();
                                p0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                n1.d dVar2 = p0Var3.a;
                                if (dVar2 != null) {
                                    dVar2.C();
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
