// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum wtb extends rub {
    public wtb() {
        super("BeforeDoctypeName", 51);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        srb srbVar = bsbVar.m;
        boolean o = hl1Var.o();
        xtb xtbVar = rub.q0;
        if (o) {
            srbVar.s();
            bsbVar.c = xtbVar;
            return;
        }
        char d = hl1Var.d();
        if (d == 0) {
            bsbVar.m(this);
            srbVar.s();
            srbVar.e.append((char) 65533);
            bsbVar.c = xtbVar;
            return;
        }
        if (d != ' ') {
            if (d == 65535) {
                bsbVar.l(this);
                srbVar.s();
                bsbVar.j();
                bsbVar.c = rub.a;
                return;
            }
            if (d == '\t' || d == '\n' || d == '\f' || d == '\r') {
                return;
            }
            srbVar.s();
            srbVar.e.append(d);
            bsbVar.c = xtbVar;
        }
    }
}
