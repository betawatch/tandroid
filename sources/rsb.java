// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum rsb extends rub {
    public rsb() {
        super("ScriptDataEscapedDashDash", 23);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        if (hl1Var.j()) {
            bsbVar.l(this);
            bsbVar.c = rub.a;
            return;
        }
        char d = hl1Var.d();
        psb psbVar = rub.L;
        if (d == 0) {
            bsbVar.m(this);
            bsbVar.f((char) 65533);
            bsbVar.c = psbVar;
        } else {
            if (d == '-') {
                bsbVar.f(d);
                return;
            }
            if (d == '<') {
                bsbVar.c = rub.O;
            } else if (d != '>') {
                bsbVar.f(d);
                bsbVar.c = psbVar;
            } else {
                bsbVar.f(d);
                bsbVar.c = rub.f;
            }
        }
    }
}
