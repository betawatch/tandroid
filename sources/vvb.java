// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public enum vvb extends rwb {
    public vvb() {
        super("Doctype", 50);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        char d = ik1Var.d();
        wvb wvbVar = rwb.p0;
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            bubVar.c = wvbVar;
            return;
        }
        if (d != '>') {
            if (d != 65535) {
                bubVar.m(this);
                bubVar.c = wvbVar;
                return;
            }
            bubVar.l(this);
        }
        bubVar.m(this);
        bubVar.m.s();
        bubVar.j();
        bubVar.c = rwb.a;
    }
}
