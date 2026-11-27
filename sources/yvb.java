// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
