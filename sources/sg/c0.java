package sg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.hn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ c0(i0 i0Var, int i7) {
        this.a = i7;
        this.b = i0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                final i0 i0Var = this.b;
                final int i7 = 1;
                i0Var.f.f(new Runnable() { // from class: sg.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                i0 i0Var2 = i0Var;
                                i0Var2.getClass();
                                i0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                hn hnVar = i0Var2.a;
                                if (hnVar != null) {
                                    hnVar.l();
                                    break;
                                }
                                break;
                            default:
                                i0 i0Var3 = i0Var;
                                i0Var3.getClass();
                                i0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                hn hnVar2 = i0Var3.a;
                                if (hnVar2 != null) {
                                    hnVar2.l();
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
                i0Var2.f.f(new Runnable() { // from class: sg.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                i0 i0Var22 = i0Var2;
                                i0Var22.getClass();
                                i0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                hn hnVar = i0Var22.a;
                                if (hnVar != null) {
                                    hnVar.l();
                                    break;
                                }
                                break;
                            default:
                                i0 i0Var3 = i0Var2;
                                i0Var3.getClass();
                                i0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                hn hnVar2 = i0Var3.a;
                                if (hnVar2 != null) {
                                    hnVar2.l();
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
