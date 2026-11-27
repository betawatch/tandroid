// default package

import android.animation.ValueAnimator;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class r5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a b;

    public /* synthetic */ r5(a aVar, byte b) {
        this.a = b;
        this.b = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        s6 s6Var;
        byte b = this.a;
        a aVar = this.b;
        switch (b) {
            case 0:
                v59 v59Var = aVar.f1;
                if (v59Var != null) {
                    v59Var.run();
                    break;
                }
                break;
            case 1:
                v59 v59Var2 = aVar.f1;
                if (v59Var2 != null) {
                    v59Var2.run();
                    break;
                }
                break;
            case 2:
                aVar.p0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (aVar.a != null && aVar.S0) {
                    float L = hl.L(23.0f);
                    float U1 = hl.U1(aVar.p0, hl.L(18.33f), hl.L(23.0f));
                    aVar.a.s(U1, L, L, U1);
                    aVar.invalidate();
                }
                if (aVar.Q0 && (s6Var = aVar.F) != null) {
                    s6Var.setTranslationX(-hl.R1(hl.L(10.0f), hl.L(5.0f), aVar.p0));
                }
                v59 v59Var3 = aVar.f1;
                if (v59Var3 != null) {
                    v59Var3.run();
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
