// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class yg1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public boolean b = false;
    public final /* synthetic */ gk7 c;

    public /* synthetic */ yg1(gk7 gk7Var, byte b) {
        this.a = b;
        this.c = gk7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        gk7 gk7Var = this.c;
        switch (b) {
            case 0:
                nh1 nh1Var = (nh1) gk7Var;
                nh1Var.o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nh1Var.n0.invalidate();
                if (!this.b && nh1Var.o0 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 1:
                a18 a18Var = (a18) gk7Var;
                a18Var.Z = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a18Var.Y.invalidate();
                if (!this.b && a18Var.Z > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 2:
                t7b t7bVar = (t7b) gk7Var;
                t7bVar.E2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d7b d7bVar = t7bVar.D2;
                if (d7bVar != null) {
                    d7bVar.invalidate();
                }
                if (!this.b && t7bVar.E2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            default:
                qmb qmbVar = (qmb) gk7Var;
                qmbVar.k2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qmbVar.j2.invalidate();
                if (!this.b && qmbVar.k2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
