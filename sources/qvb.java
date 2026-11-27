// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
