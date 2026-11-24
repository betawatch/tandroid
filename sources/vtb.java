// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum vtb extends rub {
    public vtb() {
        super("Doctype", 50);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        char d = hl1Var.d();
        wtb wtbVar = rub.p0;
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            bsbVar.c = wtbVar;
            return;
        }
        if (d != '>') {
            if (d != 65535) {
                bsbVar.m(this);
                bsbVar.c = wtbVar;
                return;
            }
            bsbVar.l(this);
        }
        bsbVar.m(this);
        bsbVar.m.s();
        bsbVar.j();
        bsbVar.c = rub.a;
    }
}
