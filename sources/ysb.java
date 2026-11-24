// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum ysb extends rub {
    public ysb() {
        super("ScriptDataDoubleEscapedDash", 29);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        char d = hl1Var.d();
        wsb wsbVar = rub.S;
        if (d == 0) {
            bsbVar.m(this);
            bsbVar.f((char) 65533);
            bsbVar.c = wsbVar;
        } else if (d == '-') {
            bsbVar.f(d);
            bsbVar.c = rub.U;
        } else if (d == '<') {
            bsbVar.f(d);
            bsbVar.c = rub.V;
        } else if (d != 65535) {
            bsbVar.f(d);
            bsbVar.c = wsbVar;
        } else {
            bsbVar.l(this);
            bsbVar.c = rub.a;
        }
    }
}
