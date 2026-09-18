package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class t71 extends g.p {
    public final /* synthetic */ v71 c;

    public t71(v71 v71Var) {
        this.c = v71Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        v71 v71Var = this.c;
        org.telegram.ui.Components.nz nzVar = v71Var.X;
        org.telegram.ui.Components.x51 x51Var = v71Var.d0;
        if (x51Var == null) {
            return nzVar.J;
        }
        org.telegram.ui.Components.j51 G = x51Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? nzVar.J : i11;
    }
}
