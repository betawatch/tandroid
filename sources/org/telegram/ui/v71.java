package org.telegram.ui;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class v71 extends g.o {
    public final /* synthetic */ x71 c;

    public v71(x71 x71Var) {
        this.c = x71Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        x71 x71Var = this.c;
        org.telegram.ui.Components.d00 d00Var = x71Var.X;
        org.telegram.ui.Components.c71 c71Var = x71Var.d0;
        if (c71Var == null) {
            return d00Var.J;
        }
        org.telegram.ui.Components.p61 G = c71Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? d00Var.J : i11;
    }
}
