package org.telegram.ui;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class u71 extends g.p {
    public final /* synthetic */ w71 c;

    public u71(w71 w71Var) {
        this.c = w71Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        w71 w71Var = this.c;
        org.telegram.ui.Components.nz nzVar = w71Var.X;
        org.telegram.ui.Components.v51 v51Var = w71Var.d0;
        if (v51Var == null) {
            return nzVar.J;
        }
        org.telegram.ui.Components.h51 G = v51Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? nzVar.J : i11;
    }
}
