package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class sf0 extends org.telegram.ui.Components.voip.n2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.uv0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf0(uf0 uf0Var, Context context, int i10) {
        super(uf0Var.s0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f = uf0Var;
                super(uf0Var.s0, context);
                break;
            default:
                this.f = uf0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.n2
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((uf0) this.f).i0;
            case 1:
                return ((uf0) this.f).i0;
            default:
                return ((se0) this.f).M;
        }
    }

    @Override // org.telegram.ui.Components.voip.n2
    public final boolean b() {
        sf0 sf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    uf0 uf0Var = (uf0) this.f;
                    if (uf0Var.V <= 0 || uf0Var.R == null) {
                    }
                }
                break;
            case 1:
                uf0 uf0Var2 = (uf0) this.f;
                if (!isClickable() || getVisibility() != 0 || uf0Var2.d0 || (((sf0Var = uf0Var2.v) != null && sf0Var.getVisibility() != 8) || uf0Var2.i0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    se0 se0Var = (se0) this.f;
                    if (se0Var.P <= 0 || se0Var.N == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf0(se0 se0Var, Context context) {
        super(se0Var.a0, context);
        this.e = 2;
        this.f = se0Var;
    }
}
