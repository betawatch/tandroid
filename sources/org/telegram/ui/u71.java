package org.telegram.ui;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        org.telegram.ui.Components.m61 m61Var = w71Var.d0;
        if (m61Var == null) {
            return nzVar.J;
        }
        org.telegram.ui.Components.y51 G = m61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? nzVar.J : i11;
    }
}
