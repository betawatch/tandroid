// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pea extends iga {
    public final /* synthetic */ nha Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pea(nha nhaVar, Context context) {
        super(context);
        this.Q = nhaVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        iga igaVar;
        float translationX = getTranslationX();
        super.setTranslationX(f);
        nha nhaVar = this.Q;
        iga[] igaVarArr = nhaVar.n0;
        if (igaVarArr[0] == this) {
            float f2 = translationX - f;
            sy4 sy4Var = nhaVar.h2;
            if (sy4Var != null) {
                float f3 = nhaVar.i2 + f2;
                nhaVar.i2 = f3;
                int i = (int) f3;
                if (i != 0) {
                    nhaVar.i2 = f3 - i;
                    sy4Var.h(i, 0);
                }
            }
        }
        if (nhaVar.j1 && (igaVar = igaVarArr[0]) == this) {
            float abs = Math.abs(igaVar.getTranslationX()) / igaVarArr[0].getMeasuredWidth();
            nhaVar.g1(abs, igaVarArr[1].F);
            if (nhaVar.q()) {
                byte b = nhaVar.A0;
                if (b == 2) {
                    nhaVar.r0 = 1.0f - abs;
                } else if (b == 1) {
                    nhaVar.r0 = abs;
                }
                nhaVar.K1(abs);
                float U = nhaVar.U(abs);
                nhaVar.s0 = U;
                nhaVar.u0.setVisibility((U == 0.0f || !nhaVar.q() || nhaVar.k0()) ? 4 : 0);
            } else {
                nhaVar.r0 = 0.0f;
            }
            nhaVar.G1(false);
        }
        nhaVar.C();
        qk3 qk3Var = nhaVar.S0;
        if (qk3Var != null) {
            qk3Var.setTranslationY(nhaVar.O1);
        }
    }
}
