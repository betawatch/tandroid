// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qe5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ re5 c;

    public /* synthetic */ qe5(re5 re5Var, boolean z, byte b) {
        this.a = b;
        this.c = re5Var;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f;
        fw1 fw1Var;
        fv fvVar;
        byte b = this.a;
        boolean z = this.b;
        re5 re5Var = this.c;
        switch (b) {
            case 0:
                f = z ? 1.0f : 0.0f;
                re5Var.x = f;
                re5Var.e.setTranslationY(f * gm.L(48.0f));
                re5Var.e.setPadding(0, 0, 0, (int) (re5Var.x * gm.L(48.0f)));
                break;
            default:
                f = z ? 1.0f : 0.0f;
                re5Var.F = f;
                re5Var.n.setScaleX(gm.R1(0.95f, 1.0f, f));
                re5Var.n.setScaleY(gm.R1(0.95f, 1.0f, re5Var.F));
                is1 is1Var = re5Var.f;
                if (is1Var != null && (fw1Var = is1Var.a) != null && (fvVar = fw1Var.a4) != null) {
                    fvVar.setScaleX(gm.R1(1.0f, 0.95f, re5Var.F));
                    re5Var.f.a.a4.setScaleY(gm.R1(1.0f, 0.95f, re5Var.F));
                }
                re5Var.h.setAlpha(re5Var.F);
                if (!z) {
                    re5Var.h.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
