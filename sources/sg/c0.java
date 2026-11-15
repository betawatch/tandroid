package sg;

import android.animation.ValueAnimator;
import org.telegram.messenger.ou;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                                ou ouVar = i0Var2.a;
                                if (ouVar != null) {
                                    ouVar.E0();
                                    break;
                                }
                                break;
                            default:
                                i0 i0Var3 = i0Var;
                                i0Var3.getClass();
                                i0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ou ouVar2 = i0Var3.a;
                                if (ouVar2 != null) {
                                    ouVar2.E0();
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
                                ou ouVar = i0Var22.a;
                                if (ouVar != null) {
                                    ouVar.E0();
                                    break;
                                }
                                break;
                            default:
                                i0 i0Var3 = i0Var2;
                                i0Var3.getClass();
                                i0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ou ouVar2 = i0Var3.a;
                                if (ouVar2 != null) {
                                    ouVar2.E0();
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
