package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class x71 extends g.p {
    public final /* synthetic */ z71 c;

    public x71(z71 z71Var) {
        this.c = z71Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        z71 z71Var = this.c;
        org.telegram.ui.Components.uz uzVar = z71Var.X;
        org.telegram.ui.Components.j61 j61Var = z71Var.d0;
        if (j61Var == null) {
            return uzVar.J;
        }
        org.telegram.ui.Components.v51 G = j61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? uzVar.J : i11;
    }
}
