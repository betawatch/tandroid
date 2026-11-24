// default package

import android.animation.ValueAnimator;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class q5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a b;

    public /* synthetic */ q5(a aVar, byte b) {
        this.a = b;
        this.b = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        r6 r6Var;
        byte b = this.a;
        a aVar = this.b;
        switch (b) {
            case 0:
                kf9 kf9Var = aVar.f1;
                if (kf9Var != null) {
                    kf9Var.run();
                    break;
                }
                break;
            case 1:
                kf9 kf9Var2 = aVar.f1;
                if (kf9Var2 != null) {
                    kf9Var2.run();
                    break;
                }
                break;
            case 2:
                aVar.p0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (aVar.a != null && aVar.S0) {
                    float L = gm.L(23.0f);
                    float U1 = gm.U1(aVar.p0, gm.L(18.33f), gm.L(23.0f));
                    aVar.a.s(U1, L, L, U1);
                    aVar.invalidate();
                }
                if (aVar.Q0 && (r6Var = aVar.F) != null) {
                    r6Var.setTranslationX(-gm.R1(gm.L(10.0f), gm.L(5.0f), aVar.p0));
                }
                kf9 kf9Var3 = aVar.f1;
                if (kf9Var3 != null) {
                    kf9Var3.run();
                    break;
                }
                break;
            case 3:
                aVar.E1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aVar.j();
                break;
            default:
                aVar.E1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aVar.j();
                break;
        }
    }
}
