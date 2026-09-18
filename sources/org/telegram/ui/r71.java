package org.telegram.ui;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class r71 extends g.p {
    public final /* synthetic */ t71 c;

    public r71(t71 t71Var) {
        this.c = t71Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        t71 t71Var = this.c;
        org.telegram.ui.Components.nz nzVar = t71Var.X;
        org.telegram.ui.Components.l61 l61Var = t71Var.d0;
        if (l61Var == null) {
            return nzVar.J;
        }
        org.telegram.ui.Components.x51 G = l61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? nzVar.J : i11;
    }
}
