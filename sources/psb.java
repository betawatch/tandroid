// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum psb extends rub {
    public psb() {
        super("ScriptDataEscaped", 21);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        if (hl1Var.j()) {
            bsbVar.l(this);
            bsbVar.c = rub.a;
            return;
        }
        char i = hl1Var.i();
        if (i == 0) {
            bsbVar.m(this);
            hl1Var.a();
            bsbVar.f((char) 65533);
        } else if (i == '-') {
            bsbVar.f('-');
            bsbVar.a(rub.M);
        } else if (i != '<') {
            bsbVar.h(hl1Var.g('-', '<', 0));
        } else {
            bsbVar.a(rub.O);
        }
    }
}
