// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum ytb extends rub {
    public ytb() {
        super("AfterDoctypeName", 53);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        boolean j = hl1Var.j();
        msb msbVar = rub.a;
        if (j) {
            bsbVar.l(this);
            bsbVar.j();
            bsbVar.c = msbVar;
            return;
        }
        if (hl1Var.n('\t', '\n', '\r', '\f', ' ')) {
            hl1Var.a();
            return;
        }
        if (hl1Var.m('>')) {
            bsbVar.j();
            bsbVar.a(msbVar);
        } else if (hl1Var.l("PUBLIC")) {
            bsbVar.c = rub.s0;
        } else if (hl1Var.l("SYSTEM")) {
            bsbVar.c = rub.y0;
        } else {
            bsbVar.m(this);
            bsbVar.a(rub.D0);
        }
    }
}
