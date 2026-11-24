// default package

import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class os0 {
    public final /* synthetic */ rs0 a;

    public os0(rs0 rs0Var) {
        this.a = rs0Var;
    }

    public final void a() {
        sy4 sy4Var;
        rs0 rs0Var = this.a;
        ls0 ls0Var = rs0Var.n;
        sy4Var = ((d) rs0Var).glassEngine;
        sy4Var.g();
        su suVar = rs0Var.c;
        if (suVar != null) {
            suVar.invalidate();
        }
        if (rs0Var.s == null) {
            gm.r(ls0Var);
            gm.d3(ls0Var, 300L);
        }
    }
}
