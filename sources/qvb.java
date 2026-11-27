// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public enum qvb extends rwb {
    public qvb() {
        super("Comment", 46);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        rtb rtbVar = bubVar.n;
        char i = ik1Var.i();
        if (i == 0) {
            bubVar.m(this);
            ik1Var.a();
            rtbVar.e.append((char) 65533);
        } else if (i == '-') {
            bubVar.a(rwb.l0);
        } else {
            if (i != 65535) {
                rtbVar.e.append(ik1Var.g('-', 0));
                return;
            }
            bubVar.l(this);
            bubVar.i();
            bubVar.c = rwb.a;
        }
    }
}
