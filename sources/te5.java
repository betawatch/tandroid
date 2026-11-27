// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class te5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ue5 c;

    public /* synthetic */ te5(ue5 ue5Var, boolean z, byte b) {
        this.a = b;
        this.c = ue5Var;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f;
        gv1 gv1Var;
        gu guVar;
        byte b = this.a;
        boolean z = this.b;
        ue5 ue5Var = this.c;
        switch (b) {
            case 0:
                f = z ? 1.0f : 0.0f;
                ue5Var.x = f;
                ue5Var.e.setTranslationY(f * hl.L(48.0f));
                ue5Var.e.setPadding(0, 0, 0, (int) (ue5Var.x * hl.L(48.0f)));
                break;
            default:
                f = z ? 1.0f : 0.0f;
                ue5Var.F = f;
                ue5Var.n.setScaleX(hl.R1(0.95f, 1.0f, f));
                ue5Var.n.setScaleY(hl.R1(0.95f, 1.0f, ue5Var.F));
                jr1 jr1Var = ue5Var.f;
                if (jr1Var != null && (gv1Var = jr1Var.a) != null && (guVar = gv1Var.a4) != null) {
                    guVar.setScaleX(hl.R1(1.0f, 0.95f, ue5Var.F));
                    ue5Var.f.a.a4.setScaleY(hl.R1(1.0f, 0.95f, ue5Var.F));
                }
                ue5Var.h.setAlpha(ue5Var.F);
                if (!z) {
                    ue5Var.h.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
