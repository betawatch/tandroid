// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum otb extends rub {
    public otb() {
        super("CommentStart", 44);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        rrb rrbVar = bsbVar.n;
        char d = hl1Var.d();
        qtb qtbVar = rub.k0;
        if (d == 0) {
            bsbVar.m(this);
            rrbVar.e.append((char) 65533);
            bsbVar.c = qtbVar;
            return;
        }
        if (d == '-') {
            bsbVar.c = rub.j0;
            return;
        }
        msb msbVar = rub.a;
        if (d == '>') {
            bsbVar.m(this);
            bsbVar.i();
            bsbVar.c = msbVar;
        } else if (d != 65535) {
            rrbVar.e.append(d);
            bsbVar.c = qtbVar;
        } else {
            bsbVar.l(this);
            bsbVar.i();
            bsbVar.c = msbVar;
        }
    }
}
