package tg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.nh;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ d0(i0 i0Var, int i3) {
        this.a = i3;
        this.b = i0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                final i0 i0Var = this.b;
                final int i3 = 1;
                i0Var.f.f(new Runnable() { // from class: tg.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                i0 i0Var2 = i0Var;
                                i0Var2.getClass();
                                i0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                nh nhVar = i0Var2.a;
                                if (nhVar != null) {
                                    nhVar.x();
                                    break;
                                }
                                break;
                            default:
                                i0 i0Var3 = i0Var;
                                i0Var3.getClass();
                                i0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                nh nhVar2 = i0Var3.a;
                                if (nhVar2 != null) {
                                    nhVar2.x();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final i0 i0Var2 = this.b;
                final int i10 = 0;
                i0Var2.f.f(new Runnable() { // from class: tg.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                i0 i0Var22 = i0Var2;
                                i0Var22.getClass();
                                i0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                nh nhVar = i0Var22.a;
                                if (nhVar != null) {
                                    nhVar.x();
                                    break;
                                }
                                break;
                            default:
                                i0 i0Var3 = i0Var2;
                                i0Var3.getClass();
                                i0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                nh nhVar2 = i0Var3.a;
                                if (nhVar2 != null) {
                                    nhVar2.x();
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
