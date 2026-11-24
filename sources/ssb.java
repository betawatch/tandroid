// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum ssb extends rub {
    public ssb() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        if (hl1Var.o()) {
            bsbVar.e();
            bsbVar.h.append(hl1Var.i());
            bsbVar.h("<" + hl1Var.i());
            bsbVar.a(rub.R);
            return;
        }
        if (hl1Var.m('/')) {
            bsbVar.e();
            bsbVar.a(rub.P);
        } else {
            bsbVar.f('<');
            bsbVar.c = rub.L;
        }
    }
}
