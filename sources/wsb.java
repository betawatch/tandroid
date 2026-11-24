// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum wsb extends rub {
    public wsb() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        char i = hl1Var.i();
        if (i == 0) {
            bsbVar.m(this);
            hl1Var.a();
            bsbVar.f((char) 65533);
        } else if (i == '-') {
            bsbVar.f(i);
            bsbVar.a(rub.T);
        } else if (i == '<') {
            bsbVar.f(i);
            bsbVar.a(rub.V);
        } else if (i != 65535) {
            bsbVar.h(hl1Var.g('-', '<', 0));
        } else {
            bsbVar.l(this);
            bsbVar.c = rub.a;
        }
    }
}
