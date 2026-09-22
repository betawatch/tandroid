package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class s71 extends g.p {
    public final /* synthetic */ u71 c;

    public s71(u71 u71Var) {
        this.c = u71Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        u71 u71Var = this.c;
        org.telegram.ui.Components.nz nzVar = u71Var.X;
        org.telegram.ui.Components.w51 w51Var = u71Var.d0;
        if (w51Var == null) {
            return nzVar.J;
        }
        org.telegram.ui.Components.i51 G = w51Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? nzVar.J : i11;
    }
}
