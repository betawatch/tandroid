// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pca extends iea {
    public final /* synthetic */ nfa Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pca(nfa nfaVar, Context context) {
        super(context);
        this.Q = nfaVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        iea ieaVar;
        float translationX = getTranslationX();
        super.setTranslationX(f);
        nfa nfaVar = this.Q;
        iea[] ieaVarArr = nfaVar.n0;
        if (ieaVarArr[0] == this) {
            float f2 = translationX - f;
            qw4 qw4Var = nfaVar.h2;
            if (qw4Var != null) {
                float f3 = nfaVar.i2 + f2;
                nfaVar.i2 = f3;
                int i = (int) f3;
                if (i != 0) {
                    nfaVar.i2 = f3 - i;
                    qw4Var.h(i, 0);
                }
            }
        }
        if (nfaVar.j1 && (ieaVar = ieaVarArr[0]) == this) {
            float abs = Math.abs(ieaVar.getTranslationX()) / ieaVarArr[0].getMeasuredWidth();
            nfaVar.g1(abs, ieaVarArr[1].F);
            if (nfaVar.q()) {
                byte b = nfaVar.A0;
                if (b == 2) {
                    nfaVar.r0 = 1.0f - abs;
                } else if (b == 1) {
                    nfaVar.r0 = abs;
                }
                nfaVar.K1(abs);
                float U = nfaVar.U(abs);
                nfaVar.s0 = U;
                nfaVar.u0.setVisibility((U == 0.0f || !nfaVar.q() || nfaVar.k0()) ? 4 : 0);
            } else {
                nfaVar.r0 = 0.0f;
            }
            nfaVar.G1(false);
        }
        nfaVar.C();
        fj3 fj3Var = nfaVar.S0;
        if (fj3Var != null) {
            fj3Var.setTranslationY(nfaVar.O1);
        }
    }
}
