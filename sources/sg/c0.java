package sg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.nd0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;

    public /* synthetic */ c0(h0 h0Var, int i7) {
        this.a = i7;
        this.b = h0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                final h0 h0Var = this.b;
                final int i7 = 1;
                h0Var.f.f(new Runnable() { // from class: sg.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                h0 h0Var2 = h0Var;
                                h0Var2.getClass();
                                h0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                nd0 nd0Var = h0Var2.a;
                                if (nd0Var != null) {
                                    nd0Var.p();
                                    break;
                                }
                                break;
                            default:
                                h0 h0Var3 = h0Var;
                                h0Var3.getClass();
                                h0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                nd0 nd0Var2 = h0Var3.a;
                                if (nd0Var2 != null) {
                                    nd0Var2.p();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final h0 h0Var2 = this.b;
                final int i10 = 0;
                h0Var2.f.f(new Runnable() { // from class: sg.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                h0 h0Var22 = h0Var2;
                                h0Var22.getClass();
                                h0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                nd0 nd0Var = h0Var22.a;
                                if (nd0Var != null) {
                                    nd0Var.p();
                                    break;
                                }
                                break;
                            default:
                                h0 h0Var3 = h0Var2;
                                h0Var3.getClass();
                                h0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                nd0 nd0Var2 = h0Var3.a;
                                if (nd0Var2 != null) {
                                    nd0Var2.p();
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
