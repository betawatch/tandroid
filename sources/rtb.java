// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum rtb extends rub {
    public rtb() {
        super("CommentEndDash", 47);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        rrb rrbVar = bsbVar.n;
        char d = hl1Var.d();
        qtb qtbVar = rub.k0;
        if (d == 0) {
            bsbVar.m(this);
            StringBuilder sb = rrbVar.e;
            sb.append('-');
            sb.append((char) 65533);
            bsbVar.c = qtbVar;
            return;
        }
        if (d == '-') {
            bsbVar.c = rub.m0;
            return;
        }
        if (d == 65535) {
            bsbVar.l(this);
            bsbVar.i();
            bsbVar.c = rub.a;
        } else {
            StringBuilder sb2 = rrbVar.e;
            sb2.append('-');
            sb2.append(d);
            bsbVar.c = qtbVar;
        }
    }
}
