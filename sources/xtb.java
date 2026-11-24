// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum xtb extends rub {
    public xtb() {
        super("DoctypeName", 52);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        srb srbVar = bsbVar.m;
        if (hl1Var.o()) {
            srbVar.e.append(hl1Var.e());
            return;
        }
        char d = hl1Var.d();
        if (d == 0) {
            bsbVar.m(this);
            srbVar.e.append((char) 65533);
            return;
        }
        if (d != ' ') {
            msb msbVar = rub.a;
            if (d == '>') {
                bsbVar.j();
                bsbVar.c = msbVar;
                return;
            } else if (d == 65535) {
                bsbVar.l(this);
                bsbVar.j();
                bsbVar.c = msbVar;
                return;
            } else if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                srbVar.e.append(d);
                return;
            }
        }
        bsbVar.c = rub.r0;
    }
}
