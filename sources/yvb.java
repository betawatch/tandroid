// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public enum yvb extends rwb {
    public yvb() {
        super("AfterDoctypeName", 53);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        boolean j = ik1Var.j();
        mub mubVar = rwb.a;
        if (j) {
            bubVar.l(this);
            bubVar.j();
            bubVar.c = mubVar;
            return;
        }
        if (ik1Var.n('\t', '\n', '\r', '\f', ' ')) {
            ik1Var.a();
            return;
        }
        if (ik1Var.m('>')) {
            bubVar.j();
            bubVar.a(mubVar);
        } else if (ik1Var.l("PUBLIC")) {
            bubVar.c = rwb.s0;
        } else if (ik1Var.l("SYSTEM")) {
            bubVar.c = rwb.y0;
        } else {
            bubVar.m(this);
            bubVar.a(rwb.D0);
        }
    }
}
