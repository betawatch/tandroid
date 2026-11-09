package sg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.vy;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ d0(j0 j0Var, int i7) {
        this.a = i7;
        this.b = j0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                final j0 j0Var = this.b;
                final int i7 = 1;
                j0Var.f.f(new Runnable() { // from class: sg.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                j0 j0Var2 = j0Var;
                                j0Var2.getClass();
                                j0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                vy vyVar = j0Var2.a;
                                if (vyVar != null) {
                                    vyVar.b();
                                    break;
                                }
                                break;
                            default:
                                j0 j0Var3 = j0Var;
                                j0Var3.getClass();
                                j0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                vy vyVar2 = j0Var3.a;
                                if (vyVar2 != null) {
                                    vyVar2.b();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final j0 j0Var2 = this.b;
                final int i10 = 0;
                j0Var2.f.f(new Runnable() { // from class: sg.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                j0 j0Var22 = j0Var2;
                                j0Var22.getClass();
                                j0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                vy vyVar = j0Var22.a;
                                if (vyVar != null) {
                                    vyVar.b();
                                    break;
                                }
                                break;
                            default:
                                j0 j0Var3 = j0Var2;
                                j0Var3.getClass();
                                j0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                vy vyVar2 = j0Var3.a;
                                if (vyVar2 != null) {
                                    vyVar2.b();
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
