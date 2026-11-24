// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum qtb extends rub {
    public qtb() {
        super("Comment", 46);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        rrb rrbVar = bsbVar.n;
        char i = hl1Var.i();
        if (i == 0) {
            bsbVar.m(this);
            hl1Var.a();
            rrbVar.e.append((char) 65533);
        } else if (i == '-') {
            bsbVar.a(rub.l0);
        } else {
            if (i != 65535) {
                rrbVar.e.append(hl1Var.g('-', 0));
                return;
            }
            bsbVar.l(this);
            bsbVar.i();
            bsbVar.c = rub.a;
        }
    }
}
